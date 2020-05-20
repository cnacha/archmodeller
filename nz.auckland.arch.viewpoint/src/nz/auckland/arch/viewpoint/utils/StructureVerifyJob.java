package nz.auckland.arch.viewpoint.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.emfjson.jackson.module.EMFModule;
import org.emfjson.jackson.resource.JsonResourceFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.Component;
import nz.auckland.arch.Connector;
import nz.auckland.arch.DesignModel;

public class StructureVerifyJob extends Job {
	
	private static String HOSTNAME = "http://localhost:8080";//"http://fasad.cer.auckland.ac.nz:8080";
	
	private DesignModel model;
	
	public StructureVerifyJob(String name, DesignModel model) {
		super(name);
		this.model = model;
	}

	public DesignModel getModel() {
		return model;
	}

	public void setModel(DesignModel model) {
		this.model = model;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		System.out.println("verifyStructure is called: " + model.toString());

		try {
			System.out.println("archsize:" + model.getArchstyle().size());
			System.out.println("ontologylabel:" + model.getOntologylabel().size());

			// convert to JSON
			ObjectMapper mapper = EMFModule.setupDefaultMapper();
			String jsonString = mapper.writeValueAsString(model);
			System.out.println("complete converting ..." + (new Date()).toString());
			//System.out.println(jsonString);
			System.out.println("########################################### ");

			// call web service to verify in OWL
			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpPost request = new HttpPost(
					HOSTNAME+"/nz.auckland.arch.service.owl-0.0.1-SNAPSHOT/api/owl/checkSmell.do");
			StringEntity params = new StringEntity(jsonString);
			request.addHeader("content-type", "application/json");
			request.setEntity(params);
			HttpResponse response = httpClient.execute(request);
			HttpEntity entity = response.getEntity();
			String resString = EntityUtils.toString(entity, "UTF-8");
			//System.out.println(resString);

			// convert response JSON string to model
			DesignModel parsedModel = (DesignModel) loadEObjectFromString(resString, ArchPackage.eINSTANCE);
			
			// update model
			IEditingSession session = SessionUIManager.INSTANCE.getUISessions().iterator().next();
			TransactionalEditingDomain domain = session.getSession().getTransactionalEditingDomain();
			
			RecordingCommand updateCommand = new RecordingCommand(domain) {
				@Override
				protected void doExecute() {
					// synchonise style valid status
					for (int i = 0; i < parsedModel.getArchstyle().size(); i++) {
						model.getArchstyle().get(i).setValid(parsedModel.getArchstyle().get(i).isValid());

						// set invalid to some component type
						for (int j = 0; j < parsedModel.getArchstyle().get(i).getComponenttype().size(); j++) {
							model.getArchstyle().get(i).getComponenttype().get(j)
									.setValid(parsedModel.getArchstyle().get(i).getComponenttype().get(j).isValid());

						}

						// set invalid to some connect type
						for (int j = 0; j < parsedModel.getArchstyle().get(i).getConnectortype().size(); j++) {
							model.getArchstyle().get(i).getConnectortype().get(j)
									.setValid(parsedModel.getArchstyle().get(i).getConnectortype().get(j).isValid());

						}
					}
					
					// synchonise instance valid status for components
					for (int i = 0; i < parsedModel.getComponent().size(); i++) {
						model.getComponent().get(i).setValid(parsedModel.getComponent().get(i).isValid());
						for(int j = 0; j < parsedModel.getComponent().get(i).getPort().size(); j++) {
							model.getComponent().get(i).getPort().get(j).setValid(parsedModel.getComponent().get(i).getPort().get(j).isValid());
						}
					}
					
					// synchonise instance valid status for connectors
					for (int i = 0; i < parsedModel.getConnector().size(); i++) {
						Connector cnn = parsedModel.getConnector().get(i);
						model.getConnector().get(i).setValid(parsedModel.getConnector().get(i).isValid());
						for (int j = 0; j < parsedModel.getConnector().get(i).getRole().size(); j++) {
							model.getConnector().get(i).getRole().get(j).setType(cnn.getRole().get(j).getType());
						}
					}


					
					// set inferred type for component
					for (int i = 0; i < parsedModel.getComponent().size(); i++) {
						Component cmp = parsedModel.getComponent().get(i);
						model.getComponent().get(i).setType(cmp.getType());
						// System.out.println("comp name: "+cmp.getName()+" type:"+cmp.getType());

						// set inferred type for port
						for (int j = 0; j < parsedModel.getComponent().get(i).getPort().size(); j++) {
							model.getComponent().get(i).getPort().get(j).setType(cmp.getPort().get(j).getType());
						}

					}
					
					// set inferred type for connector
					for (int i = 0; i < parsedModel.getConnector().size(); i++) {
						Connector cnn = parsedModel.getConnector().get(i);
						model.getConnector().get(i).setType(cnn.getType());
					}

				}
			};
			domain.getCommandStack().execute(updateCommand);
			
			//model = parsedModel;

		} catch (Exception e) {
			System.out.println("error....");
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		}

		return Status.OK_STATUS;
	}

	private EObject loadEObjectFromString(String modelStr, EPackage ePackage) throws IOException {
		System.out.println("Parsing JSON to EObject");
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new JsonResourceFactory());

		resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
		Resource resource = resourceSet.createResource(URI.createURI("data.json"));
		ByteArrayInputStream stream = new ByteArrayInputStream(modelStr.getBytes(StandardCharsets.UTF_8));
		resource.load(stream, null);
		return resource.getContents().get(0);
	}
	

}

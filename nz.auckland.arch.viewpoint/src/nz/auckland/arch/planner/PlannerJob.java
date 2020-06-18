package nz.auckland.arch.planner;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.emfjson.jackson.annotations.EcoreIdentityInfo;
import org.emfjson.jackson.module.EMFModule;
import org.emfjson.jackson.resource.JsonResourceFactory;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import nz.auckland.arch.ArchFactory;
import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.Component;
import nz.auckland.arch.Connector;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.InterimModel;
import nz.auckland.arch.MigrationModel;
import nz.auckland.arch.impl.ArchFactoryImpl;
import nz.auckland.arch.planner.action.DeployServiceAction;
import nz.auckland.arch.planner.action.NetworkRouteAction;
import nz.auckland.arch.planner.action.SetupDatabaseAction;
import nz.auckland.arch.planner.object.Action;
import nz.auckland.arch.planner.object.MigrationRequest;
import nz.auckland.arch.planner.object.Parameter;
import nz.auckland.arch.planner.object.Plan;

public class PlannerJob extends Job {

	private static String HOSTNAME = "http://localhost:8080";// "http://fasad.cer.auckland.ac.nz:8080";

	private MigrationModel model;

	public PlannerJob(String name, MigrationModel model) {
		super(name);
		this.model = model;
	}

	public MigrationModel getModel() {
		return model;
	}

	public void setModel(MigrationModel model) {
		this.model = model;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		System.out.println("verifyStructure is called: " + model.toString());
		// update model
		IEditingSession session = SessionUIManager.INSTANCE.getUISessions().iterator().next();
		TransactionalEditingDomain domain = null;

		try {
			System.out.println("source:" + model.getSource().getComponent().size());
			System.out.println("target:" + model.getTarget().getComponent().size());

			// convert to JSON
			EMFModule module = new EMFModule();
			module.configure(EMFModule.Feature.OPTION_USE_ID, true);
			module.configure(EMFModule.Feature.OPTION_SERIALIZE_TYPE, true);
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
			mapper.registerModule(module);
			MigrationRequest requestBody = new MigrationRequest();
			requestBody.setSource(mapper.writeValueAsString(model.getSource()));
			requestBody.setTarget(mapper.writeValueAsString(model.getTarget()));

			GsonBuilder builder = new GsonBuilder();
			Gson gson = builder.create();

			String jsonString = gson.toJson(requestBody);
			System.out.println("complete converting ..." + (new Date()).toString());
			System.out.println(jsonString);
			System.out.println("############# Response ################## ");

			// call web service to verify in OWL
			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpPost request = new HttpPost(
					HOSTNAME + "/nz.auckland.arch.service.owl-0.0.1-SNAPSHOT/api/owl/planMigration.do");
			StringEntity params = new StringEntity(jsonString);
			request.addHeader("content-type", "application/json");
			request.setEntity(params);
			HttpResponse response = httpClient.execute(request);
			HttpEntity entity = response.getEntity();
			String resString = EntityUtils.toString(entity, "UTF-8");
			// System.out.println(resString);

			// parse migration to object

			Plan migrationPlan = gson.fromJson(resString, Plan.class);

			// process plan

			System.out.println("found Step:" + migrationPlan.getStepCount());

			domain = session.getSession().getTransactionalEditingDomain();

			RecordingCommand updateCommand = new RecordingCommand(domain) {
				@Override
				protected void doExecute() {
					model.getInterimmodels().clear();
					AbstractActionExecutioner act = null;
					// initial first model to source model
					DesignModel baseModel = model.getSource();
					InterimModel prevModel = null;
					for (Action action : migrationPlan.getSteps()) {
						System.out.println("=====================================================");
						System.out.println("process " + action.getId() + "-" + action.getName());

						if ("deploy-service".equals(action.getName())) {
							act = new DeployServiceAction(baseModel, action, model);
						} else if ("setup-database".equals(action.getName())) {
							act = new SetupDatabaseAction(baseModel, action, model);
						} else if ("network-route".equals(action.getName())) {
							act = new NetworkRouteAction(baseModel, action, model);
						}

						if (act != null) {
							// run action
							baseModel = act.run();
							if (prevModel != null) {
								prevModel.setNextModel(act.getIntModel());
							}
							// set previous model
							prevModel = act.getIntModel();
							// reset action for next move
							act = null;
						}

					} // end for actions
				}

			};
			
			domain.getCommandStack().execute(updateCommand);

		} catch (Exception e) {
			System.out.println("error....");
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		} finally {
//			if(domain!=null) {
//				domain.dispose();
//			}
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

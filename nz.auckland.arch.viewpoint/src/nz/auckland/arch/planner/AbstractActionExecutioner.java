package nz.auckland.arch.planner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import nz.auckland.arch.ArchFactory;
import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.ArchStyle;
import nz.auckland.arch.BehaviourProperty;
import nz.auckland.arch.Component;
import nz.auckland.arch.ConnectorType;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.InterimModel;
import nz.auckland.arch.MigrationModel;
import nz.auckland.arch.Port;
import nz.auckland.arch.VerificationProperty;
import nz.auckland.arch.impl.ArchFactoryImpl;
import nz.auckland.arch.planner.object.Action;

public abstract class AbstractActionExecutioner {

	private final String targetModelFile = "target.arch";
	protected DesignModel currentModel;
	protected DesignModel targetModel;
	protected DesignModel interModel;
	protected Action action;
	protected String description;
	protected MigrationModel migrationModel;
	protected InterimModel intModel;

	public AbstractActionExecutioner(DesignModel currentModel, Action action, MigrationModel migrationModel) {
		super();
		this.currentModel = currentModel;
		this.targetModel = migrationModel.getTarget();
		this.action = action;
		this.migrationModel =  migrationModel;
	}

	public abstract DesignModel run();

	protected DesignModel loadTargetModel() {

		File file = new File(getProjectPath() + "/" + targetModelFile);
		ResourceSet rs = new ResourceSetImpl();
		rs.getPackageRegistry().put(ArchPackage.eNS_URI, ArchPackage.eINSTANCE);
		Registry r = rs.getResourceFactoryRegistry();
		Map<String, Object> m = r.getExtensionToFactoryMap();
		m.put("arch", new XMIResourceFactoryImpl());
		URI uri = URI.createFileURI(file.getAbsolutePath());
		Resource resource = rs.getResource(uri, true);
		System.out.println(resource.getContents());
		if (resource.getContents().size() > 0) {
			return (DesignModel) resource.getContents().get(0);
		}
		return null;
	}

	protected String getProjectPath() {
		System.out.println("currentModel :"+currentModel.eResource());
		String modelFilePath = currentModel.eResource().getURI().path();
		modelFilePath = modelFilePath.substring(0, modelFilePath.lastIndexOf("/"));
		System.out.println("modelFilePath :"+modelFilePath);
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		String folderPath = workspace.getRoot()
				.getProject(modelFilePath.substring(modelFilePath.lastIndexOf("/")+1)).getLocation().toString();
		return folderPath;
	}
	


	protected DesignModel writeModel(DesignModel model) {
		
		// add to migration model
		ArchFactory factory = ArchFactoryImpl.init();
	
		intModel = factory.createInterimModel();
		intModel.setDesignmodel(model);
		intModel.setName(this.action.getName());
		intModel.setDescription(description);
		intModel.setStep(this.action.getId());
		migrationModel.getInterimmodels().add(intModel);
		/*
		try {
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("key", new XMIResourceFactoryImpl());
			ResourceSet resSet = new ResourceSetImpl();

			Resource resource = resSet
					.createResource(URI.createFileURI(getProjectPath() + "/" + model.getName() + ".arch"));
			System.out.println("	writing model to " + resource.getURI().path());
			resource.getContents().add(model);

			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		return model;
	}
	
	protected List<VerificationProperty> findBehaviourPropertiesByConnector(DesignModel model, String connName) {
		List<VerificationProperty> result = new ArrayList<VerificationProperty>();
		for(VerificationProperty prop: model.getVerifyProperty()) {
			if(prop instanceof BehaviourProperty) {
				BehaviourProperty bprop = (BehaviourProperty)prop;
				if(bprop.getConnector()!=null && connName.equals(bprop.getConnector().getName())) {
					result.add(bprop);
				}
			}
		}
		return result;
	}
	
	protected void copyVerificationProperty(DesignModel srcModel, DesignModel dstModel) {
		for(VerificationProperty prop: srcModel.getVerifyProperty()) {
			if(prop instanceof BehaviourProperty) {
				if(!this.isVerificationPropertyExisted(dstModel, prop.getName())){
					BehaviourProperty newprop = (BehaviourProperty)EcoreUtil.copy(prop);
					newprop.setTestport(findPortByName(srcModel,  ((BehaviourProperty)prop).getTestport().getName()));
					dstModel.getVerifyProperty().add(newprop);
				}
				
			}
		}
	}
	
	protected Port findPortByName(DesignModel model, String portName) {
		for(Component comp: model.getComponent()) {
			for(Port port: comp.getPort()) {
				if(port.getName().equals(portName))
					return port;
			}
		}
		return null;
	}
	
	
	protected boolean isVerificationPropertyExisted(DesignModel model, String propName) {
		for(VerificationProperty prop: model.getVerifyProperty()) {
			if(prop.getName().equals(propName)) {
				return true;
			}
		}
		return false;
	}
	
	protected ConnectorType getConnectorType(String connType) {
		for(ArchStyle style: interModel.getArchstyle()) {
			for(ConnectorType typ: style.getConnectortype()) {
				if(typ.getName().equals(connType))
					return typ;
			}
		}
		return null;
	}

	protected DesignModel addComponent(DesignModel interModel, String compName) {
		System.out.println("	add component:"+compName);
		// check if current model has this component
		boolean isCompExist = false;
		for (Component comp : interModel.getComponent()) {
			if (comp.getName().equalsIgnoreCase(compName)) {
				isCompExist = true;
				break;
			}
		}

		// if component is new and never existed in the current model, add it to the model
		if (!isCompExist) {

			// find component in the target model
			for (Component comp : targetModel.getComponent()) {
				if (comp.getName().equalsIgnoreCase(compName)) {
					System.out.println("	found component in target to added: "+comp.getName());
					// add copy component and add it to intermediate model
					Component compToAdd = EcoreUtil.copy(comp);
					// reset role for port
					for(Port prt: compToAdd.getPort()) {
						prt.getRole().clear();
					}
					interModel.getComponent().add(compToAdd);
					break;
				}
			}
		}
		
		return interModel;

	}

	public MigrationModel getMigrationModel() {
		return migrationModel;
	}

	public void setMigrationModel(MigrationModel migrationModel) {
		this.migrationModel = migrationModel;
	}

	public InterimModel getIntModel() {
		return intModel;
	}

	public void setIntModel(InterimModel intModel) {
		this.intModel = intModel;
	}
	
	
}

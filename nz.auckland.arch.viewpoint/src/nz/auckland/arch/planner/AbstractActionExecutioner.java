package nz.auckland.arch.planner;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
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

import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.Component;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.Port;
import nz.auckland.arch.planner.object.Action;

public abstract class AbstractActionExecutioner {

	private final String targetModelFile = "target.arch";
	protected DesignModel currentModel;
	protected DesignModel targetModel;
	protected DesignModel interModel;
	protected Action action;

	public AbstractActionExecutioner(DesignModel currentModel, Action action) {
		super();
		this.currentModel = currentModel;
		this.targetModel = loadTargetModel();
		this.action = action;
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
		System.out.println("currentModel :"+currentModel.eResource().getURI().path());
		String modelFilePath = currentModel.eResource().getURI().path();
		modelFilePath = modelFilePath.substring(0, modelFilePath.lastIndexOf("/"));
		System.out.println("modelFilePath :"+modelFilePath);
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		String folderPath = workspace.getRoot()
				.getProject(modelFilePath.substring(modelFilePath.lastIndexOf("/")+1)).getLocation().toString();
		return folderPath;
	}

	protected DesignModel writeModel(DesignModel model) {
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
		return model;
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
}

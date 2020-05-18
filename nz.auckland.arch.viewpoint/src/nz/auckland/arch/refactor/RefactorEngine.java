package nz.auckland.arch.refactor;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import nz.auckland.arch.DesignModel;

public class RefactorEngine {

	private static final String fileName = "target.arch";

	public void start(DesignModel model) {
		System.out.println("Refactoring starts");

		// retreive folder path for target model file
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		File workspaceDirectory = workspace.getRoot().getLocation().toFile();
		String modelFilePath = model.eResource().getURI().toPlatformString(true);
		String folderPath = workspaceDirectory.getAbsolutePath()
				+ modelFilePath.substring(0, modelFilePath.lastIndexOf("/") + 1);
		// System.out.println("..."+modelFilePath.substring(modelFilePath.lastIndexOf("/")));

		// copy model
		DesignModel targetModel = EcoreUtil.copy(model);

		targetModel.setName("target");

		// initialise engine for refactor rules
		List<AbstractRefactor> ruleList = new ArrayList<AbstractRefactor>();
		ruleList.add(new EventCentreRefactor(targetModel));
		ruleList.add(new EventCommandRefactor(targetModel));
		ruleList.add(new EventQueryRefactor(targetModel));
		ruleList.add(new SecureReadWriteRefactor(targetModel));
		try {
			// run all rules
			for (AbstractRefactor rule : ruleList) {
				rule.run();
			}

			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("key", new XMIResourceFactoryImpl());
			ResourceSet resSet = new ResourceSetImpl();

			Resource resource = resSet.createResource(URI.createFileURI(folderPath + fileName));
			System.out.println(resource.getURI().toFileString());
			System.out.println("writing model to " + resource.getURI().path());
			resource.getContents().add(targetModel);
			resource.save(Collections.EMPTY_MAP);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Refactoring ends");
	}
}

package nz.auckland.arch.refactor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Properties;

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
import nz.auckland.arch.viewpoint.utils.SequencedProperties;

public class RefactorEngine {

	private static final String fileName = "target.arch";
	private static final String propFileName = "refactor.properties";

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

		
		// read properties file
		SequencedProperties prop = new SequencedProperties();

		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
		try {
			if (inputStream != null) {

				prop.load(inputStream);

			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
			for(Object key:prop.keySet()) {
				String clsName = (String)prop.get(key);
				System.out.println("Executing "+clsName);
				// create the class to run
				Class<?> c = Class.forName(clsName);
				
				// run rule class
				Constructor<?> cons = c.getConstructor(DesignModel.class);
				c.getMethod("run").invoke(cons.newInstance(targetModel));
				
			}

			// save to target model file
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

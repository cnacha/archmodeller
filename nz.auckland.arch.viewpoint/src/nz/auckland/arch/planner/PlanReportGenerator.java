package nz.auckland.arch.planner;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;

import nz.auckland.arch.BehaviourProperty;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.InterimModel;
import nz.auckland.arch.MigrationModel;
import nz.auckland.arch.VerificationProperty;

public class PlanReportGenerator {
	private MigrationModel model;

	public PlanReportGenerator(MigrationModel model) {
		this.model = model;
	}
	
	public void run() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		String modelFilePath = model.eResource().getURI().toPlatformString(true);
		String folderPath = workspace.getRoot().getProject(modelFilePath.substring(0, modelFilePath.lastIndexOf("/") + 1)).getLocation().toString();
		System.out.println("	ReportFilePath: "+folderPath);
		PrintWriter printWriter = null;
		try(FileWriter fileWriter = new FileWriter(folderPath+"/"+modelFilePath.substring(modelFilePath.lastIndexOf("/") + 1)+"-report.csv");) {
		    printWriter = new PrintWriter(fileWriter);
		    printWriter.append("model,valid,desc");
		    for(VerificationProperty prop: model.getTarget().getVerifyProperty()) {
	    		printWriter.append(","+prop.getName()+".valid,"+prop.getName()+".states,"+prop.getName()+".times");
	    	}
		    printWriter.append("\n");
		    // loop through interim model
		    for(InterimModel intModel : model.getInterimmodels()) {
		    	printWriter.append(intModel.getStep()+","+intModel.isIsStable()+","+intModel.getDescription());
		    	// loop thorough properties
		    	for(VerificationProperty prop: model.getTarget().getVerifyProperty()) {
		    		BehaviourProperty bevprop = findPropByName(intModel.getDesignmodel(), prop.getName());
		    		if(bevprop!=null) {
		    			printWriter.append(","+bevprop.isValid()+","+bevprop.getVisitedStates()+","+bevprop.getVerifyTime());
		    		}else {
		    			printWriter.append(",,,");
		    		}
		    		
		    	}
		    	printWriter.append("\n");
		    } // end loop model
		    
		   
		    printWriter.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
	
	public BehaviourProperty findPropByName(DesignModel dmodel, String name) {
		for(VerificationProperty prop: dmodel.getVerifyProperty()) {
			if(prop.getName().equals(name))
				return (BehaviourProperty)prop;
		}
		return null;
	}
}

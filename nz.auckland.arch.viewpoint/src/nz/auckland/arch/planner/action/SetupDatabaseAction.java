package nz.auckland.arch.planner.action;

import org.eclipse.emf.ecore.util.EcoreUtil;

import nz.auckland.arch.Component;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.planner.AbstractActionExecutioner;
import nz.auckland.arch.planner.object.Action;
import nz.auckland.arch.planner.object.Parameter;

public class SetupDatabaseAction extends AbstractActionExecutioner{

	

	public SetupDatabaseAction(DesignModel currentModel, Action action) {
		super(currentModel, action);
	}

	@Override
	public DesignModel run() {
		System.out.println("	SetupDatabaseAction starts...");
		Parameter serviceParam = action.getParameter("datastore");
		if(serviceParam!=null) {
			// create intermediate model
			DesignModel interModel = EcoreUtil.copy(currentModel);
			interModel.setName("inter"+action.getId());
			
			// add component to intermediate model, if not existed
			System.out.println("model size: "+interModel.getComponent().size());
			interModel = addComponent(interModel, serviceParam.getValue());
			System.out.println("model size: "+interModel.getComponent().size());
			// write model to the file
			interModel = this.writeModel(interModel);
			return interModel;
		}
		return currentModel;
		
	}


}

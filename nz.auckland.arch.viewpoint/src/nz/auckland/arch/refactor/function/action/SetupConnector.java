package nz.auckland.arch.refactor.function.action;

import org.eclipse.emf.ecore.util.EcoreUtil;

import nz.auckland.arch.ArchFactory;
import nz.auckland.arch.Component;
import nz.auckland.arch.Connector;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.Event;
import nz.auckland.arch.Port;
import nz.auckland.arch.RefactorPart;
import nz.auckland.arch.Role;
import nz.auckland.arch.impl.ArchFactoryImpl;
import nz.auckland.arch.planner.object.Action;
import nz.auckland.arch.planner.object.Plan;
import nz.auckland.arch.refactor.AbstractRefactor;
import nz.auckland.arch.refactor.function.RefactorPDDLDescription;
import nz.auckland.arch.refactor.function.RefactorPredicate;

public class SetupConnector extends AbstractRefactor {

	private Action action;
	private Plan refactorPlan;

	public SetupConnector(DesignModel model, Plan refactorPlan, Action action) {
		super(model);
		this.action = action;
		this.refactorPlan = refactorPlan;
	}

	@Override
	public DesignModel run() {
		System.out.println("		SetupConnector is running");
		ArchFactory factory = ArchFactoryImpl.init();
		
		
		// add connector to target model
		String connName = action.getParameter("connector").getValue();
		Connector connector = factory.createConnector();
		
		connector.setName(connName);
		
		//find role in init predicate
		for(RefactorPredicate pred: refactorPlan.getRefdesc().getInitPredList()){
//			System.out.println(" 		looping in "+pred.getAction() +" "+pred.getParameters().get(0));
			if(pred.getAction().equals("hasrole") 
					&& pred.getParameters().get(0).equalsIgnoreCase(connName)) {
				
				String roleName = pred.getParameters().get(1);
				System.out.println("adding role "+roleName.substring(0, roleName.indexOf("-"))+"#"+connName.substring(0, connName.indexOf(RefactorPDDLDescription.REFACTOR_POSTFIX_STR)));
				
				//create port
//				Role role = factory.createRole();
//				role.setName(roleName);
				
				//fetch role from reference model.
				System.out.println(" connName:"+connName+" roleName:"+roleName);
				Role refRole = this.findRoleByName(refactorPlan.getPart().getReference(),
						connName.substring(0, connName.indexOf(RefactorPDDLDescription.REFACTOR_POSTFIX_STR)) ,
						roleName.substring(0, roleName.indexOf("-")));
				
				if(refRole!=null) {
					// add copied role to the connector
					Role role = EcoreUtil.copy(refRole);
					role.setConnector(connector);
					connector.getRole().add(role);
				}
				
			}
		}
		
		model.getConnector().add(connector);
		
		
		
		return model;
	}

	
	

}

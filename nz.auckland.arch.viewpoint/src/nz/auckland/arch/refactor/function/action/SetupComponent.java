package nz.auckland.arch.refactor.function.action;

import org.eclipse.emf.ecore.util.EcoreUtil;

import nz.auckland.arch.ArchFactory;
import nz.auckland.arch.Component;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.Event;
import nz.auckland.arch.Port;
import nz.auckland.arch.RefactorPart;
import nz.auckland.arch.impl.ArchFactoryImpl;
import nz.auckland.arch.planner.object.Action;
import nz.auckland.arch.planner.object.Plan;
import nz.auckland.arch.refactor.AbstractRefactor;
import nz.auckland.arch.refactor.function.RefactorPDDLDescription;
import nz.auckland.arch.refactor.function.RefactorPredicate;

public class SetupComponent extends AbstractRefactor {

	private Action action;
	private Plan refactorPlan;

	public SetupComponent(DesignModel model, Plan refactorPlan, Action action) {
		super(model);
		this.action = action;
		this.refactorPlan = refactorPlan;
	}

	@Override
	public DesignModel run() {
//		System.out.println("		SetupComponent is called");
		ArchFactory factory = ArchFactoryImpl.init();

		// add component to target model
		String compName = action.getParameter("component").getValue();
		Component component = this.findComponentByName(compName);
		if(component==null) {
			component = factory.createComponent();
			component.setName(compName);
		}
		
		//find port in init predicate
		for(RefactorPredicate pred: refactorPlan.getRefdesc().getInitPredList()){
//			System.out.println(" 		looping in "+pred.getAction() +" "+pred.getParameters().get(0));
			if(pred.getAction().equals("hasport") 
					&& pred.getParameters().get(0).equalsIgnoreCase(compName)) {
				
				String portName = pred.getParameters().get(1);
				System.out.println("adding port "+portName);
				
				//create port
				Port port = this.findPortByName(model, compName, portName);
				if(port == null) {
					port = factory.createPort();
					port.setName(portName);
					component.getPort().add(port);
				}
				
				//fetch events from reference model.
				Port refPort = this.findPortByName(refactorPlan.getPart().getReference(),
						compName.substring(0, compName.indexOf(RefactorPDDLDescription.REFACTOR_POSTFIX_STR)), 
						portName.substring(0, portName.indexOf(RefactorPDDLDescription.REFACTOR_POSTFIX_STR)));
				//System.out.println("finding port "+portName.substring(0, portName.indexOf("-"))+" in reference model: "+refPort);
				if(refPort!=null) {
					// add events to the port
					port.getEvents().addAll(EcoreUtil.copyAll(refPort.getEvents()));
						
				}
				
			}
		}
		
		model.getComponent().add(component);
		
		
		
		return model;
	}

	
	

}

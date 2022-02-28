package nz.auckland.arch.refactor.function.action;

import java.util.List;

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

public class LinkConnection extends AbstractRefactor {

	private Action action;
	private Plan refactorPlan;
	public static final String LINK_LABEL = "tolink";

	public LinkConnection(DesignModel model, Plan refactorPlan, Action action) {
		super(model);
		this.action = action;
		this.refactorPlan = refactorPlan;
	}

	@Override
	public DesignModel run() {
		System.out.println("	LinkConnection is called");
		ArchFactory factory = ArchFactoryImpl.init();

		// fetch parameter to target model
		String compName = action.getParameter("component").getValue();
		String connName = action.getParameter("connector").getValue();
		String portName = action.getParameter("port").getValue();
		String roleName = action.getParameter("role").getValue();
		
		System.out.println("	"+compName+"."+portName+"<->"+connName+"."+roleName.substring(0, roleName.indexOf("-")));
		// find port and role
		Role addingRole = this.findRoleByName(model, connName, roleName.substring(0, roleName.indexOf("-")));
		
		Port attachingPort = this.findPortByName(model, compName, portName);
		
		// check if the port does not exist, create port from refmodel
		if(attachingPort ==null && addingRole!=null) {
			//create port
			attachingPort = factory.createPort();
			attachingPort.setName(portName);
			Component comp = this.findComponentByName(compName);
			comp.getPort().add(attachingPort);
			
			// find connector in reference model
			Connector refConn = this.findConnectorByName(refactorPlan.getPart().getReference(), connName.substring(0, connName.indexOf(RefactorPDDLDescription.REFACTOR_POSTFIX_STR)));
			Role refRole = null;
			for(Role r: refConn.getRole()) {
				if(r.getName().equalsIgnoreCase(roleName.substring(0, roleName.indexOf("-"))))
					refRole = r;
			}
			//add event to port from reference model
			Port refPort = this.findPortByAttachedRole(refactorPlan.getPart().getReference(),refRole);
			attachingPort.getEvents().addAll(EcoreUtil.copyAll(refPort.getEvents()));
		}
		
		System.out.println("		role:"+addingRole+"-port:"+attachingPort);
		
		if(addingRole!=null && attachingPort!=null) {
			addingRole.setType(LINK_LABEL);
			// link port and role
			System.out.println("	replacing role:"+addingRole.toString());
			attachingPort.getRole().add(addingRole);
			// find the role to remove
			for(int i=0;i< attachingPort.getRole().size();i++) {
				Role attachedRole = attachingPort.getRole().get(i);
				if(attachedRole.getName().contains(RemoveConnector.REMOVE_LABEL)) {
					System.out.println("	found role to replace:"+attachedRole.getName());
					// replace to-remove role with the adding role.
					attachingPort.getRole().remove(i);
					attachingPort.getRole().set(i, addingRole);
					addingRole.setNextRoleExpr(attachedRole.getNextRoleExpr());
					// link next
					for(Role r: attachingPort.getRole()) {
						if(r.getNextRoleExpr() == attachedRole)
							r.setNextRoleExpr(addingRole);
					}
					
					break;
				} 
				
			}
			
		}
		
		return model;
	}
	
//	private Role findHead(List<Role> role) {
//		for(Role slowattachedRole: role) {
//			boolean isHead = true;
//			for(Role fastattachedRole:  role) {
//				if(slowattachedRole!=fastattachedRole && slowattachedRole==fastattachedRole.getNextRoleExpr()) {
//					isHead = false; // found it is not head
//					break;
//				}
//			}
//			if(isHead) {
//				return slowattachedRole;
//			}
//		}
//		return role.get(role.size()-1);
//	}

	
	

}

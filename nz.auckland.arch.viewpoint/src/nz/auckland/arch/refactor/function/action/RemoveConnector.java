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
import nz.auckland.arch.refactor.function.RefactorPredicate;

public class RemoveConnector extends AbstractRefactor {

	private Action action;
	private Plan refactorPlan;
	public static final String REMOVE_LABEL = "toremove";

	public RemoveConnector(DesignModel model, Plan refactorPlan, Action action) {
		super(model);
		this.action = action;
		this.refactorPlan = refactorPlan;
	}

	@Override
	public DesignModel run() {
		System.out.println("	RemoveConnector is called");
		ArchFactory factory = ArchFactoryImpl.init();

		// fetch parameter to target model
		String connName = action.getParameter("connector").getValue();
		
		// manage associated port, reshuffle the port
		Connector conn = this.findConnectorByName(connName);
		conn.setName(connName+REMOVE_LABEL);
		for(Role roletoRemove: conn.getRole()) {
			// detach associated port from role
			Port port = this.findPortByAttachedRole(roletoRemove);
			//port.getRole().remove(role);  // we don't remove it just mark it to be removed
			roletoRemove.setName(roletoRemove.getName()+REMOVE_LABEL);
			
			// find port that role is attached and replace the role to be linked
			Role roleToLink = null;
			Port attachingPort = this.findPortByAttachedRole(roletoRemove);
			for(Role attachedRole: attachingPort.getRole()) {
				// find role to link and reroute them
				if(attachedRole.getType().contains(LinkConnection.LINK_LABEL)) {
					System.out.println("		found role to linked:"+attachedRole);
					attachedRole.setNextRoleExpr(roletoRemove.getNextRoleExpr());
					roletoRemove.setNextRoleExpr(null);
					roleToLink = attachedRole;
				}
				
			}
			// find the role that still next to the removed role
			for(Role attachedRole: attachingPort.getRole()) {
				if(attachedRole.getNextRoleExpr() == roletoRemove) {
					attachedRole.setNextRoleExpr(roleToLink);
				}
			}
			attachingPort.getRole().remove(roletoRemove);
		}
		
		// remove connector and associated roles
		
		
		return model;
	}

	
	

}

package nz.auckland.arch.refactor.rule;

import java.util.HashMap;
import java.util.Map;

import nz.auckland.arch.ArchFactory;
import nz.auckland.arch.Component;
import nz.auckland.arch.Connector;
import nz.auckland.arch.ConnectorType;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.Port;
import nz.auckland.arch.Role;
import nz.auckland.arch.RoleType;
import nz.auckland.arch.impl.ArchFactoryImpl;
import nz.auckland.arch.refactor.AbstractRefactor;

public class EventCentreRefactor extends AbstractRefactor {
	/***
	 * 
	 * Mapping publisher -> eventpublisher subscriber -> eventsubscriber
	 */
	private static final String ruleName = "RuleEventCentre";
	private static final String eventSourcingConnStr = "ESConnector";

	public EventCentreRefactor(DesignModel model) {
		super(model);
	}

	@Override
	public DesignModel run() {

		ArchFactory factory = ArchFactoryImpl.init();

		for (Connector conn : model.getConnector()) {
			if (conn.getType().indexOf(ruleName) != -1) {

				// found connector to refactor, convert it to ESConnector
				System.out.println("...found a connector to refactor: " + conn.getName());
				this.convertConnector(conn);

				// add eventstore component
				Component eventStoreComp = factory.createComponent();
				eventStoreComp
						.setName(conn.getName().substring(0, 1).toUpperCase() + conn.getName().substring(1) + "Log");
				model.getComponent().add(eventStoreComp);

				// add eventstore port
				Port logPort = factory.createPort();
				logPort.setName("log" + conn.getName().toLowerCase());
				eventStoreComp.getPort().add(logPort);

				// attach eventstore port to role
				logPort.getRole().add(eventStoreRole);
			}
		}

		return model;
	}
	
	protected Role eventStoreRole;

	protected void convertConnector(Connector conn) {
		ArchFactory factory = ArchFactoryImpl.init();
		
		// find connectortype
		ConnectorType targetConnType = this.findConnectorType(eventSourcingConnStr);
		// setup role mapping
		HashMap<RoleType, RoleType> roleMap = new HashMap<RoleType, RoleType>();
		roleMap.put(findRoleType("PSConnector", "publisher"), findRoleType(eventSourcingConnStr, "eventpublisher"));
		roleMap.put(findRoleType("PSConnector", "subscriber"), findRoleType(eventSourcingConnStr, "eventsubscriber"));
		super.changeConnectorType(conn, targetConnType, roleMap);
		
		// add eventstore role to the connector
	    eventStoreRole = factory.createRole();
		eventStoreRole.setName("eventstore");
		eventStoreRole.setRoletype(findRoleType(eventSourcingConnStr, "eventstore"));
		eventStoreRole.setConnector(conn);
		conn.getRole().add(eventStoreRole);
		
	}
	
	

}

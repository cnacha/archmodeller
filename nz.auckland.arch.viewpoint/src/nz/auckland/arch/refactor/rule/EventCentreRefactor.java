package nz.auckland.arch.refactor.rule;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nz.auckland.arch.ArchFactory;
import nz.auckland.arch.BehaviourProperty;
import nz.auckland.arch.Component;
import nz.auckland.arch.Connector;
import nz.auckland.arch.ConnectorType;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.Event;
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
				Event loggedEvent = factory.createEvent();
				loggedEvent.setName("logged");
				logPort.getEvents().add(loggedEvent);
				eventStoreComp.getPort().add(logPort);

				// attach eventstore port to role
				logPort.getRole().add(eventStoreRole);
				
				// add architectural constrainst property to check
				BehaviourProperty property = factory.createBehaviourProperty();
				property.setName("event-centre-"+conn.getName());
				property.setConnector(conn);
				// find event publisher
				HashMap<Component,Port> comps = this.findComponentByConnectorRoleName(conn.getName(), "eventpublisher");
				
				if(comps.size()>0) {
					Map.Entry<Component, Port> entry = (Map.Entry<Component, Port>)comps.entrySet().toArray()[0];
					property.setExprText("[] ("+entry.getKey().getName()+"."+entry.getValue().getName()+"."+entry.getValue().getEvents().get(0).getName()
							+"-> <> "+eventStoreComp.getName()+"."+conn.getName()+".eventstore.persist)");
				}
				
				model.getVerifyProperty().add(property);
				
				
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

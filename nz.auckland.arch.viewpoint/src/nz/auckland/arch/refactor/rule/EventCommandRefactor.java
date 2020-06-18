package nz.auckland.arch.refactor.rule;

import java.util.HashMap;
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

public class EventCommandRefactor extends AbstractRefactor {

	private static final String ruleName = "RuleEventCommand";
	private static final String repConnStr = "CRConnector";

	public EventCommandRefactor(DesignModel model) {
		super(model);
	}

	@Override
	public DesignModel run() {
		// find connectortype
		ConnectorType targetConnType = this.findConnectorType(repConnStr);
		// setup role mapping
		HashMap<RoleType, RoleType> roleMap = new HashMap<RoleType, RoleType>();
		roleMap.put(findRoleType("WRConnector", "writestorage"), findRoleType(repConnStr, "readstore"));
		roleMap.put(findRoleType("WRConnector", "writer"), findRoleType(repConnStr, "commander"));

		ArchFactory factory = ArchFactoryImpl.init();

		for (Connector conn : model.getConnector()) {
			if (conn.getType().indexOf(ruleName) != -1) {
				// found connector to refactor, convert it to CRConnector for CQRS pattern
				System.out.println("...found a connector to refactor: "+conn.getName());
				this.changeConnectorType(conn, targetConnType, roleMap);
				
				// add commandstore role to the connector
				Role commandStoreRole = factory.createRole();
				commandStoreRole.setName("commandstore");
				commandStoreRole.setRoletype(findRoleType(repConnStr,"commandstore"));
				commandStoreRole.setConnector(conn);
				conn.getRole().add(commandStoreRole);
				
				// add commandstore component
				Component commandStoreComp = factory.createComponent();
				commandStoreComp.setName(conn.getName().substring(0,1).toUpperCase()+conn.getName().substring(1)+"CommandLog");
				model.getComponent().add(commandStoreComp);
				
				// add commandstore port
				Port logPort = factory.createPort();
				logPort.setName("log"+conn.getName().toLowerCase());
				Event loggedEvent = factory.createEvent();
				loggedEvent.setName("logged");
				logPort.getEvents().add(loggedEvent);
				commandStoreComp.getPort().add(logPort);
				
				
				// attach commandstore port to role
				logPort.getRole().add(commandStoreRole);
				
				
				//add architectural constraint
				BehaviourProperty property = factory.createBehaviourProperty();
				property.setName("event-command-"+conn.getName());
				property.setConnector(conn);
				
				// find commander
				HashMap<Component,Port> comps = this.findComponentByConnectorRoleName(conn.getName(), "commander");
				if(comps.size()>0) {
					Map.Entry<Component, Port> entry = (Map.Entry<Component, Port>)comps.entrySet().toArray()[0];
					property.setExprText("[] ("+entry.getKey().getName()+"."+entry.getValue().getName()+"."+entry.getValue().getEvents().get(0).getName()
							+"-> <> "+commandStoreComp.getName()+"."+conn.getName()+".commandstore.persist)");
				}
				
				model.getVerifyProperty().add(property);
				
			}
			

		}

		return model;
	}

}

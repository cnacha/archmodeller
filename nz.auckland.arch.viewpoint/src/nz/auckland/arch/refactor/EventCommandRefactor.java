package nz.auckland.arch.refactor;

import java.util.HashMap;

import nz.auckland.arch.ArchFactory;
import nz.auckland.arch.Component;
import nz.auckland.arch.Connector;
import nz.auckland.arch.ConnectorType;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.Port;
import nz.auckland.arch.Role;
import nz.auckland.arch.RoleType;
import nz.auckland.arch.impl.ArchFactoryImpl;

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
				conn.getRole().add(commandStoreRole);
				
				// add commandstore component
				Component commandStoreComp = factory.createComponent();
				commandStoreComp.setName(conn.getName().substring(0,1).toUpperCase()+conn.getName().substring(1)+"CommandLog");
				model.getComponent().add(commandStoreComp);
				
				// add commandstore port
				Port logPort = factory.createPort();
				logPort.setName("log"+conn.getName().toLowerCase());
				commandStoreComp.getPort().add(logPort);
				
				// attach commandstore port to role
				logPort.getRole().add(commandStoreRole);
			}
			

		}

		return model;
	}

}

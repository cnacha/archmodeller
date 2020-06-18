package nz.auckland.arch.refactor.rule;

import java.util.HashMap;
import java.util.Map;

import nz.auckland.arch.ArchFactory;
import nz.auckland.arch.BehaviourProperty;
import nz.auckland.arch.Component;
import nz.auckland.arch.Connector;
import nz.auckland.arch.ConnectorType;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.Port;
import nz.auckland.arch.Role;
import nz.auckland.arch.RoleType;
import nz.auckland.arch.impl.ArchFactoryImpl;
import nz.auckland.arch.refactor.AbstractRefactor;

public class EventQueryRefactor extends AbstractRefactor {

	private static final String ruleName = "RuleEventQuery";
	private static final String repConnStr = "QRConnector";

	public EventQueryRefactor(DesignModel model) {
		super(model);
	}

	@Override
	public DesignModel run() {
		// find connectortype
		ConnectorType targetConnType = this.findConnectorType(repConnStr);
		// setup role mapping
		HashMap<RoleType, RoleType> roleMap = new HashMap<RoleType, RoleType>();
		roleMap.put(findRoleType("REConnector", "readstorage"), findRoleType(repConnStr, "readstore"));
		roleMap.put(findRoleType("REConnector", "reader"), findRoleType(repConnStr, "querier"));
		ArchFactory factory = ArchFactoryImpl.init();

		for (Connector conn : model.getConnector()) {
			if (conn.getType().indexOf(ruleName) != -1) {
				// found connector to refactor, convert it to CRConnector for CQRS pattern
				System.out.println("...found a connector to refactor: "+conn.getName());
				this.changeConnectorType(conn, targetConnType, roleMap);
				
				
				
				// add architectural constraint
				BehaviourProperty property = factory.createBehaviourProperty();
				property.setName("event-query-"+conn.getName());
				property.setConnector(conn);
				
				// find querier
				HashMap<Component,Port> querycomps = this.findComponentByConnectorRoleName(conn.getName(), "querier");
				HashMap<Component,Port> storecomps = this.findComponentByConnectorRoleName(conn.getName(), "readstore");
				if(querycomps.size()>0 && storecomps.size()>0) {
					Map.Entry<Component, Port> queryentry = (Map.Entry<Component, Port>)querycomps.entrySet().toArray()[0];
					Map.Entry<Component, Port> storeentry = (Map.Entry<Component, Port>)storecomps.entrySet().toArray()[0];
					
					property.setExprText("[] ("+queryentry.getKey().getName()+"."+queryentry.getValue().getName()+"."+queryentry.getValue().getEvents().get(0).getName()
							+"-> <> "+storeentry.getKey().getName()+"."+conn.getName()+".readstore.process)");
				}
				
				model.getVerifyProperty().add(property);
			}

		}
		
		
		
		
		return model;
	}

}

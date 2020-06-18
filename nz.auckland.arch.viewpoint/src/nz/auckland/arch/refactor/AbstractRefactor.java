package nz.auckland.arch.refactor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nz.auckland.arch.ArchFactory;
import nz.auckland.arch.ArchStyle;
import nz.auckland.arch.Component;
import nz.auckland.arch.Connector;
import nz.auckland.arch.ConnectorType;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.Port;
import nz.auckland.arch.Role;
import nz.auckland.arch.RoleType;
import nz.auckland.arch.impl.ArchFactoryImpl;

public abstract class AbstractRefactor {

	protected DesignModel model;

	public AbstractRefactor(DesignModel model) {
		super();
		this.model = model;
	}

	public abstract DesignModel run();

	protected void changeConnectorType(Connector conn, ConnectorType connType, Map<RoleType, RoleType> roleMap) {

		// iterate to convert role
		for (Role role : conn.getRole()) {
			if (roleMap.containsKey(role.getRoletype())) {
				System.out.println("found mapping role to convert "+role.getName() + " to "+roleMap.get(role.getRoletype()).getName());
				role.setName(roleMap.get(role.getRoletype()).getName());
				role.setRoletype(roleMap.get(role.getRoletype()));
			}
		}
		// set connector type
		conn.setConnectortype(connType);

	}

	protected RoleType findRoleType(String connTypeName, String roleTypeName) {
		for (ArchStyle style : model.getArchstyle()) {
			for (ConnectorType connTyp : style.getConnectortype()) {
				if (connTypeName.equals(connTyp.getName())) {
					for (RoleType roleTyp : connTyp.getRoletype()) {
						if (roleTypeName.equals(roleTyp.getName())) {
							return roleTyp;
						}
					}
				}

			}
		}
		return null;
	}
	
	protected HashMap<Component,Port> findComponentByConnectorRoleName( String connName, String roleName) {
		HashMap<Component,Port> result = new HashMap<Component,Port>();
		for (Component comp : model.getComponent()) {
			for (Port port : comp.getPort()) {
				for (Role role : port.getRole()) {
					if (roleName.equalsIgnoreCase(role.getName())
							&& connName.equalsIgnoreCase(role.getConnector().getName())) {
						result.put(comp,port);
					}
				}
			}
		}
		return result;
	}
	
	protected Connector findConnectorByRole(Role role) {
		for(Connector conn: model.getConnector()) {
			for(Role er: conn.getRole()) {
				if(role == er)
					return conn;
			}
		}
		return null;
	}

	protected ConnectorType findConnectorType(String connTypeName) {
		for (ArchStyle style : model.getArchstyle()) {
			for (ConnectorType connTyp : style.getConnectortype()) {
				if (connTypeName.equals(connTyp.getName())) {
					return connTyp;
				}

			}
		}
		return null;
	}
	
	

}

package nz.auckland.arch.refactor.rule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

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
import nz.auckland.arch.refactor.BlockchainRefactorHelper;

public class SecureWriteRefactor extends AbstractRefactor {

	private static final String ruleWriteName = "RuleSecureWriting";
	private static final String ruleReadName = "RuleSecureReading";

	public SecureWriteRefactor(DesignModel model) {
		super(model);
	}

	@Override
	public DesignModel run() {

		ArchFactory factory = ArchFactoryImpl.init();
		List<Component> compToprocess = new ArrayList<Component>();
		for (Component comp : model.getComponent()) {
			if (comp.getType() != null && comp.getType().indexOf(ruleWriteName) != -1) {
				compToprocess.add(comp);
			}
		}
		for (Component comp : compToprocess) {

			// found component to refactor, find connected write connector
			Component writeStorageComp = comp;
			System.out.println("found RuleSecureWriting :" + comp.getName());
			Connector writeConnector = null;
			Role writeStorageRole = null;
			Port writeStoragePort = null;
			for (Port port : comp.getPort()) {
				for (Role role : port.getRole()) {

					System.out.println("	checking:" + port.getName() + "==" + role.getRoletype().getName() + "."
							+ role.getConnector().getName());
					if (role.getName().equals("writestorage")) {
						writeConnector = role.getConnector();
						writeStoragePort = port;
						writeStorageRole = role;
						break;
					}
				}
				if (writeStorageRole != null) {
					// remove role of this writestorage port
					port.getRole().remove(writeStorageRole);
					break;
				}
			}

			System.out.println("		 writeStorageRole:" + writeStorageRole + " connector :" + writeConnector);
			Component writerComp = null;
			Role writerRole = null;
			if (writeConnector == null) {
				return null;
			} else {
				// find write storage
				for (Role role : writeConnector.getRole()) {
					if (role.getRoletype().getName().equals("writer")) {
						for (Component ecomp : model.getComponent()) {
							for (Port eport : ecomp.getPort()) {
								if (eport.getRole().contains(role)) {
									writerComp = ecomp;
									writerRole = role;
								}
							}
						}

					}
				}
			}

			/** Secure Writing Refactoring ***/

			Component oracleComp = null;
			Port supplyPort = null;
			if (comp.getType().indexOf(this.ruleReadName) != -1) {
				// also a read blockchain
				// add oracle component
				oracleComp = factory.createComponent();
				oracleComp.setName(comp.getName() + "Oracle");
				model.getComponent().add(oracleComp);
				// add supply port
				supplyPort = factory.createPort();
				supplyPort.setName(comp.getName()+"supply");
				Event supplyEvent = factory.createEvent();
				supplyEvent.setName("supplied");
				supplyPort.getEvents().add(supplyEvent);
			} else {
				// not a read blockchain
				// convert existing component
				oracleComp = writeStorageComp;
				supplyPort = writeStoragePort;
			}

			oracleComp.getPort().add(supplyPort);
			System.out.println("add role  " + writeStorageRole.getName() + " to oracle:" + oracleComp.getName());
			supplyPort.getRole().add(writeStorageRole);

			BlockchainRefactorHelper helper = new BlockchainRefactorHelper();
			helper.fetchBlockchainComponent(factory, model, writeStorageComp.getName() + "Blockchain");

			// add connector for oracle
			ConnectorType targetConnType = this.findConnectorType("IOConnector");
			Connector oracleConn = factory.createConnector();
			oracleConn.setName("oracle" + writeConnector.getName());
			oracleConn.setConnectortype(targetConnType);
			oracleConn.setType(targetConnType.getName());
			model.getConnector().add(oracleConn);
			System.out.println("	connector added :" + oracleConn.getName());

			// add role for oracle
			for (RoleType roleType : targetConnType.getRoletype()) {
				Role role = factory.createRole();
				role.setConnector(oracleConn);
				role.setName(roleType.getName());
				role.setType(roleType.getName());
				role.setRoletype(roleType);
				oracleConn.getRole().add(role);
				if (roleType.getName().equals("blockstorage")) {
					helper.getAppendPort().getRole().add(role);
				} else if (roleType.getName().equals("extsupplier")) {
					supplyPort.getRole().add(role);

					writeStorageRole.setNextRoleExpr(role);
				}
			}

			// convert write connector to client-server
			ConnectorType csConnType = this.findConnectorType("CSConnector");
			HashMap<RoleType, RoleType> roleMap = new HashMap<RoleType, RoleType>();
			roleMap.put(findRoleType("WRConnector", "writer"), findRoleType("CSConnector", "requester"));
			roleMap.put(findRoleType("WRConnector", "writestorage"), findRoleType("CSConnector", "responder"));
			this.changeConnectorType(writeConnector, csConnType, roleMap);

			System.out.println("	sucessfully refactored");

			// add architectural constraint
			BehaviourProperty property = factory.createBehaviourProperty();
			property.setName("secure-write" + oracleConn.getName());
			property.setConnector(oracleConn);

			property.setExprText("[] (" + oracleComp.getName() + "." + supplyPort.getName() + "."
					+ supplyPort.getEvents().get(0).getName() + "-> <> " + helper.getBlockchain().getName() + "."
					+ oracleConn.getName() + ".blockstorage.stored)");

			model.getVerifyProperty().add(property);

		}

		return model;

	}

}

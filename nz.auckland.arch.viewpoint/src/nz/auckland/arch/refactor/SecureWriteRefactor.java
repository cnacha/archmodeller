package nz.auckland.arch.refactor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

import nz.auckland.arch.ArchFactory;
import nz.auckland.arch.Component;
import nz.auckland.arch.Connector;
import nz.auckland.arch.ConnectorType;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.Port;
import nz.auckland.arch.Role;
import nz.auckland.arch.RoleType;
import nz.auckland.arch.impl.ArchFactoryImpl;

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
			for (Port port : comp.getPort()) {
				for (Role role : port.getRole()) {
					if (role.getName().equals("writestorage")) {
						writeConnector = role.getConnector();
						writeStorageRole = role;
						// remove role of this writestorage port
						port.getRole().remove(role);
						break;
					}
				}
			}
			System.out.println("		 connector :" + writeConnector);
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

			// add oracle component
			Component oracleComp = factory.createComponent();
			oracleComp.setName(comp.getName() + "Oracle");
			model.getComponent().add(oracleComp);
			// add supply port
			Port supplyPort = factory.createPort();
			supplyPort.setName("supply");
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

			System.out.println("	sucessfully refactored");

		}

		return model;

	}

}

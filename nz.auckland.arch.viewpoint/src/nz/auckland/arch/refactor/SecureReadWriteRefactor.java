package nz.auckland.arch.refactor;

import nz.auckland.arch.ArchFactory;
import nz.auckland.arch.Component;
import nz.auckland.arch.Connector;
import nz.auckland.arch.ConnectorType;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.Port;
import nz.auckland.arch.Role;
import nz.auckland.arch.RoleType;
import nz.auckland.arch.impl.ArchFactoryImpl;

public class SecureReadWriteRefactor extends AbstractRefactor {
	
	private static final String ruleWriteName = "RuleSecureWriting";
	private static final String ruleReadName = "RuleSecureReading";

	public SecureReadWriteRefactor(DesignModel model) {
		super(model);
	}

	@Override
	public DesignModel run() {
		
		ArchFactory factory = ArchFactoryImpl.init();
		
		for (Component comp : model.getComponent()) {
			if (comp.getType().indexOf(ruleWriteName) != -1) {
				System.out.println("found RuleSecureWriting :"+comp.getName());
				// found component to refactor, find connected write connector
				Connector writeConnector = null;
				for(Port port: comp.getPort()) {
					for(Role role: port.getRole()) {
						if(role.getName().equals("writer")) {
							writeConnector = role.getConnector();
						}
					}
				}
				System.out.println("		 connector :"+writeConnector);
				Component writeStorage = null;
				Role writeStorageRole = null;
				if(writeConnector == null) {
					return null;
				}else {
					//find write storage
					for(Role role: writeConnector.getRole()) {
						if(role.getRoletype().getName().equals("writestorage")) {
							for(Component ecomp: model.getComponent()) {
								for(Port eport: ecomp.getPort()) {
									if(eport.getRole().contains(role)) {
										writeStorage = ecomp;
										writeStorageRole = role;
										// remove role of this writestorage port
										eport.getRole().remove(role);
									}
								}
							}
						
						}
					}
				}
				
				/** Secure Writing Refactoring  ***/
				
				// add oracle component
				Component oracleComp = factory.createComponent();
				oracleComp.setName(comp.getName()+"Oracle");
				model.getComponent().add(oracleComp);
				// add supply port
				Port supplyPort = factory.createPort();
				supplyPort.setName("supply");
				oracleComp.getPort().add(supplyPort);
				supplyPort.getRole().add(writeStorageRole);
				
				// add blockchain component
				Component blockchainComp = factory.createComponent();
				blockchainComp.setName(writeStorage.getName()+"Blockchain");
				model.getComponent().add(blockchainComp);
				// add append port
				Port appendPort = factory.createPort();
				appendPort.setName("append");
				blockchainComp.getPort().add(appendPort);
				// add access port to blockchain
				Port accessPort = factory.createPort();
				accessPort.setName("access");
				blockchainComp.getPort().add(accessPort);
				System.out.println("	blockchaincomp :"+blockchainComp.getName());
				
				// add connector for oracle
				ConnectorType targetConnType = this.findConnectorType("IOConnector");
				Connector oracleConn = factory.createConnector();
				oracleConn.setName("oracle"+writeConnector.getName());
				oracleConn.setConnectortype(targetConnType);
				oracleConn.setType(targetConnType.getName());
				model.getConnector().add(oracleConn);
				System.out.println("	connector added :"+oracleConn.getName());
				
				// add role for oracle
				for (RoleType roleType : targetConnType.getRoletype()) {
					Role role = factory.createRole();
					role.setConnector(oracleConn);
					role.setName(roleType.getName());
					role.setType(roleType.getName());
					role.setRoletype(roleType);
					oracleConn.getRole().add(role);
					if(roleType.getName().equals("blockstorage")) {
						appendPort.getRole().add(role);
					} else if(roleType.getName().equals("extsupplier")) {
						supplyPort.getRole().add(role);
						writeStorageRole.setNextRoleExpr(role);
					}
				}
				
				
				/** Secure Reading Refactoring  ***/
				if(writeStorage!=null && writeStorage.getType().indexOf(this.ruleReadName)!=-1) {
					for(Port port: writeStorage.getPort()) {
						for(Role role: port.getRole()) {
							// reroute readstorage to the blockchain
							if(role.getRoletype().getName().equals("readstorage")) {
								
								// add connector to blockchain
								ConnectorType roconnType = this.findConnectorType("ROConnector");
								Connector roConn = factory.createConnector();
								roConn.setName("ro"+role.getConnector().getName());
								roConn.setConnectortype(roconnType);
								roConn.setType(roconnType.getName());
								model.getConnector().add(roConn);
								System.out.println("	connector added :"+roConn.getName());
								
								// add role for reverse-oracle
								for (RoleType roleType : roconnType.getRoletype()) {
									Role newrole = factory.createRole();
									newrole.setConnector(oracleConn);
									newrole.setName(roleType.getName());
									newrole.setType(roleType.getName());
									newrole.setRoletype(roleType);
									roConn.getRole().add(newrole);
									
									if(roleType.getName().equals("extquerier")) {
										// attach extquerier to the readstorage port
										port.getRole().add(newrole);
										role.setNextRoleExpr(newrole);
										
									} else if(roleType.getName().equals("blocksupplier")) {
										accessPort.getRole().add(newrole);
										System.out.println("	add role: "+accessPort.getName());
									}
								}
								break;
							}
						}
					}
				}
				
				
				System.out.println("	sucessfully refactored");
				
				break;
				
			}
		}
		return model;
		
	}

}

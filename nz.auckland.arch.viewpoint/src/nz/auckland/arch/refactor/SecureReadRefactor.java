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

public class SecureReadRefactor extends AbstractRefactor {
	
	private static final String ruleWriteName = "RuleSecureWriting";
	private static final String ruleReadName = "RuleSecureReading";

	public SecureReadRefactor(DesignModel model) {
		super(model);
	}

	@Override
	public DesignModel run() {
		
		ArchFactory factory = ArchFactoryImpl.init();
		
		for (Component comp : model.getComponent()) {
			if (comp.getType().indexOf(ruleWriteName) != -1) {
				
				// found component to refactor
				Component writeStorageComp = comp;
				System.out.println("found RuleSecureReading :"+comp.getName());
				
			
				BlockchainRefactorHelper helper = new BlockchainRefactorHelper();
				helper.fetchBlockchainComponent(factory, model, writeStorageComp.getName()+"Blockchain");
				
				/** Secure Reading Refactoring  ***/
				if(writeStorageComp!=null && writeStorageComp.getType().indexOf(this.ruleReadName)!=-1) {
					for(Port port: writeStorageComp.getPort()) {
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
									newrole.setConnector(roConn);
									newrole.setName(roleType.getName());
									newrole.setType(roleType.getName());
									newrole.setRoletype(roleType);
									roConn.getRole().add(newrole);
									
									if(roleType.getName().equals("extquerier")) {
										// attach extquerier to the readstorage port
										port.getRole().add(newrole);
										role.setNextRoleExpr(newrole);
										
									} else if(roleType.getName().equals("blocksupplier")) {
										helper.getAccessPort().getRole().add(newrole);
										System.out.println("	add role: "+helper.getAccessPort().getName());
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

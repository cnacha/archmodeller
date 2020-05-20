package nz.auckland.arch.refactor;

import nz.auckland.arch.ArchFactory;
import nz.auckland.arch.Component;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.Port;

public class BlockchainRefactorHelper {
	private Port accessPort;
	private Port appendPort;
	
	
	public void fetchBlockchainComponent(ArchFactory factory, DesignModel model, String blockchainName) {
		Component bcComp = null;
		for(Component comp : model.getComponent()) {
			if(comp.getName().equals(blockchainName)) {
				bcComp = comp;
				break;
			}
		}
		if(bcComp !=null) {
			// blockchain exists!, find accessPort and appendPort
			for(Port port: bcComp.getPort()) {
				if(port.getName().equals("append")) {
					appendPort = port;
				} else if(port.getName().equals("access")) {
					accessPort = port;
				}
			}
			
		} else {
			// blockchain does not exist, create bc component with ports
			Component blockchainComp = factory.createComponent();
			blockchainComp.setName(blockchainName);
			model.getComponent().add(blockchainComp);
			// add append port
			appendPort = factory.createPort();
			appendPort.setName("append");
			blockchainComp.getPort().add(appendPort);
			// add access port to blockchain
			accessPort = factory.createPort();
			accessPort.setName("access");
			blockchainComp.getPort().add(accessPort);
			System.out.println(" created blockchaincomp :"+blockchainComp.getName());
		}
	}


	public Port getAccessPort() {
		return accessPort;
	}


	public Port getAppendPort() {
		return appendPort;
	}
	
	

}

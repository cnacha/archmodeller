package nz.auckland.arch.refactor;

import nz.auckland.arch.ArchFactory;
import nz.auckland.arch.Component;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.Event;
import nz.auckland.arch.Port;

public class BlockchainRefactorHelper {
	private Port accessPort;
	private Port appendPort;
	private Component blockchain;
	
	
	public void fetchBlockchainComponent(ArchFactory factory, DesignModel model, String blockchainName) {
		Component bcComp = null;
		for(Component comp : model.getComponent()) {
			if(comp.getName().equals(blockchainName)) {
				bcComp = comp;
				break;
			}
		}
		
		String appendPortName = blockchainName.toLowerCase().substring(0,3)+"append";
		String accessPortName = blockchainName.toLowerCase().substring(0,3)+"access";
		
		if(bcComp !=null) {
			// blockchain exists!, find accessPort and appendPort
			for(Port port: bcComp.getPort()) {
				if(port.getName().equals(appendPortName)) {
					appendPort = port;
				} else if(port.getName().equals(accessPortName)) {
					accessPort = port;
				}
			}
			
		} else {
			// blockchain does not exist, create bc component with ports
			blockchain = factory.createComponent();
			blockchain.setName(blockchainName);
			model.getComponent().add(blockchain);
			// add append port
			appendPort = factory.createPort();
			appendPort.setName(appendPortName);
			Event appendEvent = factory.createEvent();
			appendEvent.setName("appended");
			appendPort.getEvents().add(appendEvent);
			blockchain.getPort().add(appendPort);
			// add access port to blockchain
			accessPort = factory.createPort();
			accessPort.setName(accessPortName);
			Event accessEvent = factory.createEvent();
			accessEvent.setName("accessed");
			accessPort.getEvents().add(accessEvent);
			blockchain.getPort().add(accessPort);
			System.out.println(" created blockchaincomp :"+blockchain.getName());
		}
	}


	public Port getAccessPort() {
		return accessPort;
	}


	public Port getAppendPort() {
		return appendPort;
	}
	
	public Component getBlockchain() {
		return blockchain;
	}
	

}

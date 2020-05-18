package nz.auckland.arch.viewpoint.utils;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.StringTokenizer;

import javax.inject.Inject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.RefreshRepresentationsCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.impl.FlatContainerStyleImpl;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.DView;

import nz.auckland.arch.Component;
import nz.auckland.arch.Connector;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.Event;
import nz.auckland.arch.Port;
import nz.auckland.arch.Role;

public class ModelSimulation {
//	private DesignModel model;
	//private int delay;
	
	

	public ModelSimulation() {
		super();
		//this.model = model;
	
	}
//	Hashtable<String, DRepresentationElement>  dgHash = new Hashtable<String, DRepresentationElement>();
	Hashtable<String, DRepresentationElement>  compHash = new Hashtable<String, DRepresentationElement>();
	Hashtable<String, DRepresentationElement>  portHash = new Hashtable<String, DRepresentationElement>();
	Hashtable<String, DRepresentationElement>  connHash = new Hashtable<String, DRepresentationElement>();
	Hashtable<String, DRepresentationElement>  roleHash = new Hashtable<String, DRepresentationElement>();
	Hashtable<String, DRepresentation>  portRpstHash = new Hashtable<String, DRepresentation>();
	
	private DRepresentation systemDiagramRpst = null;

	public void setupRpstElementHash() throws Exception {
		IEditingSession session = SessionUIManager.INSTANCE.getUISessions().iterator().next();
		if(session == null)
			throw new Exception("Invalid Session");
		
		DAnalysis root = (DAnalysis)session.getSession().getSessionResource().getContents().get(0);
		for(DView view: root.getOwnedViews()) {
			for(DRepresentationDescriptor dr : view.getOwnedRepresentationDescriptors()) {
				System.out.println(view.getViewpoint().getName()+" @"+dr.getDescription().getName() );
				
				DRepresentation rpst = dr.getRepresentation();
				
				// find SystemDiagram
				if(dr.getDescription().getName().equals("SystemDiagram")) {
					System.out.println("found diagram...");
					systemDiagramRpst = rpst;
					
					// open diagram
					DialectUIManager.INSTANCE.openEditor(session.getSession(), rpst,	new NullProgressMonitor());
					
					
					// loop through all elements in the diagram
					for(DRepresentationElement element: rpst.getRepresentationElements()) {
						if(element.getSemanticElements().size()>0) {
							EObject obj = element.getSemanticElements().get(0);
							System.out.println("\t"+obj.toString());
							
							// found component element
							if ("Component".equals(obj.eClass().getName())) {
								compHash.put(((Component)obj).getName(), element);
							}
							
							// found port element
							if("Port".equals(obj.eClass().getName())) {
								Port port = (Port) obj;
								portHash.put(((Port)obj).getName(), element);
							}
							
							// found connector element
							if ("Connector".equals(obj.eClass().getName())) {
								connHash.put(((Connector)obj).getName(), element);
							}
							
							// found role element
							if ("Role".equals(obj.eClass().getName())) {
								roleHash.put(((Role)obj).getName(), element);
								
							}
						}
					}
					 //break out from searching system diagram 
					 //break;

				} 
				System.out.println("start port diagram");
				if(dr.getDescription().getName().equals("PortDiagram")) {
					System.out.println("	found port diagram "+rpst.getName());
					for(DRepresentationElement element: rpst.getRepresentationElements()) {
						System.out.println(element.getSemanticElements());
						if(element.getSemanticElements().size()>0) {
							EObject obj = element.getSemanticElements().get(0);
							
							if ("Port".equals(obj.eClass().getName())) {
								portRpstHash.put(((Port)obj).getName(), rpst);
								break;
								
							}
						}
					}
				}
				System.out.println("end port diagram");
				
			}// end loop through representation
			
		}
		

	}
	
	
	public void run(String traceStr) throws Exception{
		IEditingSession session = SessionUIManager.INSTANCE.getUISessions().iterator().next();
		if(session == null)
			throw new Exception("Invalid Session");
		
		StringTokenizer st = new StringTokenizer(traceStr, " -> ");
		String currElement = null;
		String prevElement = null;
		String prevPort = null;
		String currPort = null;
		TransactionalEditingDomain domain = session.getSession().getTransactionalEditingDomain();
		while(st.hasMoreTokens()) {
			String eventLabel = st.nextToken();
			System.out.println(eventLabel);
			
			if("init".equals(eventLabel)) 
				continue;
			StringTokenizer eventSt = new StringTokenizer(eventLabel, "_");
			
			if(eventLabel.indexOf('!')!=-1 || eventLabel.indexOf('?')!=-1) {
				// This is connector channel
				currElement = eventSt.nextToken();
				if(!currElement.equals(prevElement)) {
					System.out.println("\tflashing "+currElement);
					
					// flash connector
					flashElement(session.getSession(),this.systemDiagramRpst, domain, connHash.get(currElement));
				}
				
			} else {
				// This is component event
				currElement = eventSt.nextToken();			
				if(!currElement.equals(prevElement)) {
					System.out.println("\tflashing "+currElement);
					
					// flash component
					flashElement(session.getSession(),this.systemDiagramRpst, domain, compHash.get(currElement));
				}
				
				// get port diagram 
				String nextCallElement = eventSt.nextToken();
				System.out.println("\tnext "+nextCallElement);
				
				// check if this is a port component
				if(this.portRpstHash.containsKey(nextCallElement)) {
					currPort = nextCallElement;
					// flash port
					if(!currPort.equals(prevPort))
						flashElement(session.getSession(),this.systemDiagramRpst, domain, portHash.get(currPort));
					
					DRepresentation rpst = portRpstHash.get(nextCallElement);
					String event = eventSt.nextToken();
					for(DRepresentationElement element : rpst.getRepresentationElements()) {
						if(element.getSemanticElements().size()>0) {
							EObject obj = element.getSemanticElements().get(0);
						//	System.out.println("\t\t"+obj.toString());
							
							// found event element
							if ("Event".equals(obj.eClass().getName()) && ((Event)obj).getName().equals(event)){
								System.out.println("\t\tflashing "+nextCallElement +" "+((Event)obj).getName());
								this.flashElement(session.getSession(), rpst, domain, element);
							}
						}
						
					}
					prevPort = currPort;
					
				
				} /*else if (this.connHash.containsKey(nextCallElement)) {
					String connName = nextCallElement;
					System.out.println("\tflashing "+connName);
					//flashElement(session.getSession(),this.systemDiagramRpst, domain, connHash.get(connName));
					String role = eventSt.nextToken();
					
					if(roleHash.containsKey(role)) {
						System.out.println("\tflashing "+role);
						flashElement(session.getSession(),this.systemDiagramRpst, domain, roleHash.get(role));
					}
				}
				*/
				
			}
			prevElement = currElement ;
		}
	}
	
	public static final ISchedulingRule mutex = new Mutex();
	
	boolean isFirstFlash = true;
	
	private int defaultDelay = 500;
	
	public void flashElement(Session session,DRepresentation representation, TransactionalEditingDomain domain, DRepresentationElement element) {
		
		// retrieve representation element from Hash
		
	//	DRepresentationElement element = dgHash.get(name);
		if(element == null)
			return;
		
		int delay = defaultDelay;
		FlashJob job = null;
		if(isFirstFlash) {
			delay +=1500;
			job = new FlashJob("Simulating",session, representation, domain, element,delay, 4);
			job.setOpenEditor(false);
		} else {
			job = new FlashJob("Simulating",session, representation, domain, element,delay, 4);
			
		}
		
		
		job.setRule(mutex);
		job.schedule();
		
		isFirstFlash = false;
		
	}
	

}

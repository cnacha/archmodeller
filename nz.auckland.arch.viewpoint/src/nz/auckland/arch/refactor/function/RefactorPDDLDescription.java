package nz.auckland.arch.refactor.function;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

import nz.auckland.arch.BehaviourProperty;
import nz.auckland.arch.Component;
import nz.auckland.arch.Connector;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.Port;
import nz.auckland.arch.RefactorPart;
import nz.auckland.arch.RefactorSet;
import nz.auckland.arch.Role;
import nz.auckland.arch.VerificationProperty;

public class RefactorPDDLDescription {
	private DesignModel srcModel;
	private RefactorPart part;

	private ObjectDefinition objCompList = new ObjectDefinition("component");
	private ObjectDefinition objConnList = new ObjectDefinition("connector");
	private ObjectDefinition objPortList = new ObjectDefinition("port");
	private ObjectDefinition objRoleList = new ObjectDefinition("role");
	private List<RefactorPredicate> initPredList = new ArrayList<RefactorPredicate>();
	private List<RefactorPredicate> goalPredList = new ArrayList<RefactorPredicate>();
	
	private List<String> addedConnNames = new ArrayList<String>();
	private List<String> addedCompNames = new ArrayList<String>();
	private List<String> srcConnNames = new ArrayList<String>();
	private List<String> srcCompNames = new ArrayList<String>();
	
	private List<String> verificationPropStr = new ArrayList<String>();
	
	public final static String REFACTOR_POSTFIX_STR = "ref";

	public RefactorPDDLDescription(DesignModel srcModel, RefactorPart part) {
		super();
		this.srcModel = srcModel;
		
		this.part = part;
	}

	public ObjectDefinition getObjCompList() {
		return objCompList;
	}

	public ObjectDefinition getObjConnList() {
		return objConnList;
	}

	public ObjectDefinition getObjPortList() {
		return objPortList;
	}

	public ObjectDefinition getObjRoleList() {
		return objRoleList;
	}

	public List<RefactorPredicate> getInitPredList() {
		initPredList = initPredList.stream().distinct().collect(Collectors.toList());
		return initPredList;
	}

	public List<RefactorPredicate> getGoalPredList() {
		goalPredList = goalPredList.stream().distinct().collect(Collectors.toList());
		return goalPredList;
	}

	public void generate() {
		
		System.out.println("	reference: " + part.getReference().getName() + " props: "
				+ part.getReference().getVerifyProperty().size()+" srcComp#"+srcModel.getComponent().size());
		String postfix = "";
		// if (part.isCopyStructure() || part.isReplaceStrcuture() )
		postfix = REFACTOR_POSTFIX_STR;// +part.getName();
		for (BehaviourProperty newProp : part.getFunctions()) {
			String newPropTrigger = extractTriggerEvent(newProp.getExprText());
			String newPropResponse = extractResponseEvent(newProp.getExprText());

			for (VerificationProperty refProp : part.getReference().getVerifyProperty()) {
				BehaviourProperty refBevProp = (BehaviourProperty) refProp;

				// case 1 refactor by response in functional properties of reference model =
				// response must match!?
				String refPropTrigger = extractTriggerEvent(refBevProp.getExprText());
				String refPropResponse = extractResponseEvent(refBevProp.getExprText());
				
				
				
				System.out.println("refPropTrigger: " + refPropTrigger);
				System.out.println("refPropResponse: " + refPropResponse);
				if (newPropResponse.equals(refPropResponse)) {
					// get trigger component from reference model
					String responseCompName = this.extractComponentName(refPropResponse, ".");

					// add new connector/role and attach role by state trace of reference model
					List<String> refTraceEvents = convertTraceExampleToList(refBevProp.getTraceExample());
					System.out.println("refTraceEvents: " + refBevProp.getTraceExample());
					boolean enableObserve = false;
					boolean lastloop = false;
					for (int i = 0; i < refTraceEvents.size(); i++) {
						String traceEvnt = refTraceEvents.get(i);
						if (!enableObserve && traceEvnt.equals(refPropTrigger.replace(".", "_"))) {
							// start observing when the trigger event occurs
							enableObserve = true;
							continue;

						}

						// process events from trace example
						if (enableObserve) {
							// find event from role to process
							System.out.println("	observing: " + traceEvnt + ": " + isRoleEvent(traceEvnt));
							if (isRoleEvent(traceEvnt)) {

								String connName = this.extractConnectorName(traceEvnt, "_"); // +part.getName();
								String roleName = this.extractRoleName(traceEvnt, "_");
								String compName = this.extractComponentName(traceEvnt, "_");
								
								// try to find them in the source model
								
								Connector srcConnector = this.findConnectorByName(srcModel, connName);
								
								
								if(srcConnector!=null && !srcConnNames.contains(connName) && !part.isCopyStructure())
									srcConnNames.add(connName);
	
								if (!addedConnNames.contains(connName) && (srcConnector == null
										|| part.isCopyStructure() || part.isReplaceStrcuture())) {
									// add connector
									connName = connName + postfix;
									RefactorPredicate initPred = new RefactorPredicate("disabled-connector");
									initPred.addParameters(connName);
									initPredList.add(initPred);

//									RefactorPredicate goalPred = new RefactorPredicate("enabled-connector");
//									goalPred.addParameters(connName );
//									goalPredList.add(goalPred);

									addedConnNames.add(connName);

									objConnList.addName(connName);

								}
								
								// replace structure disable the connector to disintegrate the old structure.
								if (part.isReplaceStrcuture() && srcConnector != null) {

									RefactorPredicate goalPred = new RefactorPredicate("disabled-connector");
									String oldConnName = connName;
									if (connName.contains(postfix))
										oldConnName = oldConnName.substring(0, oldConnName.indexOf(postfix));
									goalPred.addParameters(oldConnName);
									goalPredList.add(goalPred);
								}

								// add role to the connector
								RefactorPredicate initPred = new RefactorPredicate("hasrole");
								initPred.addParameters(connName);
								initPred.addParameters(roleName + "-" + connName);
								initPredList.add(initPred);

								objRoleList.addName(roleName + "-" + connName);

								// attach role as goal predicate
								String portEvent = null;

								String tmpEventStr = "";
								if ((tmpEventStr = this.backtraceForPortEvent(refTraceEvents, i, compName)) != null) {
									// trigger component
									System.out.print("		tmpEventStr:" + tmpEventStr);
									portEvent = tmpEventStr;
									compName = this.extractComponentName(tmpEventStr, "_");
									System.out.println("		compName:" + compName);

								} else if ((tmpEventStr = this.forthtraceForPortEvent(refTraceEvents, i,
										compName)) != null) {
									// response component
									System.out.print("		tmpEventStr:" + tmpEventStr);
									portEvent = tmpEventStr;
									compName = this.extractComponentName(tmpEventStr, "_");
									System.out.println("		compName:" + compName);
								}

								// change the trigger in reference to the trigger in new function
								// find out whether the trigger port is the existing port
								String portName  = null;
								if (compName.equals(this.extractComponentName(refPropTrigger, "."))) {
									compName = this.extractComponentName(newPropTrigger, ".");
									portName =this.extractPortName(newPropTrigger, ".");
									System.out.println("		finding trigger port"+portName);

								}
								
								// try to find them in the source model
								Component srcComponent = this.findComponentByName(srcModel, compName);
								if(srcComponent!=null && !srcCompNames.contains(compName) && !part.isCopyStructure())
									srcCompNames.add(compName);
								
								// if the response component is not yet added and not exist in the source model
								// or it is any responder component, add the component/port
								
								

								if ((!addedCompNames.contains(compName)) && (srcComponent == null
										|| part.isCopyStructure() /** || part.isReplaceStrcuture() **/
								)) {
									compName = compName + postfix;
									initPred = new RefactorPredicate("disabled-component");
									initPred.addParameters(compName);
									initPredList.add(initPred);

//									RefactorPredicate goalPred = new RefactorPredicate("enabled-component");
//									goalPred.addParameters(compName );
//									goalPredList.add(goalPred);
									
									objCompList.addName(compName);

									
								}
								
								// if the response component is already added, add port as necessary
								if (portEvent != null) {
									
									//add new port 
									if(portName==null) //extract port from reference event, if port in source does not exist
										portName = this.extractPortName(portEvent, "_");
									if (srcComponent == null || (this.findPortByName(srcComponent, portName) == null )
											|| part.isCopyStructure()) {
										
										portName = portName + postfix;
										initPred = new RefactorPredicate("hasport");
										initPred.addParameters(compName);
										initPred.addParameters(portName);
										initPredList.add(initPred);

										objPortList.addName(portName);
										
									}


									RefactorPredicate goalPred = new RefactorPredicate("attach");
									goalPred.addParameters(compName);
									goalPred.addParameters(portName);
									goalPred.addParameters(connName);
									goalPred.addParameters(roleName + "-" + connName);
									goalPredList.add(goalPred);

								}
							}
						}
							

						// stop when the event is the response event in functional prop.
						if (enableObserve && refTraceEvents.get(i - 1).equals(refPropResponse.replace(".", "_"))) {
							// enableObserve = false;
							// continue;
							break;
						}

					} // end for observing and processing events in trace example
					
					
					
					

				} // end if for processing functional property

				// maybe not - case 2 refactor by trigger in functional properties of reference
				// model
			}
			
			// add verification property
			String expr = processExprForTargetModel(newProp.getExprText(), newPropTrigger);
			expr = processExprForTargetModel(expr, newPropResponse);
			System.out.println("	#####"+expr);
			if(!verificationPropStr.contains(expr))
				verificationPropStr.add(expr);

		}
		this.generateSourcePredicates();
	}
	
	private String processExprForTargetModel(String expr, String event) {
		String compName = this.extractComponentName(event,".");
		String portName = this.extractPortName(event, ".");
		if(!srcCompNames.contains(compName)) { // check if it is new component added
			// replace the component name with refactored one
			expr = expr.replace(compName, compName.toLowerCase()+REFACTOR_POSTFIX_STR);
		}
		System.out.println("		#### find port:"+portName);
		if(objPortList.getNames().contains(portName.toLowerCase()+REFACTOR_POSTFIX_STR)) {
			// replace the port name with refactored one
			expr = expr.replace(portName, portName.toLowerCase()+REFACTOR_POSTFIX_STR);
		}
		return expr;
	}

	private void generateSourcePredicates() {
		for (Component comp : srcModel.getComponent()) {
			if(!srcCompNames.contains(comp.getName()))
				continue;
			RefactorPredicate compPred = new RefactorPredicate("enabled-component");
			compPred.addParameters(comp.getName());
			initPredList.add(compPred);
			objCompList.addName(comp.getName());
			for (Port prt : comp.getPort()) {
				objPortList.addName(prt.getName());
				RefactorPredicate initportPred = new RefactorPredicate("hasport");
				initportPred.addParameters(comp.getName());
				initportPred.addParameters(prt.getName());
				initPredList.add(initportPred);

				for (Role rle : prt.getRole()) {
					if(!srcConnNames.contains(rle.getConnector().getName()))
						continue;
					RefactorPredicate initRlePred = new RefactorPredicate("attach");
					initRlePred.addParameters(comp.getName());
					initRlePred.addParameters(prt.getName());
					initRlePred.addParameters(rle.getConnector().getName());
					initRlePred.addParameters(rle.getName() + "-" + rle.getConnector().getName());
					initPredList.add(initRlePred);
				}

			}

		}
		for (Connector conn : srcModel.getConnector()) {
			if(!srcConnNames.contains(conn.getName()))
				continue;
			RefactorPredicate connPred = new RefactorPredicate("enabled-connector");
			connPred.addParameters(conn.getName());
			initPredList.add(connPred);
			objConnList.addName(conn.getName());
			for (Role rle : conn.getRole()) {
				objRoleList.addName(rle.getName() + "-" + conn.getName());
				RefactorPredicate initPred = new RefactorPredicate("hasrole");
				initPred.addParameters(conn.getName());
				initPred.addParameters(rle.getName() + "-" + conn.getName());
				initPredList.add(initPred);
			}

		}

	}

	// This method extract events from lead operator
	public String extractTriggerEvent(String exprStr) {
		return exprStr.substring(exprStr.indexOf("(") + 1, exprStr.lastIndexOf("->")).strip();

	}

	public String extractResponseEvent(String exprStr) {
		return exprStr.substring(exprStr.indexOf("<>") + 2, exprStr.lastIndexOf(")")).strip();
	}

	public String extractComponentName(String eventStr, String sep) {
		return eventStr.substring(0, eventStr.indexOf(sep));
	}

	public String extractConnectorName(String rleEventStr, String sep) {
		return rleEventStr.substring(rleEventStr.indexOf(sep) + 1,
				rleEventStr.indexOf(sep, rleEventStr.indexOf(sep) + 1));
	}

	public String extractRoleName(String rleEventStr, String sep) {
		return rleEventStr.substring(rleEventStr.indexOf(sep, rleEventStr.indexOf(sep) + 1) + 1,
				rleEventStr.lastIndexOf(sep));
	}

	public String extractPortName(String rleEventStr, String sep) {
		return rleEventStr.substring(rleEventStr.indexOf(sep) + 1, rleEventStr.lastIndexOf(sep));
	}

	private String backtraceForPortEvent(List<String> eventTrace, int pos, String compName) {
		for (int i = pos; i >= 0; i--) {
			if (this.isPortEvent(eventTrace.get(i))
					&& this.extractComponentName(eventTrace.get(i), "_").equals(compName)) {
				return eventTrace.get(i);
			}
		}
		return null;
	}

	private String forthtraceForPortEvent(List<String> eventTrace, int pos, String compName) {
		for (int i = pos; i < eventTrace.size(); i++) {
			if (this.isPortEvent(eventTrace.get(i))
					&& this.extractComponentName(eventTrace.get(i), "_").equals(compName)) {
				return eventTrace.get(i);
			}
		}
		return null;
	}

	private boolean isRoleEvent(String evnt) {
		int countseperator = 0;
		for (int i = 0; i < evnt.length(); i++) {
			if (evnt.charAt(i) == '_')
				countseperator++;
		}
		if (countseperator == 3)
			return true;
		else
			return false;
	}

	private boolean isPortEvent(String evnt) {
		int countseperator = 0;
		for (int i = 0; i < evnt.length(); i++) {
			if (evnt.charAt(i) == '_')
				countseperator++;
		}
		if (countseperator == 2)
			return true;
		else
			return false;
	}

	private List<String> convertTraceExampleToList(String tracestr) {
		List<String> traces = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(tracestr, "->");
		while (st.hasMoreTokens())
			traces.add(st.nextToken().strip());
		return traces;
	}

	private Component findComponentByName(DesignModel model, String compName) {
		for (Component comp : model.getComponent()) {
			if (comp.getName().equals(compName))
				return comp;
		}
		return null;
	}

	private Port findPortByName(Component comp, String portName) {
		for (Port port : comp.getPort()) {

			if (port.getName().equals(portName))
				return port;
		}
		return null;
	}

	private Component findComponentByConnectorName(DesignModel model, String connectorName) {
		for (Component comp : model.getComponent()) {
			for (Port port : comp.getPort()) {
				for (Role role : port.getRole()) {
					System.out.println("			" + role.getConnector().getName() + "." + role.getName());
					if (connectorName.equals(role.getConnector().getName()))
						return comp;
				}
			}
		}
		return null;
	}

	public boolean findItem(List<String> list, String item) {
		for (String str : list) {
			if (str.startsWith(item) || item.startsWith(str))
				return true;
		}
		return false;
	}

	private Port findPortByConnectorName(DesignModel model, String connectorName, String roleName) {
		for (Component comp : model.getComponent()) {
			for (Port port : comp.getPort()) {
				for (Role role : port.getRole()) {
					if (connectorName.equals(role.getConnector().getName()))
						return port;
				}
			}
		}
		return null;
	}

	private Connector findConnectorByName(DesignModel model, String connName) {
		for (Connector conn : model.getConnector()) {
			if (conn.getName().equals(connName))
				return conn;
		}
		return null;
	}
	
	

	public List<String> getVerificationPropStr() {
		return verificationPropStr;
	}

	public void print() {
		System.out.println("==========object=========");
		System.out.println(objCompList.toString());
		System.out.println(objConnList.toString());
		System.out.println(objPortList.toString());
		System.out.println(objRoleList.toString());
		System.out.println("==========init=========");
		printPredicateList(getInitPredList());
		System.out.println("==========goal=========");
		printPredicateList(getGoalPredList());
	}
	
	

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("(define (problem "+part.getName()+")\n"+
				  "(:domain arch)\n");
		sb.append("(:objects\n");
		sb.append(objCompList.toString()+"\n");
		sb.append(objConnList.toString()+"\n");
		sb.append(objPortList.toString()+"\n");
		sb.append(objRoleList.toString()+"\n");
		sb.append(")\n");
		sb.append("(:init\n");
		for (RefactorPredicate p : getInitPredList())
			sb.append(p.toString()+"\n");
		sb.append(")\n");
		sb.append("(:goal (and\n");
		for (RefactorPredicate p : getGoalPredList())
			sb.append(p.toString()+"\n");
		sb.append(")))\n");
		
		
		return sb.toString();
	}

	private void printPredicateList(List<RefactorPredicate> list) {
		for (RefactorPredicate p : list)
			System.out.println(p.toString());
	}

}

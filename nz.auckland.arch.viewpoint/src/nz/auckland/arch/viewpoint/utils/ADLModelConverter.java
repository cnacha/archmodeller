package nz.auckland.arch.viewpoint.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;

import nz.auckland.arch.ArchStyle;
import nz.auckland.arch.BehaviourPropType;
import nz.auckland.arch.BehaviourProperty;
import nz.auckland.arch.Channel;
import nz.auckland.arch.Component;
import nz.auckland.arch.Connector;
import nz.auckland.arch.ConnectorType;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.Event;
import nz.auckland.arch.ExprOperator;
import nz.auckland.arch.LTLExpr;
import nz.auckland.arch.LTLNestedExpr;
import nz.auckland.arch.LTLOperator;
import nz.auckland.arch.LTLRegularExpr;
import nz.auckland.arch.Port;
import nz.auckland.arch.Role;
import nz.auckland.arch.RoleType;
import nz.auckland.arch.VerificationProperty;

public class ADLModelConverter {

	DesignModel model;
	Port runPort = null;

	public ADLModelConverter(DesignModel model) {
		super();
		this.model = model;
	}

	public ADLModelConverter(DesignModel model, Port runPort) {
		super();
		this.model = model;
		this.runPort = runPort;
	}

	private String writeArchitectureStyles() {
		StringBuffer adlcode = new StringBuffer();
		for (ArchStyle style : model.getArchstyle()) {

			// print connector type definition
			for (ConnectorType conn : style.getConnectortype()) {
				adlcode.append("connector " + conn.getName() + " { \n");

				// print role process
				for (RoleType role : conn.getRoletype()) {
					String roleProcName = role.getName();
					if (hasInputArgumentExpr(role.getEvent())) {
						// require parameter for this process if channel output is before input
						roleProcName += "(j)";
					} else {
						// require no parameter
						roleProcName += "()";
					}

					adlcode.append("\t role " + roleProcName);
					if (role.getEvent().size() > 0)
						adlcode.append(" = ");

					String endProc = roleProcName;

					for (int i = 0; i < role.getEvent().size(); i++) {
						Event event = role.getEvent().get(i);
						if (!(event instanceof Channel)) {

							if (event.getName().equalsIgnoreCase("skip") || event.getName().equalsIgnoreCase("stop")) {
								// do not print skip and stop event, let the end proc handle it
								endProc = event.getName();
							} else {
								// print normal event
								adlcode.append(event.getName());
								adlcode.append(" -> ");
							}

						} else {
							// print channel output/input
							if ("output".equals(((Channel) event).getType())) {
								adlcode.append(event.getName() + "!j");
							} else {
								adlcode.append(event.getName() + "?j");
							}
							adlcode.append(" -> ");
						}

					}
					// finish role process
					if (role.getEvent().size() > 0)
						adlcode.append(endProc + ";\n");
					else
						adlcode.append(";\n");
				}
				// finish connector definition
				adlcode.append(" }\n");
			}
		}

		return adlcode.toString();
	}

	private String writeComponents() {
		StringBuffer adlcode = new StringBuffer();
		// print component definition
		for (Component comp : model.getComponent()) {
			adlcode.append("component " + comp.getName() + " { \n");
			for (Port port : comp.getPort()) {
				String portProcName = port.getName() + "()";
				adlcode.append("\t port " + portProcName + " = ");
				for (Event event : port.getEvents()) {
					adlcode.append(event.getName() + "->");
				}
				adlcode.append(portProcName + ";\n");
			}
			adlcode.append("}\n");
		}

		return adlcode.toString();
	}

	List<String> portProcList = new ArrayList<String>();

	private String writeSystemConfiguration(BehaviourProperty prop) {
		StringBuffer adlcode = new StringBuffer();
		// print system configuration
		adlcode.append("system " + model.getName() + " { \n");

		// print connector instance
		for (Connector conn : model.getConnector()) {
			adlcode.append("\t declare " + conn.getName() + " = " + conn.getConnectortype().getName() + "; \n");
		}

		// print port-role attachment

		for (Component comp : model.getComponent()) {
			for (Port port : comp.getPort()) {

				// check if checking for specific port
				//System.out.println("printing " + port.getName() + " typ:" + port.getType());
				if (runPort != null && port != runPort && port.getType()!=null && port.getType().indexOf("OutboundPort") != -1
						&& port.getType().indexOf("InboundPort") == -1) {
					// skip runing the other inbound port that is not the port to test
					continue;
				}

				String portProcName = comp.getName() + "." + port.getName() + "()";
				if (port.getRole().size() == 0)
					continue;
				portProcList.add(portProcName);

				adlcode.append("\t attach " + portProcName + " = ");
				// find start role
				HashSet<Role> roleSet = new HashSet<Role>();
				
				roleSet.addAll(port.getRole());
				//System.out.println("================="+portProcName+"  "+port.getRole().size());
//				for (Role role : port.getRole()) {
//					if (role.getNextRoleExpr() != null) {
//						roleSet.remove(role.getNextRoleExpr());
//					}
//				}
				System.out.println(".....attaching port "+portProcName+" "+roleSet);
				try {
					// left in the set is the start role

					Iterator roleIt = roleSet.iterator();
					Role currentRole =null;
					// find first role to begins
					if(roleSet.size()>1) {
						for(Role role: roleSet) {
							if(role.getNextRoleExpr()!=null) {
								if(currentRole == null ||  role.getNextRoleExpr() == currentRole)
									currentRole = role;
								
							}
						}
					} else {
						 currentRole = (Role)roleIt.next();
					}
					
					while (currentRole!=null) {
						
						// print attached role process
						System.out.println("			cnn:"+currentRole.getConnector()+"#role:"+currentRole.getName());
						if (hasInputArgumentExpr(currentRole.getRoletype().getEvent())) {
							adlcode.append(currentRole.getConnector().getName() + "." + currentRole.getName() + "("
									+ generateRandomDigits(2) + ")");
						} else {
							adlcode.append(currentRole.getConnector().getName() + "." + currentRole.getName() + "()");
						}
						// print operator
					//	if (currentRole.getNextRoleExpr()!=null) {
							
					//	}

						
						if(currentRole.getNextRoleExpr()!=null && roleSet.contains(currentRole.getNextRoleExpr())) {
							if (currentRole.getOperatorExpr() == ExprOperator.COUPLING) {
								adlcode.append(" <*> ");
							} else if (currentRole.getOperatorExpr() == ExprOperator.INTERLEAVE) {
								adlcode.append(" ||| ");
							} else if (currentRole.getOperatorExpr() == ExprOperator.PARALLEL) {
								adlcode.append(" || ");
							}
							currentRole = currentRole.getNextRoleExpr();
						} else {
							currentRole = null;
						}

					}

				} catch (Exception e) {
					e.printStackTrace();
				}
				adlcode.append(";\n");
			}
		}

		return adlcode.toString();
	}

	private String writeExecuteStatement() {
		StringBuffer adlcode = new StringBuffer();
		// print execute statement
		adlcode.append("\t execute ");
		for (int i = 0; i < portProcList.size(); i++) {
			adlcode.append(portProcList.get(i));
			if (i < portProcList.size() - 1)
				adlcode.append(" || ");
		}
		adlcode.append("\n");

		adlcode.append("}\n");
		return adlcode.toString();
	}

	private String writeLTLAssertion(BehaviourProperty prop, boolean applyNegation) {
		System.out.println("writing prop: "+prop.getName());
		StringBuffer adlcode = new StringBuffer();
		// print assertion for LTL
		StringBuffer ltlLogicStr = new StringBuffer();
		if (prop.getType() == BehaviourPropType.LTL) {

			adlcode.append("assert " + model.getName() + " |= ");

			// find start expr
			HashSet<LTLExpr> exprSet = new HashSet<LTLExpr>();
			exprSet.addAll(prop.getLtlexpr());
			for (LTLExpr expr : prop.getLtlexpr()) {
				if (expr.getNextExpr() != null) {
					exprSet.remove(expr.getNextExpr());
				}
			}
			
			
			// save LTL Expression Text
			// set expression to properties

			RecordingCommand updateCommand = new RecordingCommand(domain) {
				@Override
				protected void doExecute() {
					String ltlExpr = "";
					try {
						LTLExpr curExpr = exprSet.iterator().next();
						ltlExpr = getLTLExpr(model, curExpr);
						ltlLogicStr.append(ltlExpr+";\n");
						System.out.println("no errror");
						
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("error here getting ltl from"+prop.getExprText());
						ltlExpr = prop.getExprText();
						ltlLogicStr.append(ltlExpr+";\n");
					//	ltlLogic.append(prop.getExprText().substring(0,prop.getExprText().indexOf(";"))+";\n");
					}
					System.out.println("	ltl:"+ltlExpr);
					
					
					prop.setExprText(ltlExpr);
				}
			};
			domain.getCommandStack().execute(updateCommand);
			
			adlcode.append(ltlLogicStr);

			if (applyNegation) {
				// apply negation
				adlcode.append("assert " + model.getName() + " |= ");
				adlcode.append("! " + ltlLogicStr);
			}

		}

		return adlcode.toString();
	}

	private String writeAllAssertions() {
		StringBuffer adlcode = new StringBuffer();
		// print asssertion
		try {
			for (VerificationProperty p : model.getVerifyProperty()) {
				if (p instanceof BehaviourProperty) {
					BehaviourProperty prop = (BehaviourProperty) p;

					// print assertion for LTL
					if (prop.getType() == BehaviourPropType.LTL) {

						adlcode.append(writeLTLAssertion(prop, false));
					}

					// print assertion for CD
					else if (prop.getType() == BehaviourPropType.CIRCULAR_FREE) {
						adlcode.append("assert " + model.getName() + " circularfree;\n");
					}

					// print assertion for FD
					else if (prop.getType() == BehaviourPropType.DECOMPOSITION_FREE) {
						adlcode.append("assert " + model.getName() + " decompositionfree;\n");
					}

					// print assertion for PG
					else if (prop.getType() == BehaviourPropType.POLTERGEIST_FREE) {
						adlcode.append("assert " + model.getName() + " poltergeistfree;\n");
					}

					// print assertion for AI
					else if (prop.getType() == BehaviourPropType.AMBIGUOUS_INTERFACE_FREE) {
						adlcode.append("assert " + model.getName() + " ambiguousinterfacefree;\n");
					}

				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return adlcode.toString();
	}

	public String convert() {
		StringBuffer adlcode = new StringBuffer();

		adlcode.append(this.writeArchitectureStyles());
		adlcode.append(this.writeComponents());
		adlcode.append(this.writeSystemConfiguration(null));
		adlcode.append(this.writeExecuteStatement());
		adlcode.append(this.writeAllAssertions());

		return adlcode.toString();
	}

	public String convert(BehaviourProperty prop) {
		StringBuffer adlcode = new StringBuffer();

		adlcode.append(this.writeArchitectureStyles());
		adlcode.append(this.writeComponents());
		adlcode.append(this.writeSystemConfiguration(prop));

		adlcode.append(this.writeExecuteStatement());

		adlcode.append(this.writeLTLAssertion(prop, true));

		return adlcode.toString();
	}

	public static String getLTLExpr(DesignModel model, LTLExpr curExpr) throws Exception {

		if (curExpr instanceof LTLRegularExpr) {
			String eventLabel = getFullEventLabel(model, curExpr, curExpr.getEvent());
			if(eventLabel.equals("")) {
				throw new Exception("No design enitities found for event labelling");
			} else 
				return getLTLOperator(curExpr.getOperator()) + eventLabel
						+ ((curExpr.getNextExpr() != null) ? " -> " + getLTLExpr(model, curExpr.getNextExpr()) : "");
		} else if (curExpr instanceof LTLNestedExpr) {
			LTLNestedExpr nestedExpr = (LTLNestedExpr) curExpr;
			// find start expr in nested
			HashSet<LTLExpr> exprSet = new HashSet<LTLExpr>();
			exprSet.addAll(nestedExpr.getExpr());
			for (LTLExpr expr : nestedExpr.getExpr()) {
				if (expr.getNextExpr() != null) {
					exprSet.remove(expr.getNextExpr());
				}
			}
			LTLExpr stExpr = exprSet.iterator().next();

			return getLTLOperator(curExpr.getOperator()) + " (" + getLTLExpr(model, stExpr) + ")";
		} else
			return "";
	}

	public static String getLTLOperator(LTLOperator opt) {
		if (opt == LTLOperator.ALWAYS)
			return "[] ";
		else if (opt == LTLOperator.EVENTUALLY)
			return "<> ";
		else
			return "";
	}

	public static String getFullEventLabel(DesignModel model,LTLExpr curExpr, Event event) {
		System.out.println("getFullEventLabel "+curExpr.getRole());
		if(curExpr.getRole()!=null)
			return getFullRoleEventLabel(model,curExpr.getPort(), curExpr.getRole(), event);
		try {
			// loop through to check if it is component event.
			for (Component comp : model.getComponent()) {
				for (Port port : comp.getPort()) {
					for (Event current : port.getEvents()) {
						if (event == current)
							return comp.getName() + "." + port.getName() + "." + event.getName();
					}
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "";
	}

	public static String getFullRoleEventLabel(DesignModel model,Port prt, Role rle, Event event) {
		try {
			System.out.println("getFullRoleEventLabel is called");
			// loop through to check if it is connector event.
			for (Component comp : model.getComponent()) {
				for (Port port : comp.getPort()) {
						for (Role role : port.getRole()) {
							if (role == rle) {
								System.out.println("	found role..."+role.getName());
								for (Event current : rle.getRoletype().getEvent()) {
									if (event.getName().equals(current.getName())) {
										System.out.println("	found event..."+event.getName());
										return comp.getName() + "." + role.getConnector().getName() + "."
												+ role.getRoletype().getName() + "." + event.getName();
									}
								}
							}
						}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	public static boolean hasInputArgumentExpr(EList<Event> events) {
		boolean foundChannel = false;
		for (Event evnt : events) {
			if (evnt instanceof Channel) {

				if ("output".equals(((Channel) evnt).getType()) && !foundChannel) {
					return true;
				}
				foundChannel = true;
			}
		}
		return false;
	}

	public static int generateRandomDigits(int n) {
		int m = (int) Math.pow(10, n - 1);
		return m + new Random().nextInt(9 * m);
	}
	
	TransactionalEditingDomain domain;

	public void setEditingDomain(TransactionalEditingDomain domain) {
		this.domain = domain;
		
	}
}

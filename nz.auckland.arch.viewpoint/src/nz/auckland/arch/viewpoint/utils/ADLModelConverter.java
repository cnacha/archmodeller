package nz.auckland.arch.viewpoint.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.common.util.EList;

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

	public static String convert(DesignModel model) {
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

		// print system configuration
		adlcode.append("system " + model.getName() + " { \n");

		// print connector instance
		for (Connector conn : model.getConnector()) {
			adlcode.append("\t declare " + conn.getName() + " = " + conn.getConnectortype().getName() + "; \n");
		}

		// print port-role attachment
		List<String> portProcList = new ArrayList<String>();
		for (Component comp : model.getComponent()) {
			for (Port port : comp.getPort()) {
				String portProcName = comp.getName() + "." + port.getName() + "()";
				if(port.getRole().size() == 0)
					continue;
				portProcList.add(portProcName);
				
				adlcode.append("\t attach " + portProcName + " = ");
				// find start role
				HashSet<Role> roleSet = new HashSet<Role>();
				roleSet.addAll(port.getRole());
				for (Role role : port.getRole()) {
					if (role.getNextRoleExpr() != null) {
						roleSet.remove(role.getNextRoleExpr());
					}
				}
				try {
					// left in the set is the start role

					Role currentRole = roleSet.iterator().next();
					while (currentRole != null) {
						// print attached role process
						if (hasInputArgumentExpr(currentRole.getRoletype().getEvent())) {
							adlcode.append(currentRole.getConnector().getName() + "." + currentRole.getName() + "("
									+ generateRandomDigits(2) + ")");
						} else {
							adlcode.append(currentRole.getConnector().getName() + "." + currentRole.getName() + "()");
						}
						// print operator
						if (currentRole.getNextRoleExpr() != null) {
							if (currentRole.getOperatorExpr() == ExprOperator.COUPLING) {
								adlcode.append(" <*> ");
							} else if (currentRole.getOperatorExpr() == ExprOperator.INTERLEAVE) {
								adlcode.append(" ||| ");
							} else if (currentRole.getOperatorExpr() == ExprOperator.PARALLEL) {
								adlcode.append(" || ");
							}
						}

						currentRole = currentRole.getNextRoleExpr();

					}

				} catch (Exception e) {
					e.printStackTrace();
				}
				adlcode.append(";\n");
			}
		}

		// print execute statement
		adlcode.append("\t execute ");
		for (int i = 0; i < portProcList.size(); i++) {
			adlcode.append(portProcList.get(i));
			if (i < portProcList.size() - 1)
				adlcode.append(" || ");
		}
		adlcode.append("\n");

		adlcode.append("}\n");

		// print asssertion
		try {
			for (VerificationProperty p : model.getVerifyProperty()) {
				if (p instanceof BehaviourProperty) {
					BehaviourProperty prop = (BehaviourProperty) p;

					// print assertion for LTL
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
						LTLExpr curExpr = exprSet.iterator().next();
						adlcode.append(getLTLExpr(model, curExpr));

						adlcode.append(";\n");
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

	public static String getLTLExpr(DesignModel model, LTLExpr curExpr) throws Exception {

		if (curExpr instanceof LTLRegularExpr) {
			return getLTLOperator(curExpr.getOperator()) + getFullEventLabel(model, curExpr.getEvent())
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

	public static String getFullEventLabel(DesignModel model, Event event) {
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
			// loop through to check if it is connector event.
			for (Component comp : model.getComponent()) {
				for (Port port : comp.getPort()) {
					for (Role role : port.getRole()) {
						for (Event current : role.getRoletype().getEvent()) {
							if (event == current) {
								return comp.getName() + "." + role.getConnector().getName()
										+ role.getRoletype().getName() + "." + event.getName();
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
}

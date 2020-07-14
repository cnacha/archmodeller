package nz.auckland.arch.planner.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

import nz.auckland.arch.BehaviourProperty;
import nz.auckland.arch.Component;
import nz.auckland.arch.Connector;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.MigrationModel;
import nz.auckland.arch.Port;
import nz.auckland.arch.Role;
import nz.auckland.arch.VerificationProperty;
import nz.auckland.arch.planner.AbstractActionExecutioner;
import nz.auckland.arch.planner.object.Action;
import nz.auckland.arch.planner.object.Parameter;

public class NetworkRouteAction extends AbstractActionExecutioner {

	public NetworkRouteAction(DesignModel currentModel, Action action, MigrationModel migrationModel) {
		super(currentModel, action, migrationModel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public DesignModel run() {

		System.out.println("	NetworkRouteAction starts...");
		Parameter connParam = action.getParameter("connector");
		description = "network route for connector:"+connParam.getValue()+" between: ";
		List<Parameter> compParam = action.getParameterList("component");
		for(Parameter comp: compParam) {
			description+=comp.getValue()+" ";
		}

		if (connParam != null) {

			// create intermediate model
			interModel = EcoreUtil.copy(currentModel);
			interModel.setName("inter" + action.getId());

			// copyVerificationProperty(targetModel, interModel);

			// find connector in intermediate model and remove it
			Connector connToChange = null;
			for (Connector e : interModel.getConnector()) {
				if (e.getName().equalsIgnoreCase(connParam.getValue())) {
					connToChange = e;
					break;
				}
			}
			// find connector in target model
			Connector connToCopy = null;
			for (Connector tgtConn : targetModel.getConnector()) {

				if (tgtConn.getName().equalsIgnoreCase(connParam.getValue())) {
					connToCopy = tgtConn;
					break;
				}
			}
			System.out.println("connToChange:" + connToChange + " connToCopy:" + connToCopy);

			// if connector has been existed.
			if (connToChange != null) {
				if (!connToChange.getType().equals(connToCopy.getType())) {

					// start changing the type of connector
					connToChange.setType(connToCopy.getType());
					connToChange.setConnectortype(this.getConnectorType(connToCopy.getType()));

					// convert role
					HashMap<String, String> roleMapping = getRoleMapping(connToChange, connToCopy);
					List<Role> roleToRemove = new ArrayList<Role>();
					for (Role roleToChange : connToChange.getRole()) {

						System.out.println("Changing role from " + roleToChange.getName() + " to "
								+ roleMapping.get(roleToChange.getName()));
						if (roleMapping.containsKey(roleToChange.getName())) {
							roleToChange.setName(roleMapping.get(roleToChange.getName()));

						} else {
							roleToRemove.add(roleToChange);
						}
						// unlink role to any ports
						unlinkRole(interModel, roleToChange);
					}
					
					// remove uninvolved role.
					for(Role role: roleToRemove) {
						//unlinkRole(interModel, role);
						connToChange.getRole().remove(role);
						
					}
					// add missing role
					for (Role roleCopy : connToCopy.getRole()) {
						if (!roleMapping.containsValue(roleCopy.getName())) {
							Role roleToAdd = EcoreUtil.copy(roleCopy);
							connToChange.getRole().add(roleToAdd);

						}
					} 
					// end changing type
				}

			} else {
				// if connector does not exists, copy target connector
				connToChange = EcoreUtil.copy(connToCopy);
				interModel.getConnector().add(connToChange);
			}

			// connect role of connector to the right port
			HashMap<String, List<String>> roleportMap = getRolePortMapping(connToCopy);
			for (Role rle : connToChange.getRole()) {

				// not neccessary anymore, unlink role to port and reattach only when it is a part of action parameter
				// unlinkRole(interModel, rle);

				// loop through role port mapping
				if (roleportMap.containsKey(rle.getName())) {
					for (Component comp : interModel.getComponent()) {

						// only connect when component is the action's parameters
						//System.out.println("		" + action.getId() + " isCompInParameters:" + comp.getName() + "= "+ isCompInParameters(comp, compParam));
						if (isCompInParameters(comp, compParam)) {
							for (Port prt : comp.getPort()) {
								if (roleportMap.get(rle.getName()).contains(prt.getName())) {
									prt.getRole().add(rle);
									reconnectPortProcess(prt);
								}
							}
						}
					}
				}
			}

//			for(Component comp: targetModel.getComponent()) {
//				for(Port prt: comp.getPort()) {
//					// reconnect the role process
//					reconnectPortProcess(prt);
//				}
//			}

			// copy behaviour verification properties
			if (connToChange != null) {
				// find properties in target model
				List<VerificationProperty> propList = findBehaviourPropertiesByConnector(targetModel,
						connToChange.getName());

				// if the properties do not existed in the interim model, add them
				for (VerificationProperty prop : propList) {
					if (!this.isVerificationPropertyExisted(interModel, prop.getName())) {
						BehaviourProperty newprop = (BehaviourProperty) EcoreUtil.copy(prop);
						newprop.setTestport(
								findPortByName(interModel, ((BehaviourProperty) prop).getTestport().getName()));

						interModel.getVerifyProperty().add(newprop);

					}
				}
			}

			interModel = this.writeModel(interModel);
			return interModel;
		}

		return currentModel;
	}

	private void reconnectPortProcess(Port prt) {
		System.out.println("\treconnect port:"+prt.getName());
		for (Role rle : prt.getRole()) {
			reconnectRole(rle);
		}
	}

	private void reconnectRole(Role role) {
		System.out.println("\t\t reconnectRole:"+role.getConnector().getName()+"."+role.getName());
		for (Connector cconn : targetModel.getConnector())
			for (Role crole : cconn.getRole()) {
				
				if (crole.getName().equalsIgnoreCase(role.getName()) 
						&& role.getConnector().getName().equalsIgnoreCase(cconn.getName())) {
					
					// found the original role
					Role cnextRole = crole.getNextRoleExpr();
					System.out.println("\t\t\t found"+cconn.getName()+" "+crole.getName()+" next:"+cnextRole);
					// find role to connect				
					if (cnextRole != null) {
						System.out.println("		findingnextrole for "+role.getName()+ " "+cnextRole.getName());
						for (Connector tconn : interModel.getConnector()) {
							if (tconn.getName().equals(cnextRole.getConnector().getName())) {
								for (Role trole : tconn.getRole()) {
									if (trole.getName().equals(cnextRole.getName())) {
										System.out.println("		link " + role.getName() + "->" + trole.getName());
										role.setNextRoleExpr(trole);
										break;
									}
								}
								break;
							}
						}//end for
					} // end if
					break;
				}// end for role
			}

	}

	private boolean isCompInParameters(Component comp, List<Parameter> params) {
		// System.out.print(" isCompInParameters: ");
		for (Parameter param : params) {
			// System.out.print(" "+param.getValue());
			if (param.getValue().equalsIgnoreCase(comp.getName())) {
				// System.out.println();
				return true;
			}
		}
		// System.out.println();
		return false;
	}

	private void unlinkRole(DesignModel model, Role role) {
		System.out.println("	unlink:" + role.getName());
		for (Component comp : model.getComponent()) {
			for (Port prt : comp.getPort()) {
				// check if port contain role, remove anyhow*** remove it only when that port in the target does not have role
				if (prt.getRole().contains(role) /* && !hasPortwithRoleInTargetModel(prt.getName(), role.getName()) */)
					prt.getRole().remove(role);
			}
		}
	}

	private boolean hasPortwithRoleInTargetModel(String portName, String roleName) {
		for (Component comp : targetModel.getComponent()) {
			for (Port prt : comp.getPort()) {
				if (prt.getName().equalsIgnoreCase(portName)) {
					for (Role rle : prt.getRole()) {
						if (rle.getName().equalsIgnoreCase(roleName))
							return true;
					}
				}
			}
		}
		return false;
	}

	private HashMap<String, List<String>> getRolePortMapping(Connector tgtconn) {
		HashMap<String, List<String>> mapping = new HashMap<String, List<String>>();
		for (Role rle : tgtconn.getRole()) {
			List<String> prt = this.findPortByRole(targetModel, rle);
			if (prt != null) {
				mapping.put(rle.getName(), prt);
			}
		}
		return mapping;
	}

	private List<Role> getRoleNotInList(Connector conn1, Connector conn2) {
		List<Role> result = new ArrayList<Role>();
		for (Role role : conn1.getRole()) {
			if (!conn2.getRole().contains(role)) {
				result.add(role);
			}
		}
		return result;
	}

	private HashMap<String, String> getRoleMapping(Connector source, Connector target) {
		HashMap<String, String> mapping = new HashMap<String, String>();
		for (Role srole : source.getRole()) {
			for (Role trole : target.getRole()) {
				List<String> sportList = findPortByRole(interModel, srole);
				List<String> tportList = findPortByRole(targetModel, trole);
				System.out.println(srole.getName() + " " + trole.getName());
				for (String sport : sportList) {
					if (tportList.contains(sport) && !mapping.containsKey(srole.getName())) {
						mapping.put(srole.getName(), trole.getName());
						System.out.println("	mppaing:" + srole.getName() + "=" + trole.getName());
					}
				}

			}

		}

		return mapping;
	}

//	private Role getMatchingRole(List<Role> roleList1, List<Role> roleList2) {
//		for(Role role1: roleList1)
//			for(Role role2: roleList2) {
//				if(role1 == role2)
//					return role2;
//			}
//		return null;
//	}

	private List<String> findPortByRole(DesignModel model, Role role) {
		List<String> portList = new ArrayList<String>();
		for (Component comp : model.getComponent()) {
			// System.out.println(" "+comp.getName());
			for (Port port : comp.getPort()) {
				// System.out.println(" "+port.getName());
				if (port.getRole().contains(role))
					portList.add(port.getName());
			}
		}
		return portList;
	}

}

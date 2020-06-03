package nz.auckland.arch.planner.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;

import nz.auckland.arch.Component;
import nz.auckland.arch.Connector;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.Port;
import nz.auckland.arch.Role;
import nz.auckland.arch.planner.AbstractActionExecutioner;
import nz.auckland.arch.planner.object.Action;
import nz.auckland.arch.planner.object.Parameter;

public class NetworkRouteAction extends AbstractActionExecutioner {

	public NetworkRouteAction(DesignModel currentModel, Action action) {
		super(currentModel, action);
	}

	@Override
	public DesignModel run() {

		System.out.println("	NetworkRouteAction starts...");
		Parameter connParam = action.getParameter("connector");
		if (connParam != null) {

			// create intermediate model
			interModel = EcoreUtil.copy(currentModel);
			interModel.setName("inter" + action.getId());

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
					// convert the type of connector
					connToChange.setType(connToCopy.getType());
					HashMap<String, String> roleMapping = getRoleMapping(connToChange, connToCopy);

					// convert role
					for (Role roleToChange : connToChange.getRole()) {
						System.out.println("Changing role from " + roleToChange.getName() + " to "
								+ roleMapping.get(roleToChange.getName()));
						if (roleMapping.containsKey(roleToChange.getName())) {
							roleToChange.setName(roleMapping.get(roleToChange.getName()));
							//unlinkRole(interModel, roleToChange);
						}
					}
					// add missing role
					for (Role roleCopy : connToCopy.getRole()) {
						if (!roleMapping.containsValue(roleCopy.getName())) {
							Role roleToAdd = EcoreUtil.copy(roleCopy);
							connToChange.getRole().add(roleToAdd);
							
							// attach component to this role
//							Port portToCopy = this.findPortByRole(targetModel, roleCopy);
//							
//							for(Component comp: interModel.getComponent()) {
//								System.out.println("**"+comp.getName());
//								for(Port prt: comp.getPort()) {
//									System.out.println(prt.getName()+"====="+portToCopy.getName());
//									if(prt.getName().equals(portToCopy.getName())) {
//										System.out.println("adding role to port "+portToCopy.getName() +" "+roleToAdd.getName());
//										prt.getRole().add(roleToAdd);
//										break;
//									}
//								}
//							}
						}
					} // end changing type
					
				} 

			} else {
				// if connector does not exists, copy target connector
				connToChange = EcoreUtil.copy(connToCopy);
				interModel.getConnector().add(connToChange);
			}
			
			// connect role of connector to the right port
			HashMap<String,  List<String>> roleportMap = getRolePortMapping(connToCopy);
			for (Role rle : connToChange.getRole()) {
				unlinkRole(interModel, rle);
				if (roleportMap.containsKey(rle.getName())) {
					for (Component comp : interModel.getComponent()) {
						for (Port prt : comp.getPort()) {
							if (roleportMap.get(rle.getName()).contains(prt.getName())) {
								prt.getRole().add(rle);
							}
						}
					}
				}
			}

			interModel = this.writeModel(interModel);
			return interModel;
		}

		return currentModel;
	}
	
	private void unlinkRole(DesignModel model, Role role) {
		for(Component comp: model.getComponent()) {
			for(Port prt: comp.getPort()) {
				if(prt.getRole().contains(role))
					prt.getRole().remove(role);
			}
		}
	}

	private HashMap<String,  List<String>> getRolePortMapping(Connector tgtconn) {
		HashMap<String, List<String>> mapping = new HashMap<String,  List<String>>();
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
				for(String sport: sportList) {
					if(tportList.contains(sport) && !mapping.containsKey(srole.getName())) {
						mapping.put(srole.getName(), trole.getName());
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
		//	System.out.println("		"+comp.getName());
			for (Port port : comp.getPort()) {
			//	System.out.println("				"+port.getName());
				if (port.getRole().contains(role))
					portList.add(port.getName());
			}
		}
		return portList;
	}

}

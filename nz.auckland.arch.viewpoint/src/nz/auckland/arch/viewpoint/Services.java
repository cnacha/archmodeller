package nz.auckland.arch.viewpoint;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.RefreshRepresentationsCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.impl.FlatContainerStyleImpl;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.emfjson.jackson.databind.EMFContext;
import org.emfjson.jackson.module.EMFModule;
import org.emfjson.jackson.resource.JsonResourceFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nz.auckland.arch.ArchFactory;
import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.ArchStyle;
import nz.auckland.arch.BehaviourPropType;
import nz.auckland.arch.BehaviourProperty;
import nz.auckland.arch.Channel;
import nz.auckland.arch.Component;
import nz.auckland.arch.ComponentType;
import nz.auckland.arch.Connector;
import nz.auckland.arch.ConnectorType;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.Event;
import nz.auckland.arch.ExecutionEnvironment;
import nz.auckland.arch.InterimModel;
import nz.auckland.arch.LTLExpr;
import nz.auckland.arch.LTLNestedExpr;
import nz.auckland.arch.LTLOperator;
import nz.auckland.arch.LTLRegularExpr;
import nz.auckland.arch.MigrationModel;
import nz.auckland.arch.Port;
import nz.auckland.arch.RefactorSet;
import nz.auckland.arch.Role;
import nz.auckland.arch.RoleType;
import nz.auckland.arch.VerificationProperty;
import nz.auckland.arch.impl.ArchFactoryImpl;
import nz.auckland.arch.impl.ConnectorImpl;
import nz.auckland.arch.impl.DesignModelImpl;
import nz.auckland.arch.planner.EvolutionPathVerifier;
import nz.auckland.arch.planner.PlanReportGenerator;
import nz.auckland.arch.planner.PlannerJob;
import nz.auckland.arch.refactor.RefactorEngine;
import nz.auckland.arch.refactor.function.RefactorFunctionEngine;
import nz.auckland.arch.viewpoint.model.ADLVerifyRequest;
import nz.auckland.arch.viewpoint.model.ADLVerifyResult;
import nz.auckland.arch.viewpoint.utils.ADLModelConverter;
import nz.auckland.arch.viewpoint.utils.BehaviourPropVerifyJob;
import nz.auckland.arch.viewpoint.utils.BehaviourVerifyJob;
import nz.auckland.arch.viewpoint.utils.ModelSimulation;
import nz.auckland.arch.viewpoint.utils.Mutex;
import nz.auckland.arch.viewpoint.utils.SecurityVerifyJob;
import nz.auckland.arch.viewpoint.utils.SmellVerifyJob;
import nz.auckland.arch.viewpoint.utils.StructureVerifyJob;

/**
 * The services class used by VSM.
 */
public class Services {

//	public EObject myService(EObject self, String arg) {
//		System.out.println("myservice is called: " + arg);
//		return self;
//	}
	
	public EObject refactorStructure(EObject self) {
		DesignModel model = (DesignModel) self;

		RefactorEngine engine = new RefactorEngine();
		
		engine.start(model);
		return model;
	}
	
	public EObject refactorFunction(EObject self) {
		RefactorSet set = (RefactorSet)self;
		RefactorFunctionEngine engine = new RefactorFunctionEngine();
		
		engine.start(set);
		return self;
	}
	
	public EObject planMigration(EObject self) {
		System.out.println("planMigration called");
		MigrationModel model = (MigrationModel) self;

		PlannerJob job = new PlannerJob("Planning migration to target architecture design", model);
		job.schedule();
		
		return model;
	}
	
	public EObject reportEvolutionPath(EObject self) {
		System.out.println("reportEvolutionPath is called");
		MigrationModel model = (MigrationModel) self;
		PlanReportGenerator report = new PlanReportGenerator(model);
		report.run();
		return model;
	}
	
	public EObject verifyEvolutionPath(EObject self) {
		MigrationModel model = (MigrationModel) self;
		EvolutionPathVerifier verifier = new EvolutionPathVerifier(model);
		verifier.start();
		
		return model;
	}
	
	public EObject verifyStructureOfMigrationModel(EObject self) {
		MigrationModel model = (MigrationModel) self;
		List<InterimModel> interimList =  model.getInterimmodels();
		for(InterimModel interim :interimList) {
			StructureVerifyJob job = new StructureVerifyJob("Verifying model structure: "+interim.getDesignmodel().getName(), interim.getDesignmodel());
			job.setRule(mutex);
			job.schedule();
			
		}

		return model;
	}

	public EObject verifyStructure(EObject self) {
		DesignModel model = (DesignModel) self;
		
		StructureVerifyJob job = new StructureVerifyJob("Verifying model structure", model);
		job.schedule();
		return job.getModel();
	}
	
	
	public EObject checkSmell(EObject self) {
		DesignModel model = (DesignModel) self;
		
		SmellVerifyJob job = new SmellVerifyJob("CHecking Smell on model", model);
		job.schedule();
		return job.getModel();
	}
	
	public static final ISchedulingRule mutex = new Mutex();
	
	public EObject verifyBehaviour(EObject self) {

		DesignModel model = (DesignModel) self;
//		BehaviourVerifyJob job = new BehaviourVerifyJob("Verifying behaviour properties", model);
//		job.schedule();
		
		for(VerificationProperty prop:model.getVerifyProperty()) {
			BehaviourPropVerifyJob job = new BehaviourPropVerifyJob("Verifying property "+prop.getName(),
					(BehaviourProperty) prop);
			job.setRule(mutex);
			job.schedule();
		}
		return model;

	}

	public EObject verifyBehaviourProp(EObject self) {

		if (self instanceof BehaviourProperty) {
			if (((BehaviourProperty) self).getTestport() == null) {
				((BehaviourProperty) self).setValid(false);
				showMessage("Test Port is required, please set");
			}
			BehaviourPropVerifyJob job = new BehaviourPropVerifyJob("Verifying behaviour property",
					(BehaviourProperty) self);
			job.schedule();
		}

		return self;
	}

	public EObject resetAdversary(EObject self) {
		System.out.println("resetAdversary" + self);
		DesignModel model = (DesignModel) self;
		// remove adversary component
		List<Component> compToRemove = new ArrayList<Component>();
		List<VerificationProperty> propToRemove = new ArrayList<VerificationProperty>();
		try {
			for (Component comp : model.getComponent()) {
				if ("adversary".equals(comp.getType())) {
					compToRemove.add(comp);
				}
			}
			for (VerificationProperty prop : model.getVerifyProperty()) {
				if (prop.getName().startsWith("Adversary"))
					propToRemove.add(prop);
			}

			model.getComponent().removeAll(compToRemove);
			model.getVerifyProperty().removeAll(propToRemove);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return self;
	}

	public EObject generateAdversary(EObject self, String attackName, String attackCode) {

		DesignModel model = (DesignModel) self;

		try {
			ArchFactory factory = ArchFactoryImpl.init();
			// find connector with DenialOfService
			int advId = 1;
			for (Connector con : model.getConnector()) {
				if (con.getSecurityCharacters() != null && con.getSecurityCharacters().indexOf(attackName) != -1) {

					// create DOS adversary
					Component adversary = factory.createComponent();

					adversary.setName("Adversary" + attackCode + advId);
					adversary.setType("adversary");
					// create attack port
					Port attackPort = factory.createPort();
					attackPort.setName("attack" + advId);
					attackPort.setType("OutboundPort");
					adversary.getPort().add(attackPort);
					// add event to port
					Event attackedEvt = factory.createEvent();
					attackedEvt.setName("attacked");
					attackPort.getEvents().add(attackedEvt);

					// attach to outbound role of this connector
					List<Role> inRleList = new ArrayList<Role>();
					for (Role rle : con.getRole()) {
						if (rle.getType().indexOf("out") != -1) {
							attackPort.getRole().add(rle);
						} else if (rle.getType().indexOf("in") != -1) {
							inRleList.add(rle);
						}

					}
					model.getComponent().add(adversary);
					advId++;

					// create LTL property for attack scenario
					for (Role inRle : inRleList) {

						// find component attached to this role
						for (Component comp : model.getComponent()) {
							for (Port inPort : comp.getPort()) {
								if (inPort.getRole().contains(inRle)) {

									// found dos port at component, generate LTL
									BehaviourProperty prop = factory.createBehaviourProperty();
									prop.setName(adversary.getName() + "VerifyProp");
									prop.setTestport(attackPort);

									// use progress (lead to) operator
									LTLNestedExpr expr = factory.createLTLNestedExpr();
									expr.setOperator(LTLOperator.ALWAYS);
									prop.getLtlexpr().add(expr);

									// add component event as begin -> target

									/****** attack port-role -> target port ****/
									LTLRegularExpr innerExprBegin = factory.createLTLRegularExpr();
									innerExprBegin.setPort(attackPort);
									innerExprBegin.setRole(attackPort.getRole().get(0));
									innerExprBegin
											.setEvent(attackPort.getRole().get(0).getRoletype().getEvent().get(0));
									expr.getExpr().add(innerExprBegin);

									LTLRegularExpr innerExprTarget = factory.createLTLRegularExpr();
									innerExprTarget.setEvent(inPort.getEvents().get(0));
									innerExprTarget.setOperator(LTLOperator.EVENTUALLY);
									innerExprBegin.setNextExpr(innerExprTarget);
									expr.getExpr().add(innerExprTarget);

									/******
									 * target component -> attack port LTLRegularExpr innerExprBegin =
									 * factory.createLTLRegularExpr();
									 * innerExprBegin.setEvent(inPort.getEvents().get(0));
									 * expr.getExpr().add(innerExprBegin);
									 * 
									 * // add adversary attacked event as target LTLRegularExpr innerExprTarget =
									 * factory.createLTLRegularExpr(); innerExprTarget.setEvent(attackedEvt);
									 * innerExprTarget.setOperator(LTLOperator.EVENTUALLY);
									 * innerExprBegin.setNextExpr(innerExprTarget);
									 * expr.getExpr().add(innerExprTarget);
									 *********/
									model.getVerifyProperty().add(prop);
								}

							}
						}
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return model;
	}

	public EObject verifySecurity(EObject self) {
		DesignModel model = (DesignModel) self;

		SecurityVerifyJob job = new SecurityVerifyJob("Verifying model security", model);
		job.schedule();
		return job.getModel();
	}

	public EList getAllArchStyles(EObject self) {
		DesignModel model = (DesignModel) self;
		return model.getArchstyle();
	}

	public EObject createConnector(EObject self, EObject type) {
		System.out.println("createConnector() is called " + type);
		if (self instanceof DesignModel) {
			DesignModel model = (DesignModel) self;

			// find architecture style object
			ArchStyle selectedStyle = (ArchStyle) type;
			/*
			 * for(ArchStyle style: model.getArchstyle()) { if(style == type) {
			 * selectedStyle = style; break; } }
			 */

			// create connector type
			if (selectedStyle != null && selectedStyle.getConnectortype().size() > 0) {
				ConnectorType connType = selectedStyle.getConnectortype().get(0);
				ArchFactory factory = ArchFactoryImpl.init();
				Connector con = factory.createConnector();
				con.setName("conn");
				con.setConnectortype(connType);
				con.setType(connType.getName());
				for (RoleType roleType : connType.getRoletype()) {
					Role role = factory.createRole();
					role.setConnector(con);
					role.setName(roleType.getName());
					role.setType(roleType.getName());
					role.setRoletype(roleType);
					con.getRole().add(role);
				}
				((DesignModel) self).getConnector().add(con);
			}

		}

		return self;
	}

	public List<EObject> getCompPortsForExpr(EObject self) {
		System.out.println("getCompPortsForExpr called " + self);
		DesignModel model = null;
		if (self instanceof BehaviourProperty) {
			BehaviourProperty prop = (BehaviourProperty) self;
			model = prop.getModel();
		} else if (self instanceof LTLNestedExpr) {
			model = ((LTLNestedExpr) self).getProperty().getModel();
		}

		List<EObject> result = new ArrayList<EObject>();
		for (Component comp : model.getComponent()) {

			for (Port port : comp.getPort()) {

				result.add(port);
				// result.addAll(port.getEvents());
			}
		}

		return result;
	}

	public List<EObject> getConnRolesForExpr(EObject self) {
		System.out.println("getConnRolesForExpr called " + self);
		DesignModel model = null;
		if (self instanceof BehaviourProperty) {
			BehaviourProperty prop = (BehaviourProperty) self;
			model = prop.getModel();
		} else if (self instanceof LTLNestedExpr) {
			model = ((LTLNestedExpr) self).getProperty().getModel();
		}

		List<EObject> result = new ArrayList<EObject>();
		for (Connector conn : model.getConnector()) {

			for (RoleType role : conn.getConnectortype().getRoletype()) {
				result.add(role);
				// result.addAll(port.getEvents());
			}
		}

		return result;
	}

	private void showMessage(String msg) {
		// show error when deploy on something else other than node
		MessageBox dialog = new MessageBox(Display.getCurrent().getActiveShell(), SWT.ICON_WARNING | SWT.OK);
		dialog.setText("Warning");
		dialog.setMessage(msg);

		// open dialog and await user
		dialog.open();
	}

	public List<EObject> getAllComponentsToDeploy(EObject self) {
		System.out.println("getAllComponents called " + self);
		if (!(self instanceof ExecutionEnvironment)) {

			// show error when deploy on something else other than node
			showMessage("Component can be deployed on node only");
			return null;
		} else {

			// find all components
			List<EObject> result = new ArrayList<EObject>();
			List<Component> comps = ((DesignModel) ((ExecutionEnvironment) self).eContainer().eContainer())
					.getComponent();
			for (Component comp : comps) {
				if (comp.getDeploymentnode() == null) {
					result.add(comp);
				}
			}
			return result;
		}
	}

	public EObject deployComponent(EObject self, EObject comp) {
		System.out.println("deployComponent " + comp + " to " + self);
		if (self instanceof ExecutionEnvironment && comp instanceof Component) {
			// add component to deployment node
			// set deployment node to component
			((ExecutionEnvironment) self).getComponent().add((Component) comp);
			((Component) comp).setDeploymentnode((ExecutionEnvironment) self);
		}
		return self;
	}

	public EObject getModelForExpr(EObject self) {
		System.out.println(" getModelForExpr called " + self);
		if (self instanceof BehaviourProperty) {
			BehaviourProperty prop = (BehaviourProperty) self;
			return prop.getModel();

		} else if (self instanceof LTLNestedExpr) {
			LTLNestedExpr nexpr = (LTLNestedExpr) self;
			return nexpr.getProperty().getModel();
		}

		return null;
	}

	public EObject test(EObject self) {
		System.out.println(" test " + self);
		return self;
	}

	public EObject createLTLExpr(EObject self, EObject event) {
		System.out.println("createLTLExpr called");
		BehaviourProperty prop = null;
		try {
			prop = (BehaviourProperty) self;
			ArchFactory factory = ArchFactoryImpl.init();
			LTLExpr expr = (LTLExpr) factory.createLTLRegularExpr();
			expr.setEvent((Event) event);
			prop.getLtlexpr().add(expr);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return prop;
	}

	public EObject createLTLSubExpr(EObject self, EObject event) {
		System.out.println("createLTLSubExpr called");
		LTLNestedExpr nesexpr = (LTLNestedExpr) self;
		ArchFactory factory = ArchFactoryImpl.init();
		LTLExpr expr = (LTLExpr) factory.createLTLRegularExpr();
		expr.setEvent((Event) event);
		nesexpr.getExpr().add(expr);
		return expr;
	}

	// type 0=trace example, 1=counter example
	public EObject simulate(EObject self, int type) {

		System.out.println("simulate is called...." + self);

		// check if the property has passed in
		if (!(self instanceof BehaviourProperty))
			return self;

		// DesignModel model = (DesignModel)self;
		ModelSimulation sim = new ModelSimulation();
		try {

			BehaviourProperty prop = (BehaviourProperty) self;

			if (type == 1) {
				if (prop.getCounterExample() == null || "".equals(prop.getCounterExample()))
					this.showMessage("No Counter Example found!");
				else {
					sim.setupRpstElementHash();
					sim.run(prop.getCounterExample());
				}
			} else if (type == 0) {
				if (prop.getTraceExample() == null || "".equals(prop.getTraceExample()))
					this.showMessage("No Trace Example found!");
				else {
					sim.setupRpstElementHash();
					sim.run(prop.getTraceExample());
				}
			}

		} catch (Exception e) {
			System.out.println("error occured here...");
			e.printStackTrace();
		}

		return self;
	}

	public boolean isLTLProp(EObject object) {
		// System.out.println(object);
		if (object instanceof BehaviourProperty) {
			BehaviourProperty prop = (BehaviourProperty) object;
			if (prop.getType() == BehaviourPropType.LTL)
				return true;
		}
		return false;
	}
	/*
	 * public EObject createBehaviourDataTampering(EObject self) { // find data
	 * tampering component DesignModel model = (DesignModel) self;
	 * 
	 * for(Component comp: model.getComponent()) { // create LTL to check
	 * DenialOfService to critical component
	 * if(comp.getSecurityCharacters().indexOf("DenialOfService")!=-1) {
	 * 
	 * } }
	 * 
	 * return self; }
	 */
}

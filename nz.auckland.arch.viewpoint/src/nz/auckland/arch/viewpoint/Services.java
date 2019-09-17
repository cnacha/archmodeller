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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
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

import javax.inject.Inject;

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
import nz.auckland.arch.LTLExpr;
import nz.auckland.arch.LTLNestedExpr;
import nz.auckland.arch.Port;
import nz.auckland.arch.Role;
import nz.auckland.arch.RoleType;
import nz.auckland.arch.VerificationProperty;
import nz.auckland.arch.impl.ArchFactoryImpl;
import nz.auckland.arch.impl.ConnectorImpl;
import nz.auckland.arch.impl.DesignModelImpl;
import nz.auckland.arch.viewpoint.model.ADLVerifyRequest;
import nz.auckland.arch.viewpoint.model.ADLVerifyResult;
import nz.auckland.arch.viewpoint.utils.ADLModelConverter;
import nz.auckland.arch.viewpoint.utils.BehaviourVerifyJob;
import nz.auckland.arch.viewpoint.utils.ModelSimulation;
import nz.auckland.arch.viewpoint.utils.StructureVerifyJob;

/**
 * The services class used by VSM.
 */
public class Services {
	

//	public EObject myService(EObject self, String arg) {
//		System.out.println("myservice is called: " + arg);
//		return self;
//	}

	public EObject verifyStructure(EObject self) {
		DesignModel model = (DesignModel) self;

		StructureVerifyJob job = new StructureVerifyJob("Verifying model structure", model);
		job.schedule();
		return job.getModel();
	}
	
	public EObject verifyBehaviour(EObject self) {
		
		DesignModel model = (DesignModel) self;
		BehaviourVerifyJob job = new BehaviourVerifyJob("Verifying behaviour properties",model);
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
		System.out.println("getCompPortsForExpr called "+ self);
		DesignModel model = null;
		if(self instanceof BehaviourProperty) {
			BehaviourProperty prop = (BehaviourProperty) self;
			model = prop.getModel();
		} else if(self instanceof LTLNestedExpr) {
			model = ((LTLNestedExpr)self).getProperty().getModel();
		}
		
		List<EObject> result = new ArrayList<EObject>();
		for(Component comp: model.getComponent()) {
			
			for(Port port: comp.getPort()) {
				
				result.add(port);
			//	result.addAll(port.getEvents());
			}
		}
		
		return result;
	}
	
	public List<EObject> getConnRolesForExpr(EObject self) {
		System.out.println("getConnRolesForExpr called "+ self);
		DesignModel model = null;
		if(self instanceof BehaviourProperty) {
			BehaviourProperty prop = (BehaviourProperty) self;
			model = prop.getModel();
		} else if(self instanceof LTLNestedExpr) {
			model = ((LTLNestedExpr)self).getProperty().getModel();
		}
		
		List<EObject> result = new ArrayList<EObject>();
		for(Connector conn: model.getConnector()) {
			
			for(RoleType role: conn.getConnectortype().getRoletype()) {
				result.add(role);
			//	result.addAll(port.getEvents());
			}
		}
		
		return result;
	}
	
	
	public EObject getModelForExpr(EObject self) {
		System.out.println(" getModelForExpr called "+ self);
		if(self instanceof BehaviourProperty) {
			BehaviourProperty prop = (BehaviourProperty) self;
			return prop.getModel();
			
		} else if(self instanceof LTLNestedExpr) {
			LTLNestedExpr nexpr = (LTLNestedExpr) self;
			return nexpr.getProperty().getModel();
		}
		
		return null;
	}
	
	public EObject test(EObject self) {
		System.out.println(" test "+ self);
		return self;
	}
	
	public EObject createLTLExpr(EObject self, EObject event) {
		BehaviourProperty prop = (BehaviourProperty) self;
		ArchFactory factory = ArchFactoryImpl.init();
		LTLExpr expr = (LTLExpr)factory.createLTLRegularExpr();
		expr.setEvent((Event)event);
		prop.getLtlexpr().add(expr);
		return expr;
	}
	
	public EObject createLTLSubExpr(EObject self, EObject event) {
		LTLNestedExpr nesexpr = (LTLNestedExpr) self;
		ArchFactory factory = ArchFactoryImpl.init();
		LTLExpr expr = (LTLExpr)factory.createLTLRegularExpr();
		expr.setEvent((Event)event);
		nesexpr.getExpr().add(expr);
		return expr;
	}
	

	
	
	
	public EObject simulate(EObject self) {
		
		System.out.println("simulate is called...." + self);
		
		// check if the property has passed in
		if(! (self instanceof BehaviourProperty))
			return self;
		
		// DesignModel model = (DesignModel)self;
		ModelSimulation sim = new ModelSimulation();
		try {
			
			BehaviourProperty prop = (BehaviourProperty) self;
			if (!prop.isValid()) {
				sim.setupRpstElementHash();
				sim.run(prop.getCounterExample());
			} else {
				MessageBox dialog =
					    new MessageBox(Display.getCurrent().getActiveShell(), SWT.ICON_WARNING | SWT.OK);
					dialog.setText("Warning");
					dialog.setMessage("This property is valid without any counterexample");

					// open dialog and await user selection
					dialog.open();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return self;
    }
	
	public boolean isLTLProp(EObject object) {
		//System.out.println(object);
		if(object instanceof BehaviourProperty) {
			BehaviourProperty prop = (BehaviourProperty) object;
			if(prop.getType() == BehaviourPropType.LTL )
				return true;
		}
		return false;
	}

}

package nz.auckland.arch.refactor.function;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.emfjson.jackson.annotations.EcoreIdentityInfo;
import org.emfjson.jackson.module.EMFModule;
import org.emfjson.jackson.resource.JsonResourceFactory;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import nz.auckland.arch.ArchFactory;
import nz.auckland.arch.ArchPackage;
import nz.auckland.arch.Component;
import nz.auckland.arch.Connector;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.InterimModel;
import nz.auckland.arch.MigrationModel;
import nz.auckland.arch.impl.ArchFactoryImpl;
import nz.auckland.arch.planner.AbstractActionExecutioner;
import nz.auckland.arch.planner.action.DeployServiceAction;
import nz.auckland.arch.planner.action.NetworkRouteAction;
import nz.auckland.arch.planner.action.SetupApplicationAction;
import nz.auckland.arch.planner.action.SetupDatabaseAction;
import nz.auckland.arch.planner.object.Action;
import nz.auckland.arch.planner.object.MigrationRequest;
import nz.auckland.arch.planner.object.Parameter;
import nz.auckland.arch.planner.object.Plan;

public class RefactorPlannerJob extends Job {

	private static String HOSTNAME = "http://10.1.29.238:8080";// "http://fasad.cer.auckland.ac.nz:8080";

	private String problemStr;
	private boolean finished=false;

	public RefactorPlannerJob(String name, String problemStr) {
		super(name);
		this.problemStr = problemStr;
		
	}
	
	private Plan refactorPlan;
	
	

	public Plan getRefactorPlan() {
		return refactorPlan;
	}



	public boolean isFinished() {
		return finished;
	}



	@Override
	protected IStatus run(IProgressMonitor monitor) {
		System.out.println("Planning Refactoring Job is called");

		try {
			
			// call web service to verify in OWL
			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpPost request = new HttpPost(
					HOSTNAME + "/nz.auckland.arch.service.owl-0.0.1-SNAPSHOT/api/plan/planRefactor.do");
			StringEntity params = new StringEntity(problemStr);
			request.addHeader("content-type", "application/text");
			request.setEntity(params);
			HttpResponse response = httpClient.execute(request);
			HttpEntity entity = response.getEntity();
			String resString = EntityUtils.toString(entity, "UTF-8");
			System.out.println(resString);

			// parse migration to object
			GsonBuilder builder = new GsonBuilder();
			Gson gson = builder.create();
			refactorPlan = gson.fromJson(resString, Plan.class);
			
			finished = true;
			System.out.println("Planning Refactoring Job is finished");

		} catch (Exception e) {
			System.out.println("error....");
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		} 

		return Status.OK_STATUS;
	}



}

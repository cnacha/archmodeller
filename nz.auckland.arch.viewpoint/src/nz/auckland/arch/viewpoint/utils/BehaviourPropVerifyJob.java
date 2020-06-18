package nz.auckland.arch.viewpoint.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

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
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import nz.auckland.arch.BehaviourProperty;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.Port;
import nz.auckland.arch.VerificationProperty;
import nz.auckland.arch.viewpoint.model.ADLVerifyRequest;
import nz.auckland.arch.viewpoint.model.ADLVerifyResult;

public class BehaviourPropVerifyJob extends Job {
	
	//private static final String serviceurl = "http://localhost:53979/api/adlapi/verify";
	private static final String serviceurl = "http://fasad.cer.auckland.ac.nz/api/adlapi/verify";

	private BehaviourProperty prop;



	
	public BehaviourPropVerifyJob(String name, BehaviourProperty prop) {
		super(name);
		this.prop = prop;
	}

	private List<ADLVerifyResult> resultObjList;

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		if(prop.getTestport() == null)
			return Status.CANCEL_STATUS;
		// convert design model into ADL
		IEditingSession session = SessionUIManager.INSTANCE.getUISessions().iterator().next();
		TransactionalEditingDomain domain = session.getSession().getTransactionalEditingDomain();
		
		DesignModel model = (DesignModel)prop.eContainer();
		ADLModelConverter converter = new ADLModelConverter(model, prop.getTestport());
		converter.setEditingDomain(domain);
		String adl = converter.convert(prop);
		System.out.println(adl);
		// create request object
		ADLVerifyRequest reqObj = new ADLVerifyRequest(model.getName(), adl);

		// call web service to verify ADL
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpPost request = new HttpPost(serviceurl);
		try {
			// create request
			Gson gson = new Gson();
			String reqString = gson.toJson(reqObj);
	//		System.out.println(reqString);
//			System.out.println("#############################################");
			StringEntity params = new StringEntity(reqString);
			request.addHeader("content-type", "application/json");
			request.setEntity(params);

			// making a request
			HttpResponse response = httpClient.execute(request);

			// read response message
			HttpEntity entity = response.getEntity();
			String resString = EntityUtils.toString(entity, "UTF-8");
			Type listType = new TypeToken<List<ADLVerifyResult>>() {
			}.getType();
			resultObjList = gson.fromJson(resString, listType);

		} catch (Exception e) {
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		}

		// set result to properties
		

		RecordingCommand updateCommand = new RecordingCommand(domain) {
			@Override
			protected void doExecute() {

				// loop through all property
				for (VerificationProperty p : model.getVerifyProperty()) {

					// find the right property to set result
					if (p == prop) {
						BehaviourProperty prop = (BehaviourProperty) p;

						// retrieve result in order
						ADLVerifyResult result = resultObjList.get(0);
						System.out.println(result.getFullResultString());

						// set valid/invalid result
						if ("valid".equals(resultObjList.get(0).getResult()) && result.getVisitedStates()>1) {
							prop.setValid(true);
						} else {
							prop.setValid(false);
						}
						// set counter example if there is
						if (!prop.isValid() && result.getFullResultString().indexOf("<init") != -1) {
							int startInd = result.getFullResultString().indexOf("<init -> ");
							int endInd = result.getFullResultString().lastIndexOf(">");
							prop.setCounterExample(result.getFullResultString().substring(startInd + 1, endInd));
						}

						// set verification statistic
						prop.setVerifyTime(result.getVerificationTime());
						prop.setVisitedStates(result.getVisitedStates());
						System.out.println("number of states: "+result.getVisitedStates());
						
						// set traceExample when negation is applied
						if(resultObjList.size()>1) {
							String fullresult = resultObjList.get(1).getFullResultString();
							System.out.println(fullresult);
							int startInd = fullresult.indexOf("<init -> ");
							int endInd = fullresult.lastIndexOf(">");
							prop.setTraceExample(fullresult.substring(startInd+1, endInd));
						}
						
						return;
					}
				}
			}
		};
		domain.getCommandStack().execute(updateCommand);

		return Status.OK_STATUS;
	}

}

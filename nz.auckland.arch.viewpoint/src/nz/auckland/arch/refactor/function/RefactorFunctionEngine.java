package nz.auckland.arch.refactor.function;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import nz.auckland.arch.ArchFactory;
import nz.auckland.arch.BehaviourProperty;
import nz.auckland.arch.Component;
import nz.auckland.arch.Connector;
import nz.auckland.arch.DesignModel;
import nz.auckland.arch.InterimModel;
import nz.auckland.arch.MigrationModel;
import nz.auckland.arch.Port;
import nz.auckland.arch.RefactorPart;
import nz.auckland.arch.RefactorSet;
import nz.auckland.arch.Role;
import nz.auckland.arch.VerificationProperty;
import nz.auckland.arch.impl.ArchFactoryImpl;
import nz.auckland.arch.planner.PlannerJob;
import nz.auckland.arch.planner.object.Action;
import nz.auckland.arch.planner.object.Plan;
import nz.auckland.arch.refactor.AbstractRefactor;
import nz.auckland.arch.refactor.function.action.LinkConnection;
import nz.auckland.arch.refactor.function.action.RemoveConnector;
import nz.auckland.arch.refactor.function.action.SetupComponent;
import nz.auckland.arch.refactor.function.action.SetupConnector;
import nz.auckland.arch.viewpoint.utils.Mutex;

public class RefactorFunctionEngine {

	private static final String fileName = "evolution.arch";
	
	MigrationModel mgtModel;

	public void start(RefactorSet set) {
		System.out.println("Refactoring functions starts");

		DesignModel srcModel = set.getSource();
		ArchFactory factory = ArchFactoryImpl.init();
		// generate predicate and plan
		try {
		//	this.generateSourcePredicates(set);
			// plan refactoring
			List<Plan> planList = this.planDesignRefactoring(set);
			
			// create evolution model using migration model
			MigrationModel evolutionModel = ArchFactory.eINSTANCE.createMigrationModel();
			evolutionModel.setSource(srcModel);
			
			// apply step of changes to create interim model
			InterimModel prevModel = null;
			for(Plan plan: planList) {
				boolean addPropComplete = true;
				for(int i=0;i< plan.getSteps().size();i++){
					// copy model
					DesignModel newModel;
					if(prevModel!=null) // create model from the previous
					     newModel = EcoreUtil.copy(prevModel.getDesignmodel());
					else // create model from source model, if it is the first step
						newModel = EcoreUtil.copy(srcModel);
					
					
					// create new interim design note: name without - as - cause error in PAT
					newModel.setName("interim"+plan.getPart().getName()+i);
					Action action  = plan.getSteps().get(i);
					System.out.println("creating "+newModel.getName()+" : "+action.getName());
					
					//perform action on model
					if(action.getName().equals("setup-component")) {
						AbstractRefactor refactor = new SetupComponent(newModel, plan, action);
						refactor.run();
					} else if(action.getName().equals("setup-connector")) {
						AbstractRefactor refactor = new SetupConnector(newModel, plan, action);
						refactor.run();
					}  else if(action.getName().equals("establish-link")) {
						AbstractRefactor refactor = new LinkConnection(newModel, plan, action);
						refactor.run();
					} else if(action.getName().equals("remove-connector")) {
						AbstractRefactor refactor = new RemoveConnector(newModel, plan, action);
						refactor.run();
					}
					
					//TODO: get rid of disintegrated part
					
					
				
					//add verification properties from the refactor part
					int exprInd =1;
					for(String exprStr : plan.getRefdesc().getVerificationPropStr()) {
						BehaviourProperty prop = factory.createBehaviourProperty();
						prop.setName(plan.getPart().getName()+exprInd);
						prop.setExprText(exprStr);
						//find trigger port
						String triggerEvent = plan.getRefdesc().extractTriggerEvent(exprStr);
						String portName = plan.getRefdesc().extractPortName(triggerEvent, ".");
						System.out.println("find testport:"+portName);
						for(Component comp: newModel.getComponent()) {
							for(Port port: comp.getPort()) {
								
								if(port.getName().equals(portName)) {
									prop.setTestport(port);
									break;
								}
							}
						}
						//if(prop.getTestport()!=null) { // don't add property yet when the port is not found
							for(VerificationProperty eprop: newModel.getVerifyProperty()) {
								// remove the existing property
								if(eprop instanceof BehaviourProperty && ((BehaviourProperty)eprop).getExprText().equals(exprStr) ) {
									newModel.getVerifyProperty().remove(eprop);
									break;
								}
							}
							newModel.getVerifyProperty().add(prop);
						//}
						exprInd++;
					}
					
					

					//create interim model
					InterimModel interimModel = factory.createInterimModel();
					interimModel.setStep(i);
					interimModel.setDescription(plan.getPart().getName() +" - "+action.getName());
					interimModel.setDesignmodel(newModel);
					if(prevModel !=null)
						prevModel.setNextModel(interimModel);					
					evolutionModel.getInterimmodels().add(interimModel);
					prevModel = interimModel;
					
					
				}
			}
			
			//save evolution model to file
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("key", new XMIResourceFactoryImpl());
			ResourceSet resSet = new ResourceSetImpl();
	
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			String modelFilePath = srcModel.eResource().getURI().toPlatformString(true);
			String folderPath = workspace.getRoot()
					.getProject(modelFilePath.substring(0, modelFilePath.lastIndexOf("/") + 1)).getLocation().toString();
			Resource resource = resSet.createResource(URI.createFileURI(folderPath + "/" + fileName));
			System.out.println(resource.getURI().toFileString());
			System.out.println("writing model to " + resource.getURI().path());
			resource.getContents().add(evolutionModel);
			resource.save(Collections.EMPTY_MAP);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

	public static final ISchedulingRule mutex = new Mutex();


	private List<Plan> planDesignRefactoring(RefactorSet set) throws Exception {
		List<Plan> plans = new ArrayList<Plan>();
		DesignModel srcModel = set.getSource();
		for (RefactorPart part : set.getParts()) {
			System.out.println("*******************************************************");
			RefactorPDDLDescription refdesc = new RefactorPDDLDescription(srcModel, part);
			refdesc.generate();
			System.out.println(refdesc.toString());
			
			
			// call the webservice for planning
			RefactorPlannerJob job = new RefactorPlannerJob("Planning to refactoring "+part.getName(), refdesc.toString());
			job.setRule(mutex);
			job.addJobChangeListener(new JobChangeAdapter() {

				@Override
				public void done(IJobChangeEvent event) {
					Plan plan = job.getRefactorPlan();
					plan.setPart(part);
					plan.setRefdesc(refdesc);
					plans.add(plan);
					System.out.println(job.getRefactorPlan().getStepCount()+":"+job.getRefactorPlan());
					System.out.println("##########"+refdesc.getVerificationPropStr().stream().map(Object::toString).collect(Collectors.joining(", ")));
					super.done(event);
				}
				
			});
			job.schedule();
		}
		boolean isAllJobFinished = false;
		while(!isAllJobFinished) {
			Thread.sleep(500);
			if(plans.size() == set.getParts().size())
				isAllJobFinished = true;
		}
		
		return plans;

	}
	


	
}

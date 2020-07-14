package nz.auckland.arch.planner;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;

import nz.auckland.arch.BehaviourProperty;
import nz.auckland.arch.InterimModel;
import nz.auckland.arch.MigrationModel;
import nz.auckland.arch.VerificationProperty;
import nz.auckland.arch.viewpoint.utils.BehaviourPropVerifyJob;
import nz.auckland.arch.viewpoint.utils.Mutex;

public class EvolutionPathVerifier {

	private MigrationModel model;

	public EvolutionPathVerifier(MigrationModel model) {
		this.model = model;
	}

	private static final ISchedulingRule mutex = new Mutex();
	private boolean isFunctionalValid = true;
	private boolean isArchitecturalValid = true;

	public void start() {
		IEditingSession session = SessionUIManager.INSTANCE.getUISessions().iterator().next();
		TransactionalEditingDomain domain = null;
		domain = session.getSession().getTransactionalEditingDomain();

		RecordingCommand updateCommand = new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				for (InterimModel intModel : model.getInterimmodels()) {
					isArchitecturalValid = true;
					isFunctionalValid = true;
					intModel.setIsStable(true);
					for (VerificationProperty prop : intModel.getDesignmodel().getVerifyProperty()) {
						if (prop instanceof BehaviourProperty) {
							BehaviourProperty bevprop = (BehaviourProperty) prop;
							BehaviourPropVerifyJob job = new BehaviourPropVerifyJob(
									"Verifying "+intModel.getDesignmodel().getName()+":" + bevprop.getName(), bevprop);
							job.setRule(mutex);
							job.addJobChangeListener(new JobChangeAdapter() {
								@Override
								public void done(IJobChangeEvent event) {
									if (!bevprop.isValid()) {
										if (bevprop.getConnector() != null) {
											// this is architectural constraint
											isArchitecturalValid = false;
										} else {
											// this is functional constraint
											isFunctionalValid = false;
										}
										
										intModel.setIsStable(false);
									
									}
									

								}
							});

							job.schedule();

						}
					}
					
						
				} // end for interim model

			}  // end doExecute
		}; // end recording command
		
		domain.getCommandStack().execute(updateCommand);

	}

}

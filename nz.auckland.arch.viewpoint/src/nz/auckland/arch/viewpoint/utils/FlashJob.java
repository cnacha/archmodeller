package nz.auckland.arch.viewpoint.utils;


import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

public class FlashJob extends Job {
	
	TransactionalEditingDomain domain;
	private DRepresentationElement element;
	private Session session;
	private DRepresentation representation;
	private int borderSize;
	private int delay;
	private boolean openEditor = true;
	
	
	public FlashJob(String name,Session session, DRepresentation representation, TransactionalEditingDomain domain, DRepresentationElement element,int delay,int borderSize) {
		super(name);
		this.domain = domain;
		this.element = element;
		this.borderSize = borderSize;
		this.delay = delay;
		this.session = session;
		this.representation = representation;
	}
	


	public void setOpenEditor(boolean openEditor) {
		this.openEditor = openEditor;
	}



	@Override
	protected IStatus run(IProgressMonitor monitor) {
		if(openEditor)
			DialectUIManager.INSTANCE.openEditor(session, representation,	new NullProgressMonitor());
		
		
		RecordingCommand change1Command = new RecordingStyleCommand( domain, element,delay, borderSize);
		domain.getCommandStack().execute(change1Command);
		RecordingCommand change2Command = new RecordingStyleCommand( domain, element,delay, 1);
	    domain.getCommandStack().execute(change2Command);

		return Status.OK_STATUS;
	}

}

package nz.auckland.arch.viewpoint.utils;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.impl.DotImpl;
import org.eclipse.sirius.diagram.impl.FlatContainerStyleImpl;
import org.eclipse.sirius.diagram.impl.WorkspaceImageImpl;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

public class RecordingStyleCommand extends RecordingCommand {
	
	private DRepresentationElement element;
	private int borderSize;
	private int delay = 500;


	public RecordingStyleCommand(TransactionalEditingDomain domain,DRepresentationElement element,int delay, int borderSize) {
		
		super(domain);
		this.element = element;
		this.borderSize = borderSize;
		this.delay = delay;

	}

	@Override
	protected void doExecute() {
		
		System.out.println("updating element "+element.getSemanticElements().get(0).toString()+ " "+element.getStyle());
		
		if(element.getStyle() instanceof FlatContainerStyleImpl) {
			FlatContainerStyleImpl style = (FlatContainerStyleImpl)element.getStyle();
			style.setBorderSize(borderSize);
			
		} else if(element.getStyle() instanceof DotImpl) {
			DotImpl style = (DotImpl)element.getStyle();
			style.setBorderSize(borderSize);
			
		} else if(element.getStyle() instanceof WorkspaceImageImpl) {
			WorkspaceImageImpl style = (WorkspaceImageImpl) element.getStyle();
			if(borderSize == 1)
				style.setBorderSize(0);
			else
				style.setBorderSize(borderSize);
		}
		
		
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
    //    System.out.println("executetd complete");
	}

}

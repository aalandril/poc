package poc.swing.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import ui.swing.delegate.DelegateSimple;
import ui.swing.frame.MainFrame;

// Example of Command Pattern, encapsulating Save Company Action into its own class.
public class SaveCompanyAction extends AbstractAction {
	private static final long serialVersionUID = -4032505649458783407L;
	private DelegateSimple server;
	private MainFrame frame;
	
	public SaveCompanyAction(DelegateSimple server, MainFrame frame) {
		super("Save Company");
		this.server = server;
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

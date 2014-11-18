package ui.swing.command;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import ui.swing.delegate.Delegate;

public class WizardCommand extends AbstractAction {
	private static final long serialVersionUID = -2165889335157822079L;
	private JFrame parent; 
	private Delegate delegate;
	
	public WizardCommand(Delegate delegate, JFrame mediator) {
		this.delegate = delegate;
		this.parent = mediator;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String s = JOptionPane.showInputDialog(parent,"Enter Name:");
		Object[] roles = {"Manager", "Developer", "Tester"};
		String s2 = (String) JOptionPane.showInputDialog(parent,
				"Select Role:",
				"",
				JOptionPane.PLAIN_MESSAGE,
				null,
				roles,
				"");
		System.out.println(s + ":" + s2);
	}

}

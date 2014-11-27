package ui.swing.command;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import poc.Employee;
import poc.EmployeeType;
import poc.Gender;
import ui.swing.ComponentMediator;
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
		String name = JOptionPane.showInputDialog(parent,"Enter Name:");
		String gender = (String) JOptionPane.showInputDialog(parent,
				"Select Gender:",
				"",
				JOptionPane.PLAIN_MESSAGE,
				null,
				Gender.getValues(),
				"");

		String role = (String) JOptionPane.showInputDialog(parent,
				"Select Role:",
				"",
				JOptionPane.PLAIN_MESSAGE,
				null,
				EmployeeType.getValues(),
				"");
		Employee e = new Employee(EmployeeType.getEnum(role));
		e.setName(name);
		e.setGender(Gender.getEnum(gender));
		e.setAge(18);

		ComponentMediator.getInstance().setEmployee(e);
		ComponentMediator.getInstance().getStatsPanel().refresh();
	}

}

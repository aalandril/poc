package ui.swing.panel;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import ui.swing.ComponentMediator;

public class StatsPanel extends SidePanel {
	private static final long serialVersionUID = 6941027468994391292L;
	private static final String PANEL_NAME = "StatsPanel";
	
	JLabel employeeNameLabel;
	JLabel employeeAgeLabel;
	JLabel employeeRoleLabel;
	JLabel employeeGenderLabel;
	JLabel employeeName;
	JLabel employeeAge;
	JLabel employeeRole;
	JLabel employeeGender;

	public StatsPanel() {
		super(PANEL_NAME);
		ComponentMediator.getInstance().setStatsPanel(this);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		// Set the sub panel to 2 columns and as may rows as required
		JPanel panel = new JPanel(new GridLayout(0,2));
		employeeNameLabel = new JLabel("Employee Name: ");
		employeeName = new JLabel("");
		employeeGenderLabel = new JLabel("Employee Gender: ");
		employeeGender = new JLabel("");
		employeeAgeLabel = new JLabel("Employee Age: ");
		employeeAge = new JLabel("");
		employeeRoleLabel = new JLabel("Employee Role: ");
		employeeRole = new JLabel("");
		
		
		panel.add(employeeNameLabel);
		panel.add(employeeName);
		panel.add(employeeGenderLabel);
		panel.add(employeeGender);
		panel.add(employeeAgeLabel);
		panel.add(employeeAge);
		panel.add(employeeRoleLabel);
		panel.add(employeeRole);
		
		this.add(panel);
	}
	

	public void refresh() {
		employeeName.setText(ComponentMediator.getInstance().getEmployee().getName());
		employeeGender.setText(ComponentMediator.getInstance().getEmployee().getGender().getValue());
		employeeAge.setText(Integer.toString(ComponentMediator.getInstance().getEmployee().getAge()));
		employeeRole.setText(ComponentMediator.getInstance().getEmployee().getType().getValue());
	}
}

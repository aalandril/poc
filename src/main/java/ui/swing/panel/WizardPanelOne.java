package ui.swing.panel;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class WizardPanelOne extends WizardPanel {
	private static final long serialVersionUID = 475474991843594447L;
	private static final String PANEL_NAME = "WizardPanelOne";
	
	public WizardPanelOne() {
		super(PANEL_NAME);
		
		// Probably not necessary to add this to the Mediator?
		// ComponentMediator.getInstance().setSkillsPanel(this);
		
		JLabel companyNameLabel = new JLabel("Company Name:");
		JTextField companyNameField = new JTextField(20);
		JButton saveButton = new JButton("Save");
		//saveButton.addActionListener(this);
		
		this.setLayout(new BorderLayout());

		this.add(companyNameLabel);
		this.add(companyNameField);
		//this.add(saveButton);
		
		companyNameField.setText("test");
	}
}

package ui.swing.frame.company;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import poc.Company;
import poc.DBManager;
import poc.DBManagerImpl;
import poc.swing.action.CompanyActions;
import ui.swing.delegate.DelegateSimple;

public class CompanyNew extends JInternalFrame implements ActionListener {
	private static final long serialVersionUID = 7025954823760323351L;
	static final int xOffset = 30, yOffset = 30;
	CompanyActions actions;
	JTextField companyNameField;
	
	public CompanyNew() {
		super("Document #CompanyNew",
				true, //resizable
				true, //closable
				true, //maximizable
				true); //iconifiable
		
		actions = new CompanyActions();
		
		// Create the GUI and put it in the window
		
		// The set the window size or call pack
		//setSize(300,300);
		
		// Set the window's location
		setLocation(xOffset, yOffset);
		
		JPanel panel = new JPanel();
		JLabel companyNameLabel = new JLabel("Company Name:");
		companyNameField = new JTextField(20);
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(this);
		
		this.setLayout(new BorderLayout());

		panel.add(companyNameLabel);
		panel.add(companyNameField);
		panel.add(saveButton);

		this.add(panel);
		this.setVisible(true);
		this.setSize(200,200);

	}
	
	public void actionPerformed(ActionEvent e) { 
		if ("Save".equals(e.getActionCommand())) { 
			Company company = new Company();
			company.setName(companyNameField.getText());
			DelegateSimple.getInstance().insertRecord(company, Company.class);
		} else {
			// Else
		}
	}
}

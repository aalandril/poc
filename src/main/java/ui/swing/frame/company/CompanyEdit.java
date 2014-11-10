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
import ui.swing.delegate.DelegateSimple;

public class CompanyEdit extends JInternalFrame implements ActionListener {
	private static final long serialVersionUID = 7025954823760323351L;
	static final int xOffset = 200, yOffset = 40;
	JTextField companyNameField;
	
	public CompanyEdit(String companyName) {
		super("Document #CompanyEdit",
				true, //resizable
				true, //closable
				true, //maximizable
				true); //iconifiable
		
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
		
		companyNameField.setText(companyName);

		this.add(panel);
		this.setVisible(true);
		this.setSize(300,400);
		this.moveToFront();
	}
	
	public void actionPerformed(ActionEvent e) { 
		if ("Save".equals(e.getActionCommand())) { 
			System.out.println("Save:" + companyNameField.getText());
			Company company = new Company();
			company.setName(companyNameField.getText());
			DelegateSimple.getInstance().insertRecord(company, Company.class);
		} else {
			System.out.println("Else");
		}
	}
}

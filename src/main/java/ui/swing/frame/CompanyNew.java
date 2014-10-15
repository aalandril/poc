package ui.swing.frame;

import java.awt.BorderLayout;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CompanyNew extends JInternalFrame {
	private static final long serialVersionUID = 7025954823760323351L;
	static final int xOffset = 30, yOffset = 30;
	
	public CompanyNew() {
		super("Document #CompanyNew",
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
		JTextField companyName = new JTextField(20);
		
		this.setLayout(new BorderLayout());

		panel.add(companyNameLabel);
		panel.add(companyName);

		this.add(panel);
		this.setVisible(true);
		this.setSize(200,200);

	}
}

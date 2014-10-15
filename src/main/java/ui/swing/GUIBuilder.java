package ui.swing;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

import ui.swing.frame.CompanyList;
import ui.swing.frame.CompanyNew;

public class GUIBuilder {
	/**
	 * Create the GUI and show it. For thread safety, this method
	 * should be invoked from the event-dispatching thread
	 */
	public static void buildFrame() {
		// Make sure we have nice window decorations
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		// Create and set up the window.
		ParentFrame frame = new ParentFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Display the window
		frame.setVisible(true);
	}
	
	public static JInternalFrame buildCompanyListFrame() {
		CompanyList frame = new CompanyList();
		frame.setVisible(true);
		try {
			frame.setSelected(true);
		} catch (java.beans.PropertyVetoException e) {
			
		}
		return frame;
	}
	
	public static JInternalFrame buildCompanyNewFrame() {
		CompanyNew frame = new CompanyNew();
		frame.setVisible(true);
		try {
			frame.setSelected(true);
		} catch (java.beans.PropertyVetoException e) {
			
		}
		return frame;
	}
}

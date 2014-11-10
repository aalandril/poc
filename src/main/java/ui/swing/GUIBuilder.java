package ui.swing;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

import ui.swing.frame.company.CompanyEdit;
import ui.swing.frame.company.CompanyList;
import ui.swing.frame.company.CompanyNew;

public class GUIBuilder {
	/**
	 * Create the GUI and show it. For thread safety, this method
	 * should be invoked from the event-dispatching thread
	 */
	public static void buildFrame() {
		// Make sure we have nice window decorations
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		// Create and set up the window.
		//ParentFrame frame = new ParentFrame();
		Mediator frame = new Mediator();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Display the window
		frame.setVisible(true);
	}
	
	public static JInternalFrame buildCompanyListFrame(JDesktopPane desktop) {
		CompanyList frame = new CompanyList(desktop);
		frame.setVisible(true);
		try {
			frame.setSelected(true);
		} catch (java.beans.PropertyVetoException e) {
			
		}
		desktop.add(frame);
		return frame;
	}
	
	public static JInternalFrame buildCompanyNewFrame(JDesktopPane desktop) {
		CompanyNew frame = new CompanyNew();
		frame.setVisible(true);
		try {
			frame.setSelected(true);
		} catch (java.beans.PropertyVetoException e) {
			
		}
		desktop.add(frame);
		return frame;
	}
	
	public static JInternalFrame buildCompanyEditFrame(JDesktopPane desktop, String companyName) {
		CompanyEdit frame = new CompanyEdit(companyName);
		frame.setVisible(true);
		try {
			frame.setSelected(true);
		} catch (java.beans.PropertyVetoException e) {
			
		}
		desktop.add(frame);
		return frame;
	}
}

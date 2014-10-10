package ui.swing;

import javax.swing.JFrame;

import poc.swing.InternalFrameDemo;

public class GUIBuilder {
	/**
	 * Create the GUI and show it. For thread safety, this method
	 * should be invoked from the event-dispatching thread
	 */
	public static void build() {
		// Make sure we have nice window decorations
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		// Create and set up the window.
		InternalFrameDemo frame = new InternalFrameDemo();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Display the window
		frame.setVisible(true);
	}
}

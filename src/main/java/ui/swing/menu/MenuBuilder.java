package ui.swing.menu;

import java.awt.event.ActionListener;

import javax.swing.JMenuBar;

public class MenuBuilder {
	public static JMenuBar build(ActionListener actionListener) {
		JMenuBar menuBar = new JMenuBar();
		
		// Set up the lone menu
		menuBar.add(DocumentMenu.build(actionListener));
		
		return menuBar;
	}
}

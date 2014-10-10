package ui.swing.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuBuilder {
	public static JMenuBar build(ActionListener actionListener) {
		JMenuBar menuBar = new JMenuBar();
		
		// Set up the lone menu
		JMenu menu = new JMenu("Document");
		menu.setMnemonic(KeyEvent.VK_D);
		menuBar.add(menu);
		
		// Set up the first menu item
		JMenuItem menuItem = new JMenuItem("New");
		menuItem.setMnemonic(KeyEvent.VK_N);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.ALT_MASK));
		menuItem.setActionCommand("new");
		menuItem.addActionListener(actionListener);
		menu.add(menuItem);
		
		// Set up the second menu item
		menuItem = new JMenuItem("Quit");
		menuItem.setMnemonic(KeyEvent.VK_Q);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.ALT_MASK));
		menuItem.setActionCommand("quit");
		menuItem.addActionListener(actionListener);
		menu.add(menuItem);
		
		return menuBar;
	}
}

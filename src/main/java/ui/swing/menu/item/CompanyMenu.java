package ui.swing.menu.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import ui.swing.menu.IMenuItem;
import ui.swing.menu.annotations.MenuItem;

@MenuItem(topLevel = true)
public class CompanyMenu implements IMenuItem {

	@Override
	public JMenu build(ActionListener actionListener) {
		// Set up the lone menu
		JMenu menu = new JMenu("Company");
		menu.setMnemonic(KeyEvent.VK_C);
				
		// Set up the first menu item
		
		JMenuItem menuItem = new JMenuItem("New");
		menuItem.setMnemonic(KeyEvent.VK_N);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.ALT_MASK));
		menuItem.setActionCommand("new");
		menuItem.addActionListener(actionListener);
		menu.add(menuItem);
		
		menuItem = new JMenuItem("List");
		menuItem.setMnemonic(KeyEvent.VK_L);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.ALT_MASK));
		menuItem.setActionCommand("list");
		menuItem.addActionListener(actionListener);
		menu.add(menuItem);
		
				
		return menu;
	}

}

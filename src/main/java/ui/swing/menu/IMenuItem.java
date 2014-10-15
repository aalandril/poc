package ui.swing.menu;

import java.awt.event.ActionListener;

import javax.swing.JMenu;

public interface IMenuItem {
	public JMenu build(ActionListener actionListener);
}

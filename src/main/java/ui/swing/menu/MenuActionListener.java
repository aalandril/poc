package ui.swing.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;

import ui.swing.GUIBuilder;

public class MenuActionListener implements ActionListener {
	JDesktopPane desktop = null;
	public MenuActionListener(JDesktopPane desktop) {
		super();
		this.desktop = desktop;
	}
	
	// React to menu selections
	public void actionPerformed(ActionEvent e) {
		if ("new".equals(e.getActionCommand())) {
			desktop.add(GUIBuilder.buildCompanyNewFrame());
		} else if ("list".equals(e.getActionCommand())) {
			desktop.add(GUIBuilder.buildCompanyListFrame());
		} else {
			quitAction();
		}
	}
	
	private void quitAction() {
		System.exit(0);
	}
}

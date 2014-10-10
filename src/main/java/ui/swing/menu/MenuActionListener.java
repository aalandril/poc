package ui.swing.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuActionListener implements ActionListener {
	// React to menu selections
	public void actionPerformed(ActionEvent e) {
		if ("new".equals(e.getActionCommand())) {
			//createFrame();
		} else {
			//quit();
		}
	}
}

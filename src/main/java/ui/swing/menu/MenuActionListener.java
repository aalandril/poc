package ui.swing.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

import ui.swing.GUIBuilder;
import ui.swing.frame.inventory.InventoryFrame;

public class MenuActionListener implements ActionListener {
	JDesktopPane desktop = null;
	public MenuActionListener(JDesktopPane desktop) {
		super();
		this.desktop = desktop;
	}
	
	// React to menu selections
	public void actionPerformed(ActionEvent e) {
		if ("new".equals(e.getActionCommand())) {
			GUIBuilder.buildCompanyNewFrame(desktop);
		} else if ("list".equals(e.getActionCommand())) {
			GUIBuilder.buildCompanyListFrame(desktop);
			InventoryFrame frame = (InventoryFrame) getFrame("Inventory");
			frame.loadInventory();
		} else {
			quitAction();
		}
	}
	
	private void quitAction() {
		System.exit(0);
	}
	
	private JInternalFrame getFrame(String frameName) {
		JInternalFrame[] frames = desktop.getAllFrames();
		for (int i = 0; i < frames.length; i++) {
			JInternalFrame frame = frames[i];
			if (frame.getName() != null && frame.getName().equals(frameName)) {
				return frame;
			}
		}
		return null;
	}
}

package ui.swing.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

import ui.swing.ComponentMediator;
import ui.swing.GUIBuilder;
import ui.swing.frame.inventory.InventoryFrame;
import ui.swing.frame.wizard.WizardPageOne;
import ui.swing.utils.Constants;

public class MenuActionListener implements ActionListener {
	public MenuActionListener(JDesktopPane desktop) {
		ComponentMediator.getInstance().setMenuActionListener(this);
	}
	
	private JDesktopPane getDesktop() {
		return ComponentMediator.getInstance().getMainDesktopPane();
	}
	
	// React to menu selections
	public void actionPerformed(ActionEvent e) {
		if ("new".equals(e.getActionCommand())) {
			//GUIBuilder.buildCompanyNewFrame(desktop);
			
			JInternalFrame center = new WizardPageOne();
			center.setName("Please enter details");
			center.setLocation(Constants.INNER_FRAME_WIDTH, 0);
			center.setVisible(true);
			center.moveToFront();
			getDesktop().add(center);
			
		} else if ("list".equals(e.getActionCommand())) {
			GUIBuilder.buildCompanyListFrame(getDesktop());
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
		JInternalFrame[] frames = getDesktop().getAllFrames();
		for (int i = 0; i < frames.length; i++) {
			JInternalFrame frame = frames[i];
			if (frame.getName() != null && frame.getName().equals(frameName)) {
				return frame;
			}
		}
		return null;
	}
}

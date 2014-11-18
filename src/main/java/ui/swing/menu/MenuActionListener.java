package ui.swing.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

import ui.swing.ComponentMediator;
import ui.swing.GUIBuilder;
import ui.swing.Mediator;
import ui.swing.command.WizardCommand;
import ui.swing.delegate.DelegateSimple;
import ui.swing.frame.inventory.InventoryFrame;

public class MenuActionListener implements ActionListener {
	private Mediator parent;
	DelegateSimple server;
	public MenuActionListener(JDesktopPane desktop) {
		ComponentMediator.getInstance().setMenuActionListener(this);
	}
	
	public MenuActionListener(JDesktopPane desktop, Mediator parent) {
		ComponentMediator.getInstance().setMenuActionListener(this);
		this.parent = parent;
	}
	
	public MenuActionListener(JDesktopPane desktop, Mediator parent, DelegateSimple server) {
		ComponentMediator.getInstance().setMenuActionListener(this);
		this.parent = parent;
		this.server = server;
	}
	
	private JDesktopPane getDesktop() {
		return ComponentMediator.getInstance().getMainDesktopPane();
	}
	
	// React to menu selections
	public void actionPerformed(ActionEvent e) {
		if ("new".equals(e.getActionCommand())) {
			// Call Command Pattern
			new WizardCommand(server, parent).actionPerformed(e);
			/*
			WizardPanelOne center = new WizardPanelOne();
			ComponentMediator.getInstance().getMainPanel().add(center);
			//this.parent.getMainPanel().add(center);
			ComponentMediator.getInstance().getMainPanel().repaint();
			ComponentMediator.getInstance().getMainPanel().revalidate();
			*/
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

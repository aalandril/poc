package ui.swing.panel;

import javax.swing.JPanel;

import ui.swing.ComponentMediator;

public class InventoryPanel extends JPanel {
	private static final long serialVersionUID = 6941027468994391292L;

	public InventoryPanel() {
		ComponentMediator.getInstance().setInventoryPanel(this);
	}
}

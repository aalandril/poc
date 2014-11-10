package ui.swing.panel;

import ui.swing.ComponentMediator;

public class InventoryPanel extends SidePanel {
	private static final long serialVersionUID = 6941027468994391292L;
	private static final String PANEL_NAME = "InventoryPanel";

	public InventoryPanel() {
		ComponentMediator.getInstance().setInventoryPanel(this);
		this.setName(PANEL_NAME);
	}
}

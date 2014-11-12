package ui.swing.panel;

import ui.swing.ComponentMediator;

public class InventoryPanel extends SidePanel {
	private static final long serialVersionUID = 6941027468994391292L;
	private static final String PANEL_NAME = "InventoryPanel";

	public InventoryPanel() {
		super(PANEL_NAME);
		ComponentMediator.getInstance().setInventoryPanel(this);
	}
}

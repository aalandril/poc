package ui.swing.panel;

import ui.swing.ComponentMediator;

public class LocationPanel extends SidePanel {
	private static final long serialVersionUID = -6564800267292185274L;
	private static final String PANEL_NAME = "InventoryPanel";
	public LocationPanel() {
		super(PANEL_NAME);
		ComponentMediator.getInstance().setLocationPanel(this);
	}
}

package ui.swing.panel;

import ui.swing.ComponentMediator;

public class StatsPanel extends SidePanel {
	private static final long serialVersionUID = 6941027468994391292L;
	private static final String PANEL_NAME = "StatsPanel";

	public StatsPanel() {
		super(PANEL_NAME);
		ComponentMediator.getInstance().setStatsPanel(this);
	}
}

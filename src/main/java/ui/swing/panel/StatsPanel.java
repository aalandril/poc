package ui.swing.panel;

import javax.swing.JPanel;

import ui.swing.ComponentMediator;

public class StatsPanel extends JPanel {
	private static final long serialVersionUID = 6941027468994391292L;

	public StatsPanel() {
		ComponentMediator.getInstance().setStatsPanel(this);
	}
}

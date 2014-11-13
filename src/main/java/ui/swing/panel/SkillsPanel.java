package ui.swing.panel;

import ui.swing.ComponentMediator;

public class SkillsPanel extends SidePanel {
	private static final long serialVersionUID = 2345871925744368938L;
	private static final String PANEL_NAME = "SkillsPanel";
	
	public SkillsPanel() {
		super(PANEL_NAME);
		ComponentMediator.getInstance().setSkillsPanel(this);
	}

}

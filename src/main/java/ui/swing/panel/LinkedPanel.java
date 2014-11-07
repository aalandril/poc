package ui.swing.panel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class LinkedPanel extends JPanel {
	private final JFrame parent;
	public LinkedPanel(JFrame parent) {
		this.parent = parent;
	}
	
}

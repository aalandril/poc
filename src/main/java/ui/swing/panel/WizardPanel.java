package ui.swing.panel;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import ui.swing.utils.Constants;

@SuppressWarnings("serial")
public abstract class WizardPanel extends JPanel {
	public WizardPanel(String panelName) {
		this.setName(panelName);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize(screenSize.width - (Constants.INNER_FRAME_WIDTH * 2), screenSize.height);
		this.setVisible(true);
		this.setBorder(new BevelBorder(0));
		//this.setBackground(Color.GRAY);
	}
}

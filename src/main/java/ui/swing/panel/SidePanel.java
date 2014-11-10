package ui.swing.panel;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import ui.swing.utils.Constants;
import ui.swing.utils.UIUtils;

@SuppressWarnings("serial")
public abstract class SidePanel extends JPanel {
	public SidePanel() {
		this.setSize(Constants.INNER_FRAME_WIDTH, UIUtils.getHalfHeight());
		this.setVisible(true);
		this.setBorder(new BevelBorder(0));
	}
}

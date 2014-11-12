package ui.swing.panel;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import ui.swing.utils.Constants;
import ui.swing.utils.UIUtils;

public class SidePanel extends JPanel {
	private static final long serialVersionUID = 2648903708556179705L;

	public SidePanel(String panelName) {
		this.setName(panelName);
		this.setSize(Constants.INNER_FRAME_WIDTH, UIUtils.getHalfHeight());
		this.setVisible(true);
		this.setBorder(new BevelBorder(0));
	}
}

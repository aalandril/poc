package ui.swing.frame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JInternalFrame;

import ui.swing.utils.Constants;

public class MainFrame extends JInternalFrame {
	private static final long serialVersionUID = 4727164429179917708L;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public MainFrame() {
		super();
		int centerFrameWidth = screenSize.width - (Constants.INNER_FRAME_WIDTH * 2);
		int centerFrameHeight = screenSize.height;
		setSize(centerFrameWidth, centerFrameHeight);
	}
}

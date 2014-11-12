package ui.swing.utils;

import java.awt.Dimension;
import java.awt.Toolkit;

public class UIUtils {
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	public static int getHalfHeight() {
		return screenSize.height / 2;
	}
	
	public static int getRightPaneStart() {
		return screenSize.width - Constants.INNER_FRAME_WIDTH;
	}
}

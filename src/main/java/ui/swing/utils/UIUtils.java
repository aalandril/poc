package ui.swing.utils;

import java.awt.Dimension;
import java.awt.Toolkit;

public class UIUtils {
	public static int getHalfHeight() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		return screenSize.height / 2;
	}
}

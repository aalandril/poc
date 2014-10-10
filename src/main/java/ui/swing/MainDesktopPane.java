package ui.swing;

import javax.swing.JDesktopPane;

public class MainDesktopPane extends JDesktopPane {
	private static final long serialVersionUID = -2264315382170034681L;

	public MainDesktopPane() {
		super();
		
		// Make dragging a little faster but perhaps uglier
		this.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
	}
}

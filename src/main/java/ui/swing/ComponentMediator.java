package ui.swing;

import ui.swing.menu.MenuActionListener;
import ui.swing.panel.InventoryPanel;

public class ComponentMediator {
	private static ComponentMediator instance = new ComponentMediator();
	
	public static ComponentMediator getInstance() {
		return instance;
	}
	
	private MenuActionListener menuActionListener;
	private ParentFrame parentFrame;
	private MainDesktopPane mainDesktopPane;
	private InventoryPanel inventoryPanel;

	public MenuActionListener getMenuActionListener() {
		return menuActionListener;
	}

	public void setMenuActionListener(MenuActionListener menuActionListener) {
		this.menuActionListener = menuActionListener;
	}

	public ParentFrame getParentFrame() {
		return parentFrame;
	}

	public void setParentFrame(ParentFrame parentFrame) {
		this.parentFrame = parentFrame;
	}

	public InventoryPanel getInventoryPanel() {
		return inventoryPanel;
	}

	public void setInventoryPanel(InventoryPanel inventoryPanel) {
		this.inventoryPanel = inventoryPanel;
	}

	public MainDesktopPane getMainDesktopPane() {
		return mainDesktopPane;
	}

	public void setMainDesktopPane(MainDesktopPane mainDesktopPane) {
		this.mainDesktopPane = mainDesktopPane;
	}
	
	
	
}

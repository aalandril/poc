package ui.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.border.BevelBorder;

import ui.swing.menu.MenuActionListener;
import ui.swing.menu.MenuBuilder;
import ui.swing.panel.InventoryPanel;
import ui.swing.utils.Constants;


// Using the Mediator Pattern
public class Mediator extends JFrame {
	private static final long serialVersionUID = -7179379880575472504L;
	MainDesktopPane desktop = new MainDesktopPane();
	MenuActionListener actionListener = new MenuActionListener(desktop);
	private InventoryPanel inventoryPanel;
	public Mediator() {
		super();
		// Set up the GUI
		inventoryPanel = new InventoryPanel();
		inventoryPanel.setName("inventoryPanel");
		//bottomRight.setBackground(Color.BLACK);
		inventoryPanel.setBounds(0, 0, Constants.INNER_FRAME_WIDTH, 400);
		inventoryPanel.setVisible(true);
		inventoryPanel.setBorder(new BevelBorder(0));
		//desktop.add(topLeft);
		
		desktop.add(inventoryPanel);
		this.setVisible(true);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds(0, 0, screenSize.width, screenSize.height);
		setContentPane(desktop);
		
		setJMenuBar(MenuBuilder.build(actionListener));
	}
	
	public InventoryPanel getInventoryPanel() {
		return inventoryPanel;
	}
}

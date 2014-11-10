package ui.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import ui.swing.menu.MenuActionListener;
import ui.swing.menu.MenuBuilder;
import ui.swing.panel.InventoryPanel;
import ui.swing.panel.StatsPanel;
import ui.swing.utils.Constants;


// Using the Mediator Pattern
public class Mediator extends JFrame {
	private static final long serialVersionUID = -7179379880575472504L;
	MainDesktopPane desktop = new MainDesktopPane();
	MenuActionListener actionListener = new MenuActionListener(desktop);
	private InventoryPanel inventoryPanel;
	private StatsPanel statsPanel;
	public Mediator() {
		super();
		// Set up the GUI
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int halfHeight = screenSize.height / 2;
		
		JPanel topLeftPanel = new JPanel();
		topLeftPanel.setName("topLeftPanel");
		topLeftPanel.setVisible(true);
		topLeftPanel.setBorder(new BevelBorder(0));
		topLeftPanel.setBounds(0, 0, Constants.INNER_FRAME_WIDTH, halfHeight);
		topLeftPanel.setLayout(new BorderLayout());
		
		// Initially put the InventoryPanel into the top left panel
		topLeftPanel.add(new InventoryPanel());
		desktop.add(topLeftPanel);
		
		statsPanel = new StatsPanel();
		statsPanel.setName("inventoryPanel");
		statsPanel.setBounds(0, halfHeight, Constants.INNER_FRAME_WIDTH, halfHeight);
		statsPanel.setVisible(true);
		statsPanel.setBorder(new BevelBorder(0));
		desktop.add(statsPanel);
		
		
		this.setVisible(true);
		this.setBounds(0, 0, screenSize.width, screenSize.height);
		setContentPane(desktop);
		
		setJMenuBar(MenuBuilder.build(actionListener));
	}
	
	public InventoryPanel getInventoryPanel() {
		return inventoryPanel;
	}
}

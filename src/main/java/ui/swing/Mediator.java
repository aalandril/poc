package ui.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import ui.swing.delegate.DelegateSimple;
import ui.swing.menu.MenuActionListener;
import ui.swing.menu.MenuBuilder;
import ui.swing.panel.InventoryPanel;
import ui.swing.panel.LocationPanel;
import ui.swing.panel.SidePanel;
import ui.swing.panel.SkillsPanel;
import ui.swing.panel.StatsPanel;
import ui.swing.utils.Constants;
import ui.swing.utils.PropertyUtils;
import ui.swing.utils.UIUtils;


// Using the Mediator Pattern
public class Mediator extends JFrame {
	private static final long serialVersionUID = -7179379880575472504L;
	MainDesktopPane desktop = new MainDesktopPane();
	MenuActionListener actionListener;
	private InventoryPanel inventoryPanel;
	private StatsPanel statsPanel;
	private SkillsPanel skillsPanel;
	private LocationPanel locationPanel;
	private DelegateSimple server;
	private JPanel mainPanel;
	public Mediator() {
		super();
		server = DelegateSimple.getInstance();
		actionListener = new MenuActionListener(desktop, this, server);
		// Set up the GUI
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Properties props = PropertyUtils.loadProperties();
		// Create the container panel structure
		JPanel topLeftPanel = new SidePanel("topLeftPanel");
		topLeftPanel.setLocation(Integer.parseInt(props.getProperty("topLeft.xPos")), Integer.parseInt(props.getProperty("topLeft.yPos")));
		topLeftPanel.setLayout(new BorderLayout());	
		desktop.add(topLeftPanel);
		
		JPanel bottomLeftPanel = new SidePanel("bottomLeftPanel");
		bottomLeftPanel.setLocation(0, UIUtils.getHalfHeight());
		bottomLeftPanel.setLayout(new BorderLayout());
		desktop.add(bottomLeftPanel);
		
		JPanel topRightPanel = new SidePanel("topRightPanel");
		topRightPanel.setLocation(UIUtils.getRightPaneStart(), 0);
		topRightPanel.setLayout(new BorderLayout());	
		desktop.add(topRightPanel);
		
		JPanel bottomRightPanel = new SidePanel("bottomRightPanel");
		bottomRightPanel.setLocation(UIUtils.getRightPaneStart(), UIUtils.getHalfHeight());
		bottomRightPanel.setLayout(new BorderLayout());
		desktop.add(bottomRightPanel);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLocation(Constants.INNER_FRAME_WIDTH, 0);
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setName("mainPanel");
		mainPanel.setSize(screenSize.width - (Constants.INNER_FRAME_WIDTH * 2), screenSize.height);
		mainPanel.setVisible(true);
		mainPanel.setBorder(new BevelBorder(0));
		ComponentMediator.getInstance().setMainPanel(mainPanel);
		this.mainPanel = mainPanel;
		desktop.add(mainPanel);
		
		// Set the panels into their initial locations
		inventoryPanel = new InventoryPanel();
		topLeftPanel.add(inventoryPanel);
				
		statsPanel = new StatsPanel();
		bottomLeftPanel.add(statsPanel);
		
		skillsPanel = new SkillsPanel();
		topRightPanel.add(skillsPanel);
		
		locationPanel = new LocationPanel();
		bottomRightPanel.add(locationPanel);
		
		// Show the main window
		this.setVisible(true);
		this.setBounds(0, 0, screenSize.width, screenSize.height);
		setContentPane(desktop);
		
		setJMenuBar(MenuBuilder.build(actionListener));
	}
	
	public InventoryPanel getInventoryPanel() {
		return inventoryPanel;
	}

	public MainDesktopPane getDesktop() {
		return desktop;
	}

	public MenuActionListener getActionListener() {
		return actionListener;
	}

	public StatsPanel getStatsPanel() {
		return statsPanel;
	}

	public SkillsPanel getSkillsPanel() {
		return skillsPanel;
	}

	public LocationPanel getLocationPanel() {
		return locationPanel;
	}
	
	public JPanel getMainPanel() {
		return mainPanel;
	}

	public void launchWizard() {
		
	}
}

package ui.swing.frame.inventory;

import java.awt.BorderLayout;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InventoryFrame extends JInternalFrame {
	private static final long serialVersionUID = -162201182951810131L;
	
	public InventoryFrame(JDesktopPane desktop, 
			int frameWidth,   int frameHeight, 
			int leftPosition, int topPosition) {
		super("Document #Inventory",
				false, //resizable
				false, //closable
				false, //maximizable
				false); //iconifiable
		
		// Create the GUI and put it in the window
		final JDesktopPane localDesktop = desktop;
		
		this.setLayout(new BorderLayout());
		
		this.setName("Inventory");
		this.setSize(frameWidth, frameHeight);
		this.setLocation(leftPosition, topPosition);
		this.setVisible(true);
	}
	
	public void loadInventory() {
		JPanel panel = new JPanel();
		JLabel companyNameLabel = new JLabel("Inventory:");
		panel.add(companyNameLabel);
		this.add(panel);
	}
}

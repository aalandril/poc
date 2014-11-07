package ui.swing;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

import ui.swing.frame.inventory.InventoryFrame;
import ui.swing.menu.MenuActionListener;
import ui.swing.menu.MenuBuilder;

public class ParentFrame extends JFrame {
	private static final long serialVersionUID = -2911317340055080184L;
	MainDesktopPane desktop = new MainDesktopPane();
	MenuActionListener actionListener = new MenuActionListener(desktop);
	public ParentFrame() {
		super("ParentFrame");
		ComponentMediator.getInstance().setParentFrame(this);
		// Make the big window indented by 50 pixels from each edge
		int inset = 50;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(inset, inset, screenSize.width - inset*2, screenSize.height - inset*2);
		int innerFrameWidth = 400;
		int halfHeight = screenSize.height / 2;
		int rightPaneStart = screenSize.width - innerFrameWidth;
		
		int centerFrameWidth = screenSize.width - (innerFrameWidth * 2);
		int centerFrameHeight = screenSize.height;
		System.out.println(centerFrameWidth + "," + centerFrameHeight );
		
		// Set up the GUI
		JInternalFrame topLeft = new JInternalFrame("1");
		topLeft.setName("1");
		topLeft.setSize(innerFrameWidth, halfHeight);
		topLeft.setLocation(0, 0);
		topLeft.setVisible(true);
		desktop.add(topLeft);
		
		JInternalFrame bottomLeft = new JInternalFrame("2");
		bottomLeft.setName("2");
		bottomLeft.setSize(innerFrameWidth, halfHeight);
		bottomLeft.setLocation(0, halfHeight);
		bottomLeft.setVisible(true);
		desktop.add(bottomLeft);
		
		JInternalFrame topRight = new JInternalFrame("3");
		topRight.setName("3");
		topRight.setSize(innerFrameWidth, halfHeight);
		topRight.setLocation(rightPaneStart, 0);
		topRight.setVisible(true);
		desktop.add(topRight);
		
		desktop.add(new InventoryFrame(desktop, innerFrameWidth, halfHeight, rightPaneStart, halfHeight));
		/*
		JInternalFrame center = new JInternalFrame("5");
		center.setName("5");
		center.setSize(centerFrameWidth, centerFrameHeight);
		center.setLocation(innerFrameWidth, 0);
		center.setVisible(true);
		desktop.add(center);
		*/
		//createFrame(); // create first 'window'
		setContentPane(desktop);
		setJMenuBar(MenuBuilder.build(actionListener));
	}
}

package ui.swing;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import ui.swing.menu.MenuActionListener;
import ui.swing.menu.MenuBuilder;

public class ParentFrame extends JFrame {
	private static final long serialVersionUID = -2911317340055080184L;
	MainDesktopPane desktop = new MainDesktopPane();
	MenuActionListener actionListener = new MenuActionListener(desktop);
	public ParentFrame() {
		super("ParentFrame");
		
		// Make the big window indented by 50 pixels from each edge
		int inset = 50;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(inset, inset, screenSize.width - inset*2, screenSize.height - inset*2);
		
		// Set up the GUI
		//createFrame(); // create first 'window'
		setContentPane(desktop);
		setJMenuBar(MenuBuilder.build(actionListener));
	}
}

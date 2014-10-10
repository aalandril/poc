package poc.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SimpleMenuExample extends JFrame {
	public SimpleMenuExample() {
		initUI();
	}
	
	private void initUI() {
		JMenuBar menubar = new JMenuBar();
		ImageIcon icon = new ImageIcon("/exit.png");
		
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		
		JMenuItem eMenuItem = new JMenuItem("Exit", icon);
		eMenuItem.setMnemonic(KeyEvent.VK_E);
		eMenuItem.setToolTipText("Exit Application");
		eMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		
		file.add(eMenuItem);
		
		JMenu view = new JMenu("View");
		file.setMnemonic(KeyEvent.VK_V);
		
		JMenuItem companyMenuItem = new JMenuItem("Company");
		companyMenuItem.setMnemonic(KeyEvent.VK_C);
		companyMenuItem.setToolTipText("Company Details");
		companyMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		
		view.add(companyMenuItem);
		
		menubar.add(file);
		menubar.add(view);
		
		setJMenuBar(menubar);
		
		setTitle("Simple menu");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				SimpleMenuExample ex = new SimpleMenuExample();
				ex.setVisible(true);
			}
		});
	}
}

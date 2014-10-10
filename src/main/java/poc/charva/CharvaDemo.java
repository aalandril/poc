package poc.charva;

import charva.awt.Container;
import charva.awt.event.ActionEvent;
import charva.awt.event.ActionListener;
import charva.awt.event.WindowAdapter;
import charva.awt.event.WindowEvent;
import charvax.swing.JFrame;
import charvax.swing.JMenu;
import charvax.swing.JMenuBar;

public class CharvaDemo extends JFrame implements ActionListener {

	public static void main(String[] args) {
		CharvaDemo demo = new CharvaDemo();
		demo.show();
	}
	
	CharvaDemo() {
		super("Charve Demo");
		
		// Use an anonymous inner class
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				terminate();
			}
		});
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		
		// ...
		
		menuBar.add(fileMenu);
		
		setJMenuBar(menuBar);
		
		Container contentPane = getContentPane();
		
		// ...
		
		pack();
	}
	
	private void terminate() {
		System.exit(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
	}

}

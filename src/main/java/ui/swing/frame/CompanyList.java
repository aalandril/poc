package ui.swing.frame;

import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class CompanyList extends JInternalFrame {
	private static final long serialVersionUID = 7025954823760323351L;
	static final int xOffset = 30, yOffset = 30;
	
	public CompanyList() {
		super("Document #CompanyList",
				true, //resizable
				true, //closable
				true, //maximizable
				true); //iconifiable
		
		// Create the GUI and put it in the window
		
		// The set the window size or call pack
		setSize(300,300);
		
		// Set the window's location
		setLocation(xOffset, yOffset);
		//TableModel m = new DefaultTableModel();
		final JTable table = new JTable();
	}
}

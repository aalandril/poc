package ui.swing.frame;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import poc.Company;
import poc.DBManagerImpl;

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
		
		DBManagerImpl dbManager = new DBManagerImpl();
		List<Company> names = dbManager.retrieveAllRecords(poc.Company.class);
		//ArrayList<String> names = new ArrayList<String>();
		//names.add("Test1");
		//names.add("Test2");
		
		
		Object[] columnNames = {"Company Name"};
		DefaultTableModel model = new DefaultTableModel(columnNames, 0);
		
		for (Company c : names) {
			Object[] o = new Object[1];
			o[0] = c.getName();
			model.addRow(o);
		}
		
		final JTable table = new JTable(model);
		
		this.setLayout(new BorderLayout());
		this.add(new JScrollPane(table), BorderLayout.CENTER);

		this.add(table.getTableHeader(), BorderLayout.NORTH);

		this.setVisible(true);
		this.setSize(200,200);

	}
}

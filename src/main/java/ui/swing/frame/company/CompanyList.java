package ui.swing.frame.company;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import poc.Company;
import poc.DBManagerImpl;
import ui.swing.GUIBuilder;

public class CompanyList extends JInternalFrame {
	private static final long serialVersionUID = 7025954823760323351L;
	static final int xOffset = 30, yOffset = 30;
	
	public CompanyList(JDesktopPane desktop) {
		super("Document #CompanyList",
				true, //resizable
				true, //closable
				true, //maximizable
				true); //iconifiable
		
		// Create the GUI and put it in the window
		final JDesktopPane localDesktop = desktop;
		
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
		
		table.setRowSelectionAllowed(true); //CellSelectionEnabled(true);
		ListSelectionModel cellSelectionModel = table.getSelectionModel();
		cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String selectedData = null;
				
				int[] selectedRow = table.getSelectedRows();
				int[] selectedColumn = table.getSelectedColumns();
				
				for (int i = 0; i < selectedRow.length; i++) {
					for (int j = 0; j < selectedColumn.length; j++) {
						selectedData = (String) table.getValueAt(selectedRow[i], selectedColumn[j]);
						GUIBuilder.buildCompanyEditFrame(localDesktop, selectedData);
					}
				}
				System.out.println("Selected:" + selectedData);
			}
		});

		this.setVisible(true);
		this.setSize(200,200);

	}
}

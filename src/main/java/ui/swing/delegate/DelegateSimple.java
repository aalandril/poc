package ui.swing.delegate;

import java.util.List;

import poc.Company;
import poc.DBManagerImpl;

// Implementation of the Delegate Pattern, delegating responsibility for calls
// to the server-side code to this singleton.
public class DelegateSimple {
	//RemoteInterface remoteInterface;
	
	private static final DelegateSimple INSTANCE = new DelegateSimple();
	
	private DelegateSimple() {
		//remoteInterface = new RemoteInterface();
	}
	
	public static DelegateSimple getInstance() {
		return INSTANCE;
	}
	
	public <T> List<T> retrieveAllRecords(Class<T> clasz) {
		DBManagerImpl dbManager = new DBManagerImpl();
		return dbManager.retrieveAllRecords(clasz);
	}
	
	public <T> void insertRecord(T record, Class<T> clasz) {
		DBManagerImpl dbManager = new DBManagerImpl();
		dbManager.insertRecord(record, clasz);
	}
}

package ui.swing.delegate;

import java.util.List;

public interface Delegate {
	<T> List<T> retrieveAllRecords(Class<T> clasz);
	
	<T> void insertRecord(T record, Class<T> clasz);
}

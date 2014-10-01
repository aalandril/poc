package poc;

import java.util.List;

public interface DBManager {
	<T> void createDatabase(List<Class> tables);
	<T> void insertRecord(T record, Class<T> clasz);
	<T> void updateRecord(T record, Class<T> clasz);
	<T> T retrieveRecord(String id, Class<T> clasz);
	<T> List<T> retrieveAllRecords(Class<T> clasz);
}

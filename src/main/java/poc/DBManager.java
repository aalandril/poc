package poc;

import java.util.List;

public interface DBManager {
	<T> void createDatabase(List<Class> tables);
	<T> void insertRecord(T record, Class<T> clasz);
}

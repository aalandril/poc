package poc;

import java.util.ArrayList;
import java.util.List;

public class DBLoader {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		DBManager manager = new DBManagerImpl();
		List<Class> tables = new ArrayList<Class>();
		tables.add(Company.class);
		manager.createDatabase(tables);
		Company company = new Company();
		manager.insertRecord(company, Company.class);
	}

}

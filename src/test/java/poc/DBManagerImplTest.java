package poc;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("rawtypes")
public class DBManagerImplTest {
	DBManager dbManager;
	
	@Before
	public void setUp() {
		dbManager = new DBManagerImpl();
	}
	
	@Test
	public void createDatabaseTest() {
		DBManagerImpl dbManager = new DBManagerImpl();
		List<Class> tables = new ArrayList<Class>();
		tables.add(Company.class);
		dbManager.createDatabase(tables);
	}
	
	@Test
	public void insertRecordTest() {
		Company company = new Company();
		company.setName("Test Ltd");
		dbManager.insertRecord(company, Company.class);
	}
}

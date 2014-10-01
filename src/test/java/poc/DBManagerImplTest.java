package poc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.framework.Assert;

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
	
	@Test
	public void updateRecordTest() {
		List<Company> results1 = dbManager.retrieveAllRecords(Company.class);
		Assert.assertTrue(results1.size()>0);
		Company c1 = results1.get(0);
		String originalName = c1.getName();
		c1.setName("newName");
		dbManager.updateRecord(c1, Company.class);
		
		List<Company> results2 = dbManager.retrieveAllRecords(Company.class);
		Assert.assertTrue(results2.size()>0);
		Company c2 = results2.get(0);
		String newName = c2.getName();
		Assert.assertNotSame(originalName, newName);
	}
	
	@Test
	public void retrieveRecordsTest() {
		List<Company> results = dbManager.retrieveAllRecords(Company.class);
		Assert.assertTrue(results.size()>0);
	}
}

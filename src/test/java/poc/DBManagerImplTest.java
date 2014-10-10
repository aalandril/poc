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
		tables.add(Developer.class);
		tables.add(Manager.class);
		tables.add(Tester.class);
		dbManager.createDatabase(tables);
	}
	
	@Test
	public void insertRecordTest() {
		Company company = new Company();
		company.setName("Test Ltd");
		dbManager.insertRecord(company, Company.class);
		
		Developer dev = new Developer();
		dev.setAge(18);
		dbManager.insertRecord(dev, Developer.class);
		
		Manager man = new Manager();
		man.setAge(18);
		dbManager.insertRecord(man, Manager.class);
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
		List<Company> companyResults = dbManager.retrieveAllRecords(Company.class);
		Assert.assertTrue(companyResults.size()>0);
		
		List<Employee> employeeResults = dbManager.retrieveAllRecords(Employee.class);
		Assert.assertTrue(employeeResults.size()>0);
	}
}

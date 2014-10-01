package poc;

import junit.framework.Assert;

import org.junit.Test;

public class EmployeeFactoryTest {
	@Test
	public void factoryTest() {
		EmployeeFactory factory = new EmployeeFactory();
		
		factory.registerEmployeeType(new Integer(1), Developer.class);
		factory.registerEmployeeType(new Integer(2), Tester.class);
		factory.registerEmployeeType(new Integer(3), Manager.class);
		
		Employee emp = factory.createEmployee(RandomNumberGenerator.roll(new RandomNumberConfigurer("1D3")));
		Assert.assertNotNull(emp);
		Assert.assertNotNull(emp.getType());
		int age = emp.getAge();
		Assert.assertTrue (age > 17);
		Assert.assertTrue (age < 43);
	}
}

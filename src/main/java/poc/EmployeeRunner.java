package poc;

public class EmployeeRunner {

	public static void main(String[] args) {
		EmployeeFactory factory = new EmployeeFactory();
		
		factory.registerEmployeeType(new Integer(1), Developer.class);
		factory.registerEmployeeType(new Integer(2), Tester.class);
		factory.registerEmployeeType(new Integer(3), Manager.class);
		
		Employee emp = factory.createEmployee(RandomNumberGenerator.roll(new RandomNumberConfigurer("1D3")));
		System.out.println(emp.getType());
	}

}

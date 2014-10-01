package poc;

public abstract class Employee {
	private EmployeeType type = null;
	private int age;
	
	public Employee(EmployeeType type) {
		this.type = type;
		initialiseEmployee();
	}
	
	private void initialiseEmployee() {
		setAge(18);
	}

	public EmployeeType getType() {
		return type;
	}

	public void setType(EmployeeType type) {
		this.type = type;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

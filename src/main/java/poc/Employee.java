package poc;

public abstract class Employee {
	private EmployeeType type = null;
	
	public Employee(EmployeeType type) {
		this.type = type;
		initialiseEmployee();
	}
	
	private void initialiseEmployee() {
		
	}

	public EmployeeType getType() {
		return type;
	}

	public void setType(EmployeeType type) {
		this.type = type;
	}

}

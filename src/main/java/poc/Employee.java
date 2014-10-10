package poc;

import com.j256.ormlite.field.DatabaseField;

public abstract class Employee {
	@DatabaseField(generatedId = true)
    private int id;
	@DatabaseField
	private EmployeeType type = null;
	@DatabaseField
	private int age;
	
	Employee() {
		
	}
	
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

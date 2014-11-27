package poc;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Employee {
	@DatabaseField(generatedId = true)
    private int id;
	@DatabaseField
	private String name;
	@DatabaseField
	private EmployeeType type = null;
	@DatabaseField
	private int age;
	@DatabaseField
	private Gender gender;
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}

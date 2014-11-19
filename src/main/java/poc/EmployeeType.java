package poc;

public enum EmployeeType {
	DEVELOPER("Developer"),
	TESTER("Tester"),
	MANAGER("Manager");
	
	private String value;
	
	EmployeeType(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public static EmployeeType getEnum(String value) {
		for (EmployeeType v : values())
			if (v.getValue().equalsIgnoreCase(value)) return v;	
		throw new IllegalArgumentException();
	}
	
	@Override
	public String toString() {
		return this.getValue();
	}

}

package poc;

public enum Gender {
	MALE("Male"),
	FEMALE("Female");
	
	private String value;
	
	Gender(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public static Gender getEnum(String value) {
		for (Gender v : values())
			if (v.getValue().equalsIgnoreCase(value)) return v;	
		throw new IllegalArgumentException();
	}
	
	public static String[] getValues() {
		String[] values = new String[values().length];
		int i = 0;
		for (Gender v : values()) {
			values[i] = v.getValue();
			i++;
		}
		return values;
	}
	
	@Override
	public String toString() {
		return this.getValue();
	}
}

package poc;

import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Manager extends Employee {
	Manager() {
		super(EmployeeType.MANAGER);
	}
}

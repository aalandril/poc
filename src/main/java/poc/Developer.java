package poc;

import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Developer extends Employee {
	Developer() {
		super(EmployeeType.DEVELOPER);
	}
}

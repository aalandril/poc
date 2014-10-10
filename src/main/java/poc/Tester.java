package poc;

import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Tester extends Employee {
	Tester() {
		super(EmployeeType.TESTER);
	}
}

package poc;

import java.lang.reflect.Constructor;
import java.util.HashMap;

public class EmployeeFactory {
	private HashMap<Integer, Class> m_RegisteredEmployeeTypes = new HashMap<Integer, Class>();
	
	public void registerEmployeeType (Integer typeId, Class typeClass) {
		m_RegisteredEmployeeTypes.put(typeId, typeClass);
	}
	
	public Employee createEmployee(int typeId) {
		try {
			Class typeClass = (Class) m_RegisteredEmployeeTypes.get(typeId);
			Constructor employeeConstructor = typeClass.getDeclaredConstructor(new Class[] { });
			return (Employee) employeeConstructor.newInstance(new Object[] {});
		} catch (Exception e) {
			return null;
		}
	}
}

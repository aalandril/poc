package ui.swing.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassUtils {
	public static Object getClassInstance(String className) throws ClassNotFoundException, 
			NoSuchMethodException, 
			InvocationTargetException, 
			IllegalAccessException, 
			InstantiationException {
		Class<?> clasz = Class.forName(className);
		Constructor<?> ctor = clasz.getConstructor();
		Object object = ctor.newInstance(new Object[] { });
		return object;
	}
}

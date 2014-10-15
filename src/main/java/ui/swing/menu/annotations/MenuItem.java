package ui.swing.menu.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MenuItem {
	public boolean topLevel() default true;
}

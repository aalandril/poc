package ui.swing.menu;

import java.awt.event.ActionListener;

import javax.swing.JMenuBar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import ui.swing.menu.annotations.MenuItem;
import ui.swing.utils.ClassUtils;

public class MenuBuilder {
	public static JMenuBar build(ActionListener actionListener) {
		JMenuBar menuBar = new JMenuBar();
		Logger logger = LoggerFactory.getLogger(MenuBuilder.class);
		// Create a scanner to look for matching classes
		ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(true);
		// Set a filter to search for only MenuItems
		scanner.addIncludeFilter(new AnnotationTypeFilter(MenuItem.class));
		// Loop through the matching classes in a particular package and process them
		for (BeanDefinition bd : scanner.findCandidateComponents("ui.swing.menu.item")) {
			String className = bd.getBeanClassName();
			logger.info("Menu Item Found: " + className);
			try {
				// Get a reference to the Class
				IMenuItem item = (IMenuItem) ClassUtils.getClassInstance(className);
				// Add the menu item to the menu bar
				menuBar.add(item.build(actionListener));
			} catch (Exception e) {
				// Any problems, log the message and ignore the menu item
				logger.error(e.getMessage());
			}
		}
		return menuBar;
	}
}

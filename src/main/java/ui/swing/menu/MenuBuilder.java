package ui.swing.menu;

import java.awt.event.ActionListener;

import javax.swing.JMenuBar;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import ui.swing.menu.annotations.MenuItem;

public class MenuBuilder {
	public static JMenuBar build(ActionListener actionListener) {
		JMenuBar menuBar = new JMenuBar();
		
		ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(true);
		scanner.addIncludeFilter(new AnnotationTypeFilter(MenuItem.class));
		for (BeanDefinition bd : scanner.findCandidateComponents("ui.swing.menu"))
			System.out.println("Menu Item Found: " + bd.getBeanClassName());
		
		// Set up the lone menu
		menuBar.add(DocumentMenu.build(actionListener));
		
		return menuBar;
	}
}

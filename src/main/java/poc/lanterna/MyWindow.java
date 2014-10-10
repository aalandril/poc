package poc.lanterna;

import com.googlecode.lanterna.gui.Action;
import com.googlecode.lanterna.gui.Border;
import com.googlecode.lanterna.gui.Window;
import com.googlecode.lanterna.gui.component.Button;
import com.googlecode.lanterna.gui.component.Label;
import com.googlecode.lanterna.gui.component.Panel;
import com.googlecode.lanterna.gui.dialog.ListSelectDialog;
import com.googlecode.lanterna.terminal.Terminal.Color;

public class MyWindow extends Window {

	public MyWindow() {
		super("My Window");
		
		Panel horizontalPanel = new Panel(new Border.Invisible(), Panel.Orientation.HORISONTAL);
		Panel leftPanel = new Panel(new Border.Bevel(true), Panel.Orientation.VERTICAL);
		Panel middlePanel = new Panel(new Border.Bevel(true), Panel.Orientation.VERTICAL);
		Panel rightPanel = new Panel(new Border.Bevel(true), Panel.Orientation.VERTICAL);
		
		horizontalPanel.addComponent(leftPanel);
		horizontalPanel.addComponent(middlePanel);
		horizontalPanel.addComponent(rightPanel);
		
		addComponent(horizontalPanel);
		
		addComponent(new Label("This is the first label"));         
		addComponent(new Label("This is the second label, red", Color.RED));         
		addComponent(new Label("This is the third label, fixed 50 columns", 50));         
		addComponent(new Label("This is the last label\nSpanning\nMultiple\nRows")); 
		
		
		
		addComponent(new Button("Close", new Action() {
			public void doAction() {
				// Close the windows
				System.exit(0);
			}
		}));
	}

}

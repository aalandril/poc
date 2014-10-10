package poc.lanterna;

import java.nio.charset.Charset;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.gui.GUIScreen;
import com.googlecode.lanterna.gui.dialog.ListSelectDialog;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.ScreenCharacterStyle;
import com.googlecode.lanterna.screen.ScreenWriter;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.Terminal.Color;

public class LanternaDemo {

	public static void main(String[] args) {
		Terminal terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
		terminal.applyBackgroundColor(Color.BLUE);
		GUIScreen gui = TerminalFacade.createGUIScreen();
		if (gui == null) {
			System.err.println("Couldn't allocate a terminal!"); 
			return;
		}
		//gui.getBackgroundRenderer().drawBackground(new TextGraphics());
		gui.getScreen().startScreen();
		
		/*
		Screen screen = new Screen(terminal);
		screen.startScreen();
		ScreenCharacterStyle styles = ScreenCharacterStyle.Blinking;
		screen.putString(10, 5, "Hello Lanterna!", Color.RED, Color.CYAN, styles);
		*/
		
		/*
		ScreenWriter writer = new ScreenWriter(screen);
		writer.setForegroundColor(Color.BLACK);
		writer.setBackgroundColor(Color.WHITE);
		writer.drawString(5, 3, "Hello Lanterna", ScreenCharacterStyle.Bold);
		writer.setForegroundColor(Color.DEFAULT);
		writer.setBackgroundColor(Color.DEFAULT);
		writer.drawString(5, 5, "Hello Lanterna");
		writer.drawString(5, 7, "Hello Lanterna");
		*/
		
		//screen.refresh();
		String selectedItem = ListSelectDialog.showDialog(gui, "MyDialog", "This is my dialog", "Item1", "Item2");
		System.out.println(selectedItem);
		gui.showWindow(new MyWindow(), GUIScreen.Position.CENTER);
		//screen.stopScreen();
	}

}

package poc.swing.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompanyActions implements ActionListener {
	public void actionPerformed(ActionEvent e) { 
		if ("Save".equals(e.getActionCommand())) { 
			//SaveCompanyAction a = new SaveCompanyAction();
			//a.actionPerformed(e);
		} else {
			System.out.println("Else");
		}
	}
}

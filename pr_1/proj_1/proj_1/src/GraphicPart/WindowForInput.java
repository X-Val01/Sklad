package GraphicPart;

import javax.swing.*;

public class WindowForInput {
	Controller controller = new Controller();
	String str = "";

	public String newStringInfo(String str1) {
		
		
		if (str1.equals("add")) {
			for (int j = 0; j < 6; j++) {
				new JOptionPane("tt");
				String result = JOptionPane.showInputDialog("<html><h2>" + "Input data in column №" + (j + 1));
				str += result + "\t\t";
			}
		}
		
		
		if (str1.equals("del")) {
			for (int j = 0; j < 1; j++) {
				new JOptionPane("tt");
				String result = JOptionPane.showInputDialog(
						"<html><h2>" + "Please input integer value from 1 to " + controller.getSizeList());
				str = result;
			}
		}
		return str;
	}
}

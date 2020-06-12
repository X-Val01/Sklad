package GraphicPart;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class WindowForInput {
	Controller controller = new Controller();
	String str = "";
	public String newStringInfo(String str1) {
		if( str1.equals("add")) {
		for (int j = 0; j < 6; j++) {
			JOptionPane pane = new JOptionPane("tt");
			String result = JOptionPane.showInputDialog(		               
                    "<html><h2>"+"Input data in column №"+(j+1));	
		str+=result+"\t\t";	
		}
		}
			if( str1.equals("del")) {
				for (int j = 0; j < 1; j++) {
					JOptionPane pane = new JOptionPane("tt");
					String result = JOptionPane.showInputDialog(		               
		                    "<html><h2>"+"Please input integer value from 1 to "+ controller.getSizeList());	
				str=result;
				}
			}
		
		
		return str;
	}
}


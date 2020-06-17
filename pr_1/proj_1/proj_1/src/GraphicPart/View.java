package GraphicPart;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class View {
	/**
	 * 
	 */

	private JButton buttonAdd;
	private JButton buttonChange;
	private JButton buttonDelete;
	public int lengthMas;
	private String strFromTwoWind;
	Object[] masWord;
	Object[] masColumnHead;
	Controller controller = new Controller();
	WindowForInput windowInput = new WindowForInput();
	

	private JTable table;

	public View() {
		JFrame frame = new JFrame("Table");
		strFromTwoWind = "";
		buttonAdd = new JButton("Add");
		buttonChange = new JButton("Change");
		buttonDelete = new JButton("Detele");

		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(450, 200));
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		table = new JTable(controller.buildNewTableModel());
		table.setRowHeight(25);
		table.setRowHeight(0, 20);
		table.setGridColor(Color.black);
		
		JScrollPane scrollPane = new JScrollPane(table);
		JPanel panel = new JPanel();

		frame.add(scrollPane, BorderLayout.SOUTH);
		panel.add(buttonAdd);
		panel.add(buttonChange);
		panel.add(buttonDelete);
		frame.add(panel, BorderLayout.NORTH);
		frame.getContentPane().add(scrollPane);

		buttonAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				strFromTwoWind = windowInput.newStringInfo("add");
				controller.saveStringInList(strFromTwoWind);
				controller.buildNewTableModel();
				frame.setVisible(false);
				new View();

			}
		});

		buttonDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int numberDelStr = 0;
				try {
					strFromTwoWind = windowInput.newStringInfo("del");
					numberDelStr = Integer.parseInt(strFromTwoWind);
					if (0 < numberDelStr) {
						controller.deleteEventButton(numberDelStr - 1);
					} else {
						actionPerformed(arg0);
					}
				} catch (Exception e) {
					actionPerformed(arg0);
				}
				controller.buildNewTableModel();
				frame.setVisible(false);
				new View();

			}
		});
		buttonChange.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int numberDelStr = 0;
				try {
					strFromTwoWind = windowInput.newStringInfo("del");
					numberDelStr = Integer.parseInt(strFromTwoWind);
					if (0 < numberDelStr) {
						controller.changeEventButton(numberDelStr - 1);
					} else {
						actionPerformed(arg0);
					}
				} catch (Exception e) {
					actionPerformed(arg0);
				}
				controller.buildNewTableModel();
				frame.setVisible(false);
				new View();

			}
		});

		frame.setVisible(true);

	}

	public String getStrFromTwoWind() {
		return strFromTwoWind;
	}

	public void setStrFromTwoWind(String strFromTwoWind) {
		this.strFromTwoWind = strFromTwoWind;
	}

	public static void main(String[] args) {
		new View();

	}

}
package GraphicPart;

import java.util.ArrayList;
import java.util.List;



import javax.swing.table.DefaultTableModel;

public class Controller {
	Model model = new Model();
	private Object[][] iMasWord;
	private Object[] iColumnHead;
	private List<String> tablArray;
	private DefaultTableModel tableModel;

	public Controller() {
		tablArray = model.getTablArray();
		iColumnHead = model.getcolumnHead();
		iMasWord = model.word();
	
	}

	public DefaultTableModel buildNewTableModel() {
		this.tableModel = new DefaultTableModel();
		tableModel.setColumnIdentifiers(iColumnHead);
		for (int i = 0; i < iMasWord.length; i++) {
			tableModel.addRow(iMasWord[i]);
		}
		return tableModel;
	}

	public void saveStringInList(String saveList) {

		tablArray.add(saveList);
		model.setTablArray(tablArray);
	}

	
	public Object[][] getMasWord() {
		return iMasWord;
	}

	
	public Object[] getColumnHead() {
		return iColumnHead;
	}

	public void deleteEventButton(int number) {
		tablArray.remove(number);
		model.setTablArray((ArrayList<String>) tablArray);
	}

	public void changeEventButton(int number) {
		WindowForInput inputWindow = new WindowForInput();
		String setString = inputWindow.newStringInfo("add");
		tablArray.set(number, setString);
		model.setTablArray((ArrayList<String>) tablArray);

	}

	public int getSizeList() {
		int a = model.getSizeArray();
		return a;
	}

}

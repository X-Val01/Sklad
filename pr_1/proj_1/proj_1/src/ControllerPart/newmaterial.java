package ControllerPart;

import java.util.Scanner;

public class newmaterial {

	public newmaterial() {

	}

	public void newmat() throws Exception {

		Scanner in = new Scanner(System.in);

		for (int j = 1; j > 0; j++) {
			System.out.println(" Show Table - 1\n Add  new material - 2\n "
					+ "Change material - 3\n Delete Material - 4\n"
					+ " Back to first menu - 5");
			String str2 = in.nextLine();

			if (str2.compareTo("2") == 0) {
				AddNewInfo addNewInfo = new AddNewInfo();
				addNewInfo.addNewMaterial();

			}
			if (str2.compareTo("1") == 0) {
				ShowInfo showinfo = new ShowInfo();
				showinfo.shapka();
				continue;
			}

			if (str2.compareTo("3") == 0) {
				ChangeInfoInFile change = new ChangeInfoInFile();
				change.change();
				continue;
			}

			if (str2.compareTo("4") == 0) {
				DeleteInfoInFile delete = new DeleteInfoInFile();
				delete.deleteone();
				continue;
			}

			if (str2.compareTo("5") == 0) {
				break;
			}

			else {
				System.out.println("Write correct data");
				newmat();
			}
		}
	}

}

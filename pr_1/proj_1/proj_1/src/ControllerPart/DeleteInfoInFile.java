package ControllerPart;


import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteInfoInFile  {
	List<String> tabl;
Model model = new Model();
	public DeleteInfoInFile() {
		tabl = new ArrayList<String>();
	}

	public void deleteone() throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input  which string want delete.");
		
			tabl =model.CarryOverInfoFileToList();
			model.ClearTextFiel();

			try {

				int intdelstr;
				while (true) {
					intdelstr = Integer.parseInt(scanner.nextLine());
					intdelstr--;
					if (intdelstr >= 0 && intdelstr <= tabl.size()) {
						break;
					} else {
						System.out.println("0 < Enter value <= " + tabl.size());
					}

				}
				tabl.remove(intdelstr);
			} catch (Exception e) {
				System.out.println(" You input wrong data.");
				deleteone();
			}

			for (int o = 0; o < tabl.size(); o++) {
				PrintWriter file1 = new PrintWriter(
						new BufferedWriter(new FileWriter("/home/x-val/git/pr_1/ProgrammInfo.txt", true)));
				file1.println(tabl.get(o));
				file1.close();
			}		
	}
}

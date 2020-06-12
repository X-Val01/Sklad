package ControllerPart;


import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeInfoInFile {
	ModelTech model = new ModelTech();
	String mas;
	public List<String> tabl;

	public ChangeInfoInFile() throws IOException {
		mas = "";
		tabl = new ArrayList<String>();
	}
	
	public void change() throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.println("You really want change info? YES/NO");
		String tupe = "4";
		while (tupe.compareTo("YES") != 0 || tupe.compareTo("NO") != 0) {
			tupe = in.nextLine().toUpperCase();

			if (tupe.compareTo("YES") == 0) {
				break;
			}

			if (tupe.compareTo("NO") == 0) {
				materials1_2 obj = new materials1_2();
				obj.window();
				break;
			}

			else {
				System.out.println("Please input  YES or NO");
				continue;
			}
		}

		System.out.print("Input number string whitch want change");

		tabl = model.CarryOverInfoFileToList();
			model.ClearTextFiel();
			try {

				int intdelstr;
				while (true) {
					 intdelstr = Integer.parseInt(in.nextLine());
					intdelstr--;
					if (intdelstr >= 0 && intdelstr <= tabl.size()) {
						break;
					} else {
						System.out.println("0 < Enter value <= " + tabl.size());
					}
				}
				mas = model.CreateNewString();
				tabl.set(intdelstr, mas);
				System.out.println(tabl.get(0)+ tabl.get(1));
				for (int o = 0; o < tabl.size(); o++) {
					PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter
							("/home/x-val/git/Sklad/Sklad/pr_1/ProgrammInfo.txt", true)));
					
					file.println(tabl.get(o));
					file.close();

				}
			} catch (Exception e) {
				System.out.println("you input wrong data");
				change();
			}
	
	}
}

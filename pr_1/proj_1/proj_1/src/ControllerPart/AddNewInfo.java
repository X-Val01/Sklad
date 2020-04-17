package ControllerPart;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;


public class AddNewInfo {
	String mas;
Model model = new Model();

	public AddNewInfo() {
		mas = "";
	}

	public void addNewMaterial() throws Exception {				
		try {
			PrintWriter fail = new PrintWriter(
					new BufferedWriter(new FileWriter("/home/x-val/git/pr_1/ProgrammInfo.txt", true)));
			mas = model.CreateNewString();
			fail.println(mas);
			mas = "";
			fail.close();
		} catch (Exception e) {
			System.out.println("Error");
		}		
	}
}

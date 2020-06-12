package ControllerPart;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;


public class AddNewInfo {
	String mas;
	ModelTech model = new ModelTech();

	public AddNewInfo() {
		mas = "";
	}

	public void addNewMaterial() throws Exception {				
		try {
			PrintWriter fail = new PrintWriter(
					new BufferedWriter(new FileWriter("/home/x-val/git/Sklad/Sklad/pr_1/ProgrammInfo.txt", true)));
			mas = model.CreateNewString();
			fail.println(mas);
			mas = "";
			fail.close();
		} catch (Exception e) {
			System.out.println("Error");
		}		
	}
}

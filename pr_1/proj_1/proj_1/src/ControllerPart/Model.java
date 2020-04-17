package ControllerPart;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Model {
	List<String> tabl;
	Scanner scanner = new Scanner(System.in);
public Model() {
	tabl = new ArrayList<String>();
}
public String CreateNewString() throws IOException {
	String mas="";
	for (int i = 0; i < 6; i++) {
		
		System.out.println("Write data in column " + (i + 1));
		System.out.println("Cancel - 01\n  " + "Return on one step back - 02 ");
		String scannerStr = scanner.nextLine();
		String str1 = scannerStr;
		str1 = str1.toUpperCase();
		 mas = mas + scannerStr+"\t\t";
		

		if (scannerStr.compareTo("01") == 0) {
			break;
		}

		if (scannerStr.compareTo("02") == 0) {
			i--;
			continue;
		}
	}
	return  mas;
}
public void ClearTextFiel() throws IOException {	
	PrintWriter file1;
	try {
	file1 = new PrintWriter(
				new BufferedWriter(new FileWriter("/home/x-val/git/pr_1/ProgrammInfo.txt")));
		file1.println("");
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
public List CarryOverInfoFileToList() throws IOException {
	BufferedReader reader;
	try { reader = new BufferedReader(new FileReader(new File("/home/x-val/git/pr_1/ProgrammInfo.txt")));
			String str;
			tabl.clear();
			while ((str = reader.readLine()) != null) {
				tabl.add(str);
				
			}
	
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}	
 
	return tabl;
}
}


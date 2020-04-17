package ControllerPart;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ShowInfo   {
	String[] shapka;
	public ShowInfo() {
		shapka = new String[6];
		
	}
	
public void shapka() throws IOException  {		
		shapka[0] = "N   ";	
		shapka[1] = "N company";	
		shapka[2] = "Name Material   ";	
		shapka[3] = " Quantity   ";	
		shapka[4] = " Price.   ";	
		shapka[5] = "Full Price";
		String titlone = "1\t\t" + "2\t\t"+ "3\t\t" + "4\t\t"+"5\t\t" + "6\t\t"; 		
		String titltwo = shapka[0]+"\t"+shapka[1]+"\t"+shapka[2]+"\t"+ 
				shapka[3]+"\t"+shapka[4]+"\t"+shapka[5] ;
		System.out.println(titlone+"\n"+titltwo);
	
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(
					new File("/home/x-val/git/pr_1/ProgrammInfo.txt")));	
			String str;
			while((str=reader.readLine()) != null) {
				System.out.println(str);
				}
				reader.close();
			}catch(Exception e) {
			System.out.println("Error");
		}
	
	}
}

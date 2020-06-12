package ControllerPart;
import java.util.Scanner;

import GraphicPart.View;

import java.lang.String;
import java.io.IOException;
import java.lang.Math;

public class materials1_2 {
	
	public materials1_2() {	
	}
	
	public void window() throws Exception {
		
		
		for (int i = 1; i > 0; i++) {
		System.out.print("	Select action:\n	input 1 - changer data in table \n"
				+ "\tinput 2 - open graphicPart\n"
				+ "	input 3 - you exit in main menu" );

		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
			if(str.compareTo("1") == 0) {
				newmaterial obj1 = new newmaterial();
				obj1.newmat();
				continue;
				
			}
			if(str.compareTo("2") == 0) {
				//View view = new View();
				//view.createFrame();
				continue;	
			}
			if(str.compareTo("3") == 0) {
				break;	
			}
			
			else {
			System.out.println(" not true input data");
			}
			
			
		}
	
	
	}
}
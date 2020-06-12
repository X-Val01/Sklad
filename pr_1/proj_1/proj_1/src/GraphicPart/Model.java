package GraphicPart;


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

import ControllerPart.ModelTech;

public class Model   {
	private Object[][] iMasWord;
	private Object[] iColumnHead;
	private List<String> tablArray;
	
	public Model() {
	
		tablArray = new ArrayList<String>();
		iMasWord= new Object[6][];
		iColumnHead =new Object[6];
	}
	public Object[] getcolumnHead()  {
		iColumnHead[0] = "N   ";	
		iColumnHead[1] = "N company";	
		iColumnHead[2] = "Name Material   ";	
		iColumnHead[3] = " Quantity   ";	
		iColumnHead[4] = " Price.   ";	
		iColumnHead[5] = "Full Price";
		return iColumnHead;
	}
	public List CarryOverInfoFileToList()  {
		BufferedReader reader;
		try { reader = new BufferedReader(new FileReader(new File("/home/x-val/git/Sklad/Sklad/pr_1/ProgrammInfo.txt")));
				String str;
				tablArray.clear();
				while ((str = reader.readLine()) != null) {
					tablArray.add(str);
					
				}	
		} catch ( Exception e) {
			e.printStackTrace();
		}	
	 
		return tablArray;
	}
	public Object[][] word() {
		
			tablArray = CarryOverInfoFileToList();
		for (int i = 0; i < tablArray.size(); i++) {	
			iMasWord[i]=	tablArray.get(i).split("\t\t");				
			
	}
		return iMasWord;
		

	}
	
	public List getTablArray() {
		return tablArray;
	}
	
	
	public synchronized  void   setTablArray(List<String> list)  {
		
		this.tablArray= list;
		
		PrintWriter file;
		try {
			file = new PrintWriter(new BufferedWriter(new FileWriter
					("/home/x-val/git/Sklad/Sklad/pr_1/ProgrammInfo.txt")));
		
		file.println("");
		
		
		
		for (int o = 0; o < tablArray.size(); o++) {
			
			
				file = new PrintWriter(new BufferedWriter(new FileWriter
						("/home/x-val/git/Sklad/Sklad/pr_1/ProgrammInfo.txt", true)));
				file.println(tablArray.get(o));
				file.close();
			}
		tablArray.clear();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}	
	
	public int getSizeArray() {
		return tablArray.size();
	}
	public void masword(){	
		for (int i = 0; i < tablArray.size(); i++) {		
			iMasWord[i]=	tablArray.get(i).split("\t\t");							
	}		
		}
	public Object[][] getMasWord(){
		return iMasWord;
	}
	public Object[] getColumnHead() {
		return iColumnHead;
	}

	}

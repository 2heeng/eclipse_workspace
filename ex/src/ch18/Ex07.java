package ch18;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex07 {

	public static void main(String[] args) throws Exception{
		String filePath = "C:\\Users\\Administrator\\eclipse-workspace\\ch18\\src\\sec02\\WriteEx.java";
						
				FileReader fr = new FileReader(filePath);
				BufferedReader br = new BufferedReader(fr);
				
				int rowNumber = 0;
				 String rowData;
				
				 while(true) {
					 rowData = br.readLine();
					 if(rowData==null) { break;}
					 System.out.println(rowNumber+"\t"+rowData);
					 rowNumber++;
				 }
				 
				 
				 br.close(); fr.close();
	}

}

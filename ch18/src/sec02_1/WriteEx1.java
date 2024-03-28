package sec02_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx1 {

	public static void main(String[] args) {
	
//	try {
//		OutputStream os=new FileOutputStream("C:/ex/temp/test1.db");
//		byte arr[]= {10,20,30,40,50};
//		
//		os.write(arr);
//		
//		os.close();
//		
//	} catch (Exception e) {
//		System.out.println("파일 관련 예외");
//	}
	
	//try with resource 문
	try(OutputStream os=new FileOutputStream("C:/ex/temp/test2.db");) {
		byte arr[]= {10,20,30,40,50};
		
		os.write(arr);
		
		//os.close();
		
	} catch (Exception e) {
		System.out.println("파일 관련 예외");
	}
	
	
		

	}

}

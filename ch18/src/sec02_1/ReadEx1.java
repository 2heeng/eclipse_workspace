package sec02_1;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx1 {

	public static void main(String[] args) {
		
//		try {
//			InputStream is = new FileInputStream("C:/ex/temp/test1.db");
//			
//			//여러개이므로 반복문으로
//			while(true) {
//				
//				int data =is.read();
//				if (data == -1) {
//					break;
//				}
//				System.out.println(data);
//			}
//		
//			is.close();
//		} catch (Exception e) {
//			System.out.println("파일 관련 예외");
//		}
		
		
		//try with resource 문
		try(InputStream is = new FileInputStream("C:/ex/temp/test2.db");) {
		
			
			//여러개이므로 반복문으로
			while(true) {
				
				int data =is.read();
				if (data == -1) {
					break;
				}
				System.out.println(data);
			}
		
			//is.close();
		} catch (Exception e) {
			System.out.println("파일 관련 예외");
		}
		
		
	}

}

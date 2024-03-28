package sec02_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class CharConvertStreamEx {

	static void read() {
		try {
			new FileInputStream("C:ex/temp/test7.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void write(String str) {
		try {
			OutputStream os = new FileOutputStream("C:ex/temp/test7.txt");
			
		} catch(FileNotFoundException e) {
				
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

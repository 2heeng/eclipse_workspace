package sec02_1;

import java.io.FileReader;
import java.io.Reader;

public class FileReader1 {

	public static void main(String[] args) {

		try (Reader is = new FileReader("C:/ex/temp/test5.txt");){
			
//			int data=is.read();
//			System.out.println(data);
			
			
			while (true) {

				int data = is.read();
				if (data == -1) {
					break;
				}
				System.out.print((char)data);
			}
			
			
		} catch (Exception e) {
			System.out.println("파일 관련 예외");
		}

	}

}

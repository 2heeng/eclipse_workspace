package sec02_1;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterEx1 {

	public static void main(String[] args) {
		
		try (Writer os = new FileWriter("C:/ex/temp/test5.txt");){
			
			os.write("fghjk");
			
			
		} catch (Exception e) {
			System.out.println("파일 관련 예외");
		}
				
		
	}

}

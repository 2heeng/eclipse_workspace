package sec02_1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class WriteReadEx2 {

	public static void main(String[] args) {
		
		try (Writer os = new FileWriter("C:/ex/temp/test6.txt");
			Reader is = new FileReader("C:/ex/temp/test6.txt");) {
			
			//byte arr[] = { 10, 20, 30, 40, 50 };

			char data[]=new char[5];
			
			os.write("가나다\n라마바");
			os.flush();
			

			while (true) {

				int num = is.read(data);
				for(int i=0;i<num;i++) {
					System.out.print(data[i]);
				}
				if (num == -1) {
					break;
				}
				//System.out.println(data);
			}

		} catch (Exception e) {
			System.out.println("파일 관련 예외");
		}

	}

}

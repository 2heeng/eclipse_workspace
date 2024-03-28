package sec02_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class WriteReadEx3 {

	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("C:/ex/temp/test7.txt");
			InputStream is = new FileInputStream("C:/ex/temp/test7.txt");
			//byte arr[] = { 10, 20, 30, 40, 50 };

			Writer writer = new OutputStreamWriter(os);
			
			writer.write("가나다라마바");
			writer.flush();

			Reader reader = new InputStreamReader(is, "utf-8");
					
			char data[] = new char[100];

			while (true) {

				int num = reader.read(data);
				if (num == -1) {
					break;
				}
				System.out.println(data);
			}
			os.close();
			is.close();

		} catch (Exception e) {
			System.out.println("파일 관련 예외");
		}

	}

}

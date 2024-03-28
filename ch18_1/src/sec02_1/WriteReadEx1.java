package sec02_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class WriteReadEx1 {

	public static void main(String[] args) {
		// write와 read를 같이 해보자

		try (OutputStream os = new FileOutputStream("C:/ex/temp/test3.db");
			InputStream is = new FileInputStream("C:/ex/temp/test3.db");) {
			byte arr[] = { 10, 20, 30, 40, 50 };

			os.write(arr);

			while (true) {

				int data = is.read();
				if (data == -1) {
					break;
				}
				System.out.println(data);
			}

		} catch (Exception e) {
			System.out.println("파일 관련 예외");
		}

	}

}

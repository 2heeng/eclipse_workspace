package sec02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class WriteReadEx2 {

	public static void main(String[] args) {
		
		//스트림(입,출) 파일의 형태(문자포함, 문자만)
		
		try {
			OutputStream os = new FileOutputStream("C:/ex/test4.txt");
			
			byte arr[] = {67,68,69, 70,71};
			os.write(arr);
			
			InputStream is = new FileInputStream("C:/ex/test4.txt");
			
			while(true) {
				int result = is.read();
				if(result==-1) {
					break;
				}
				char ch = (char)is.read();
				System.out.println(ch);
			}
			
			//System.out.println(result);
			//System.out.println(result2);
		} 
		catch(Exception e) {
			
		}
		

	}

}

package sec02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class WriteReadEx {

	public static void main(String[] args) {
		
		//스트림(입,출) 파일의 형태(문자포함, 문자만)
		
		try {
			OutputStream os = new FileOutputStream("C:/ex/test4.txt");
			//new FileWriter("");
			//System.out.println(os);
			
			//os.write(65);
			//os.write(66);
			
			byte arr[] = {67,68,69};
			os.write(arr);
			
			
			InputStream is = new FileInputStream("C:/ex/test4.txt");
			// int result = is.read(); //read메소드는 입력 스트림으로부터 1byte를 읽고 int(4byte) 타입으로 리턴. 리턴된 4byte 중 끝 1byte에만 데이터가 들어 있음 
			int result2 = is.read(arr); //read(byte[ ] b) 메소드: 입력 스트림으로부터 주어진 배열의 길이만큼 바이트를 읽고 배열에 저장한 다음 읽은 바이트 수를 리턴

			//더이상 입력 스트림으로부터 바이트를 읽을 수 없다면 read()메서드는 -1을 리턴.
			
			//System.out.println(result);
			System.out.println(result2);
		} 
		catch(Exception e) {
			
		}
		

	}

}

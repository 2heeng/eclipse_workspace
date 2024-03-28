package sec02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteEx {

	public static void main(String[] args) {
	
		//new OutputStream();
		//추상클래스라서 객체 만들 수 없음. 자식으로 만들어야 함.
		
		//그렇다면 OutputStream의 자식은 뭐가 있는가?
		
		//FileOutputStream -> 매개변수가 꼭 하나는 들어가 있어야 함. 
		//저장할 폴더나 파일이 없는 경우를 위한 예외처리를 해야함
		//경로지정 가능. 경로 안쓰면 프로젝트  properties폴더로 들어감
		
		//FileOutputStream fos;
		FileOutputStream fos2;
		try {
			//new FileOutputStream("test.txt");
			//fos = new FileOutputStream("C:/ex/test.txt");
			//new FileOutputStream("C:/ex1/test.txt");
			
			fos2 = new FileOutputStream("C:/ex/test2.db");
			
			byte a = 67;
			byte b = 68;
			
			try {
				fos2.write(a); //숫자넣으면 아스키코드로 들어감
				fos2.write(b);
				fos2.close();
			} catch (IOException e) {
				System.out.println("입출력시에 예외가 발생함");
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("폴더나 파일이 없네요");
		}
		

	}

}

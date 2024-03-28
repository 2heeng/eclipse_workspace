package sec02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteEx2 {

	public static void main(String[] args) {
	
	
		FileOutputStream fos2;
		try {
			//OutputStream은 내부에 작은 buffer을 가지고 있음
			//write메소드가 호출되면 버퍼(데이터를 일시적으로 저장하고 필요한 경우에 한번에 처리할 수 있도록 
			//바이트를 우선 저장하고 버퍼가 차면 순서대로 바이트를 출력
			//flush메소드는 내부 버퍼에 잔류하는 모든 바이트를 출력하고 버퍼를 비우는 역할
			//내부 버퍼를 사용하는 이유는 출력 성능을 향상하기위해
			//출력 스트림을 더 이상 사용하지 않을 경우 close()호출해서 출력 스트림ㅇ이 사용했던 메모리를 해제하는 것이 좋다. 
			fos2 = new FileOutputStream("C:/ex/test3.txt");
			
//			byte a = 67;
//			byte b = 68;
			
			byte arrbyte[] = {65,66,67,68,};
			
			try {
				fos2.write(arrbyte); //숫자넣으면 아스키코드로 들어감
				//fos2.write(b);
				fos2.close();
				//입출력시스템은 하드웨어 자원(resource)이므로 공유함. 
			} catch (IOException e) {
				System.out.println("입출력시에 예외가 발생함");
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("폴더나 파일이 없네요");
		}
		

	}

}

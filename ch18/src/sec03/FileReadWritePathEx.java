package sec03;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWritePathEx {

	public static void main(String[] args) {
		
		//파일과 경로 관련 처리는 nio에 있는 files와 paths를 이용하는 것이 편하다. 

		
		//파일을 만들고 그 안에 데이터도 넣어보자
		String data = "hi \n안녕하세요";
		
		//어디다가 저장할거야?
		Path path =Paths.get("C:/TEMP/work/hi1.txt");
		
		System.out.println(path);
		
		//CharSequence는 읽을 수 있는 char 값의 시퀀스입니다. 
		//Interface Openoption은 파일을 열거나 생성하는 방법을 구현하는 객체입니다.
		//파일에 CharSequence를 씁니다. 문자는 utf-8 문자 세트를 사용하여 바이트로 인코딩됩니다. 
		try {
			Files.writeString(path, data,Charset.forName("UTF-8")); 
			
			
			//파일 정보 읽기
			String fileInfo = Files.probeContentType(path);
			System.out.println(fileInfo);
			//파일 읽기
			String content = Files.readString(path,Charset.forName("UTF-8") );
			System.out.println(content);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}

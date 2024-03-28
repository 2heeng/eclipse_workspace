package sec02_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectInputOutputStreamEx {

	public static void main(String[] args) {
		
		try(OutputStream fos = new FileOutputStream("C:/Temp/object.dat");
			ObjectOutputStream oos =new ObjectOutputStream(fos);
			InputStream fis = new FileInputStream("C:/Temp/object.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);) {
			
			//객체 생성
			Member m1 = new Member("홍길동","hong");
			
			//객체를 역직렬화해서 파일에 저장
			oos.writeObject(ois);
			
			Member m2 = (Member) ois.readObject();
			System.out.println(m2.get);
			
			
		} catch (Exception e) {
			System.out.println("파일 관련 예외");
		}
		
	}
	
}

package sec14;

public class SingleTone {

	//필드
	
	private static SingleTone singletone=new SingleTone();
	
	//생성자
	private SingleTone() {
		
	}
	//메소드
	public static SingleTone getInstance() {
		return singletone;
	}
}

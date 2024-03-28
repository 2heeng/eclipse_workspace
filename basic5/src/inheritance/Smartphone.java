package inheritance;

public class Smartphone extends Phone {

	//필드
	boolean wifi;
	
	//생성자
	public Smartphone() {
	// super(); //컴파일 과정에서 자동 추가, 생략가능
	}
	public Smartphone(String model, String color) {
		super(model,color);
		}
	//메소드
	void internet() {
		System.out.println("connected");
	}
}

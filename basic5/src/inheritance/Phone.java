package inheritance;

public class Phone {

	//접근제어자modifier : public, protected, private
	
	//필드
	String model;
	String color;
	
	
	
	//생성자
	public Phone() {
		
	}
	public Phone(String model, String color) {
		this.model=model;
		this.color=color;
		System.out.println("두개짜리 부모 생성자 실행");
	}
	
	//메소드
	void bell() {
		System.out.println("ring ring");
	}
	
	
	
}

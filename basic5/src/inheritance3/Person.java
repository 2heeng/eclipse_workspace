package inheritance3;

public class Person {

	//필드
	String name;
	
	//생성자
	public Person() {
		
	}
	
	public Person(String name) {
		this.name=name;
	}
	
	//메소드
	void walk() {
		System.out.println("걷는다");
	}
}

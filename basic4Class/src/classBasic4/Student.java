package classBasic4;

public class Student {

	//필드
	String name; //인스턴스 필드,객체를 만드는(인스턴스화) 행위를 통해서 사용하는 것이 좋다
	static String schoolName="미금고"; //정적(static)필드, Student(클래스)에 바로 접근해서 사용.
	
	//생성자
	public Student() {
		
	}
	
	//메서드
	// 메서드는 두가지가 있는데 데이터 타입앞에 static이 안붙으면 인스턴스메서드,
	// static이 있으면 정적(static)메서드라고 한다.
	void study() {
		System.out.println("공부하자");
	}
	static void staticMethod() {
		System.out.println("공부하거라");
	}
}

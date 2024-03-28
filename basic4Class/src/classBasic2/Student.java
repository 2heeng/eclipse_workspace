package classBasic2;

public class Student {
	//필드
	String name;
	
	//생성자
	public Student() {
		System.out.println("hi");
	}
	
	//메개변수가 있는 생성자
	//메개변수자리에 있는 스트링네임은 필드에 있는 스트링네임과 다른 것이다.
		Student(String name){
			this.name=name; 
			//this는 자기 자신(Student클래스)을 가리키는 예약어
			//여기 클래스에 있는 name(필드)을 변수 name안에 넣겠다.
			
			
		}
		
	//메서드
}

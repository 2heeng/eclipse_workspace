package classBasic;

public class Student {

	//필드(field): 데이터의 단위, 객체의 데이터를 저장하는 역할
	//변수 선언과 비슷하지만 쓰임새가 다름
	String name;
	
	//생성자(constructor) : new 연산자로 객체를 생성할 때 객체의 초기화 역할
	//기본 생성자 : 메개변수가 없는 생성자, 생략가능
	Student() {}
	
	//메개변수가 있는 생성자
	//메개변수자리에 있는 스트링네임은 필드에 있는 스트링네임과 다른 것이다.
	Student(String name){
		this.name=name; 
		//this는 자기 자신(Student클래스)을 가리키는 예약어
		//여기 클래스에 있는 name(필드)을 변수 name안에 넣겠다.
		
		
	}
	
	
	
	//메서드(method)

		
}

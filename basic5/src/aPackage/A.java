package aPackage;

public class A {

	//필드
	//필드는 모든 데이터타입 가능. B 클래스 타입으로 필드 선언 가능
	B b; //포함관계. A안에 B가 있는거임.클래스 안에 필드로 선언됨.
	//생성자
	public A() {
		
	}
	//메서드
	public static void main(String[] args) {
		
		B bb=new B();
		bb.num1=3;
		System.out.println(bb.num1);
	}
}

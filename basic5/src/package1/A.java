package package1;

public class A {
	
	//필드(인스턴스,static)
	//기본형, 참조형(배열,열거,클래스,인터페이스)
	A a1 = new A(true);
	A a2 = new A(1);
	A a3=new A("hi");
	
	//생성자
	public A() {
	
	}
	
	public A(boolean b){
		
	}
	
	 A(int b){
		//같은 클래스 안에서 default 호출 가능
	}
	
	 private A(String s) {
		//같은 클래스 안에서 private 호출 가능
	}
	//메소드
	
	
}

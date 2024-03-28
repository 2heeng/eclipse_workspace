package interfaceEx3;

public class Car {

	//필드(인스턴스,static) 접근제한자(public,protected,d,private)
	//필 (기본형, 참조형-배열 열거 클래스 인터페이스))
	Tire tire1=new HTire();
	Tire tire2=new KTire();
	
	
	void run() {
		tire1.roll();
		tire2.roll();
	}
	
}

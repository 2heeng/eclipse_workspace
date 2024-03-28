package inheritance;

public class Car {
	int speed;
	
	void speedUp() {
		speed+=1;
	}
	final void stop() {
		System.out.println("차 멈춤");
		speed=0;
	} //final이 붙은 부모의 메소드는 자식이 재정의(오버라이딩)할 수 없다.
}

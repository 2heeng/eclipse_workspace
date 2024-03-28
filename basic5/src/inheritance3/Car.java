package inheritance3;

public class Car {
 
	
	//Car와 Tire은 포함-부품 관계
	
	Tire tire; //필드
	
	void run() {
		// this.tire.roll();
		tire.roll();
	}
}

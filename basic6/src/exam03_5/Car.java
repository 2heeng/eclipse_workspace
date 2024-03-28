package exam03_5;

public class Car {
	//타이어의 자식을 익명으로 바로 만들 수 있음. 
	//중괄호를 하는 순간 Tire가 부모클래스가 되고, 중괄호는 이름이 없는 자식클래스가 됨
	Tire ktire = new Tire() {
		
		void roll() {
			System.out.println("금호타이어가 굴러감");
		}
	};
Tire htire = new Tire() {
		
		void roll() {
			System.out.println("한국타이어가 굴러감");
		}
	};
	
	
	void run() {
		ktire.roll();
		htire.roll();
	}
	
	
}

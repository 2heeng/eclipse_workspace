package exam03_5_2;

public class Car {
	
	void run() {
		Tire tire = new Tire() {
			@Override
			void roll() {
			System.out.println("금호타이어가 굴러감");
			}
		};
		tire.roll();
		
	}
	
	
}

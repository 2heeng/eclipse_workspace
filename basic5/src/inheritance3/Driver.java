package inheritance3;

public class Driver {

	//메소드 정의시 4가지 형태(매개변수 여부, 리턴 유무)
	//매개변수에 들어갈 타입(기본형, 참조형-배열열거클래스인터페이스)
	void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

package generic2;

public class GenericTest {

	public static void main(String[] args) {
		
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
		
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOnLight();

	}

}

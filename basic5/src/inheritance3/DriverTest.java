package inheritance3;

public class DriverTest {

	public static void main(String[] args) {
		
		Driver driver=new Driver();
		Vehicle vehicle = new Vehicle();
		// driver.drive(vehicle);
		
		
		Bus bus = new Bus();
		// vehicle=bus;
		driver.drive(bus); //자동형변환이 됨.
		
		//Taxi taxi = new Taxi();
		// driver.drive(taxi);
		driver.drive(new Taxi());//한번에 이렇게 해도 됨.

	}

}

package interfaceEx3;

public class CastingTest {

	public static void main(String[] args) {
		Vehicle vehicle=new Bus();
		
		vehicle.run();
		
		Bus bus =(Bus)vehicle;
		bus.checkFare();
		

	}

}

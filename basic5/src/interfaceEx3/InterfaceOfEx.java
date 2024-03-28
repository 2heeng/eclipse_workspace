package interfaceEx3;

public class InterfaceOfEx {

	public static void main(String[] args) {
		
		Taxi taxi = new Taxi();
		
		ride(taxi);
		
		Bus bus=new Bus();
		ride(bus);
		
		
		

	}
	
	static void ride (Vehicle vehicle) {
		
		if (vehicle instanceof Bus bus) {
			//Bus bus=(Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}

}

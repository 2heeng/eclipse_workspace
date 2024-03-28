package inheritance;

public class SuperSonicAirplaneTest {

	public static void main(String[] args) {
		
		SuperSonicAirplane superSonicAirplane=new SuperSonicAirplane();
		
		superSonicAirplane.takeoff();
		superSonicAirplane.flymode=superSonicAirplane.SUPERSONIC;
		superSonicAirplane.fly();
		superSonicAirplane.flymode=superSonicAirplane.NORMAL;
		superSonicAirplane.fly();
	}

}

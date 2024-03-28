package generic2;

public class HomeAgency implements Rentable {

	@Override
	public Home rent() {
		return new Home();
		
	}

	

}

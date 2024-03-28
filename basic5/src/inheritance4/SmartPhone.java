package inheritance4;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
		
	}
	
	void internetSearch() {
		System.out.println("인터넷 검색");
	}

	@Override
	void bell() {
		System.out.println("ring ring");
		
	}
	
	

	
}

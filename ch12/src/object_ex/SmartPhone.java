package object_ex;

public class SmartPhone {

	
	String company;
	String os;
	
	@Override
	public String toString() {

		return this.company + "," +  this.os;
		
	}

	public SmartPhone(String company, String os) {
		super();
		this.company = company;
		this.os = os;
	}
	
	
}

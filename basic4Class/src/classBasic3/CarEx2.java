package classBasic3;

public class CarEx2 {

	public static void main(String[] args) {
		
		Car2 myCar=new Car2();
		System.out.println(myCar.model+myCar.color+myCar.maxspeed);
		
		Car2 myCar2=new Car2("에쿠스");
		System.out.println(myCar2.model+myCar2.color+myCar2.maxspeed);
	
		Car2 myCar3=new Car2();
		myCar3.roll();
	
	
	
	
	}

}

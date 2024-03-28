package classBasic5;

public class CarTest {

	public static void main(String[] args) {
		
		Car myCar=new Car();
		
		System.out.println(myCar.speed);

		myCar.changeSpeed();
		System.out.println(myCar.speed);
	}

}

package sec14_2;

public class CarUse {

	public static void main(String[] args) {
		
		Car myCar=new Car();
		
		myCar.getSpeed();
		myCar.setSpeed(200);
		int result = myCar.getSpeed();
		System.out.println(result);
		
		myCar.isStop();
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
	System.out.println(myCar.getSpeed());
	
	
	}

}

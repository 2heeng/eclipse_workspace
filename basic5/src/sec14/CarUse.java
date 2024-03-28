package sec14;

public class CarUse {

	public static void main(String[] args) {
		
		Car myCar=new Car();
		
		int result=myCar.getSpeed();
		
		myCar.setSpeed(100);
		int result2=myCar.getSpeed();
		System.out.println(result2);
		
		// 멈춤
		// myCar.isStop();
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
	
	System.out.println(myCar.getSpeed());
	
	
	
	
	
	}

}

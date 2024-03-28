package interfaceEx3;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달린다");
		
	}
	
	void checkFare() {
		System.out.println("승차 요금 체크");
	}

}

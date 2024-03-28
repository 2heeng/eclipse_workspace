package inheritance;

public class SuperSonicAirplane extends Airplane {

	//필드
	//상수
	static final int NORMAL=1;
	static final int SUPERSONIC=2;
	
	int flymode=NORMAL;
	//생성자
	
	//메소드
	//재정의하기
	@Override //어노테이션
	void fly() {
		if(flymode==SUPERSONIC) {
			System.out.println("초음속 비행");
		} else {
			super.fly();
		}
		
	}
	
	
	
	
}

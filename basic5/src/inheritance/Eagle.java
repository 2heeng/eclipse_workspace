package inheritance;

public class Eagle extends Bird {
	//필드
	
	//생성자
	public Eagle() {
		
	}
	public Eagle(String food, int big) {
		this.food=food;
		this.big=big;
	}
	//메소드
	@Override
	void fly(String food, int big) {
		System.out.println("독수리는 " + food + "을 한다.");
		System.out.println("독수리의 크기는 보통 약 " + big + "cm 이다.");
		
	}
}

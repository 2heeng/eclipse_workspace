package inheritance;

public class Bird {

	//필드
	String food;
	int big;
	//생성자
	public Bird() {
		
	}
	//메소드
	void fly(String food, int big) {
		System.out.println("새는 주로" + food + "이다");
		System.out.println("새의 크기는 보통 약 " + big + "cm 이다.");
	}
}

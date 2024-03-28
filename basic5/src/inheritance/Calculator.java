package inheritance;

public class Calculator {
	//필드
	
	//생성자
	public Calculator() {
	
	}
	//메소드
	double areaCircle(double r) {
		System.out.println("부모의 메소드");
		double result=3.14159*r*r;
		return result;
	}
}

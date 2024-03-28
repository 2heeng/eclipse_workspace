package inheritance;

public class Computer extends Calculator{

	//필드
	
	//생성자
	public Computer() {
	
	}
	//메소드
	//부모가 정의 메소드를 자식이 재정의 할 수 있다.
//	double areaCircle(double r){
//		System.out.println("자식의 메소드");
//		double result=Math.PI*r*r;
//		return result;
//	}
	@Override //어노테이션(주석)
	double areaCircle(double r) {
		System.out.println("자식의 메소드");
		double result=Math.PI*r*r;
		return result;
	}
}

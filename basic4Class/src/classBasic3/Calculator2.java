package classBasic3;

public class Calculator2 {

	//필드
	
	//생성자
	public Calculator2() {
		
	}
	//메서드
	//메서드 오버로딩: 매개변수의 타입, 갯수, 순서가 다른 메서드를 여러개를 선언하는 것
	//정사각형 넓이
	double areaRectangle(double width) {
		double result=width*width;
		return result;
	}
	//오버로딩으로 직사각형 넓이 구하기
	double areaRectangle(double width,double height) {
		double result=width*height;
		return result;
	}
	double areaRectangle(int width,double height) {
		double result=width*height;
		return result;
	}
	
}

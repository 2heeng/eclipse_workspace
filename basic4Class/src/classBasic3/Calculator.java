package classBasic3;

public class Calculator {

	//필드
	
	//생성자
	public Calculator() {
		
	}
	//메서드
	//두 수를 넣어서 더한 후에 반환하는 기능의 함수를 정의
	void add(int num1,int num2) {
		int result=num1+num2;
		System.out.println(result);
	}
	int add2(int num1, int num2) {
		int result=num1+num2;
		return result;
	}
	int x(int num1, int num2) {
		int result=num1*num2;
		return result;
	}
	double division(double num1,double num2) {
		double result=num1/num2;
		return result;
	}
}

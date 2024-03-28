package classBasic5;

public class Calculator {

	public Calculator() {
		powerOff();
	}

	void powerOn() {
		System.out.println("전원 켬");
	}

	void powerOff() {
		System.out.println("전원 끔");
	}

	int plus(int x, int y) {
		int result=x+y;
		return result;
	}

	double devide(int x, int y) {
		double result = (double) x / y;
		return result;
	}
}

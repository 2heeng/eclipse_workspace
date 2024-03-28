package classBasic5;

public class CalculatorTest {
	
	//필드
	
	//생성자
	public CalculatorTest() {
	
	}
	
	//메소드
	public static void main(String[] args) {
		//여기서 아래 메소드를 호출하려면 메인메소드가 static이니까 아래 메소드도 static이어야 한다
		method();

	}
	static void method() {
		
		Calculator calc= new Calculator(); //메소드안에서 객체생성
		calc.powerOn();
		int result=calc.plus(4, 5);
		System.out.println(result);
		
		double result2=calc.devide(10, 4);
		System.out.println(result2);
		
	}

}

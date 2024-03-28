package classBasic3;

public class CalculatorEx {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		calculator.add(1,3);
		
		int result=calculator.add2(5, 6);
		System.out.println(result);
	
		int result2=calculator.x(8, 9);
		System.out.println(result2);
		
		double result3=calculator.division(10, 0.4);
		System.out.printf("%.2f",result3);
		
	}
}

package sec02;

public class Person {

	void useComputer(Calculable calculable) {

		double result = calculable.calc(10, 4);
		System.out.println(result);
	}

}

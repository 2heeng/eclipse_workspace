package sec03;

public class Person {

	void ordering(Comparable comparable) {

		int result =comparable.compare("a", "b");
		
		System.out.println(result);
	}

}

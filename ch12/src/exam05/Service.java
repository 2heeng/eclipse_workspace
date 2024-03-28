package exam05;


public class Service {

	@PrintAnnotation
	void method1() {
		System.out.println("m1");
	}
	
	@PrintAnnotation("*")
	void method2() {
		System.out.println("m2");
	}
	
	@PrintAnnotation(value="#",name=14)
	void method3() {
		System.out.println("m3");
	}
}

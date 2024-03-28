package exam03_2;

public class ATest {

	public static void main(String[] args) {

		A a= new A();
//		System.out.println(a.field);
//		a.method();
//		a.printA();
		
		//이렇게도 접근 가능
		// new A().printA();
		
		A.B ab = a.new B();
//		System.out.println(ab.field);
//		ab.method();
//		ab.printB();
		
		
//		System.out.println(a.new B());
//		a.new B().printB(); 
		
//		System.out.println(a);
		a.new B().printAA();
	}

}

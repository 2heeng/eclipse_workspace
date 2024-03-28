package exam03;

public class A {

	
	//필
	int field1;
	static int field2;
	
	//생
	public A() {
	
	}
	
	//메
	void method1() {
		System.out.println("A-m1");
	}
	static void method2() {
		System.out.println("A-m2");
	}
	
	//클래스
	class B{
//		field1=10;
//		method1();
//		field2=20;
		void method() {
			
			field1=10;
			System.out.println(field1);
			method1();
			field2=20;
			System.out.println(field2);
			method2();
	
		}
	}
	static class C{
		
		
	}
	
	
}

package exam03_1;

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
	
	static class C{
		
		void method() {
			//field1=3; //static이 아니어서 안됨
			field2=2;
			System.out.println(field2);
			//method1();//static이 아니어서 안됨 
			method2();
		}
	}
	
	
}

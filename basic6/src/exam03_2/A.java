package exam03_2;

public class A {

	
	//필
	String field="A-field";
	
	
	//생
	public A() {
	
	}
	
	//메
	void method() {
		System.out.println("A-m");
	}
	
	void printA() {
		System.out.println(this);
	}
	
	//클래스
	class B{
		
		String field="B-field";
		
		void method() {
			System.out.println("B-m");
		}
		void printB() {
			System.out.println(this);
		}
		void printAA() {
			System.out.println(A.this);
			System.out.println(A.this.field);
			A.this.method();
		}
		
	}
	
	
}

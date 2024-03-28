package exam01_1;

public class A {
	
	public A() {
		System.out.println("A 생성자 부분");
	}
	
	//메
	void uesB() {
		B b=new B();
		System.out.println(b.field);
		b.m1();
	}

	//인스턴스 멤버 클래스
	class B{
	
		//필
		int field=1;
		String str="hi";
		
		//Java 17부터 허용
		static int field2=2;
		
		//생
		public B() {
		
			System.out.println("B 생성자 부분");
			
		}
		
		//메
		
		void m1() {
			System.out.println("B-m1");
		}
		
		//Java 17부터 허용
		static void m2() {
			System.out.println("B-m2");
		}
		
		
		
		
	}
	
	//정적 멤버 클래스
//	static class BB{
//		
//		//필
//		//생
//		public BB() {
//		
//		}
//		
//		//메
//		
//	}
	
	
}

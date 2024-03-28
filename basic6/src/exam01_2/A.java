package exam01_2;

public class A {
	
	//필
	// B field1=new B();
	// static B field2=new B();
	
	
	
	//생
	public A() {
		System.out.println("A constructor");
		
//		B b=new B();
//		System.out.println(b.f1);
//		System.out.println(b.f2);
//		b.m1();
//		b.m2();
	}
	//메
	void am1() {
		System.out.println("A-m1");
		
		B b=new B();
		System.out.println(b.f1);
		System.out.println(b.f2);
		b.m1();
		b.m2();
	}

	
	
	
	
	//정적멤버 클래스
	static class B{
	
		//필
		int f1=1;
		static int f2=2;
		
		//생
		public B() {
			System.out.println("B constructor");
		}
		
		//메
		void m1() {
			System.out.println("B-m1");
		}
		
		static void m2() {
			System.out.println("B-m2");
		}
		
		
	
		
	}
		
	}

	
	


package exam02_1;

public class A {

	// B b=new B();
	
	// 메소드
	void useB() {
		//메소드 안에 로컬클래스는 메소드 영역안에서 객체를 만들어서 로컬클래스안으로 접근 후 사용
		System.out.println("useB 실행1");
		class B {
			
			//필
			int field1=1;
			static int field2=2;
			
			//생
			public B() {
				System.out.println("B constructor");
			}
			
			//메
			void method1() {
				System.out.println("B-m1");
			}
			static void method2() {
				System.out.println("B-m2");
			}
			
			
		} //classB
		
		System.out.println("useB 실행2");
		
		B b=new B();
		System.out.println(b.field1);
		System.out.println(b.field2);
		b.method1();
		b.method2();
	} //useB 메소드 

//	void useB2() {
//
//		class B {
//
//		}
//	}

} //Aclass

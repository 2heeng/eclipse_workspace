package inheritance2;


class A{
	
}

class B extends A {
	
}

class D extends B{
	
}

class C extends A {
	
}
class E extends C{
	
}


public class PromotionEx {

	public static void main(String[] args) {
		B b=new B();
		// B b1=(B)new A();
		C c=new C();
		D d=new D();
		E e=new E();
		A a1=b;
		A a2=c;
		A a3=d;
		A a4=e;
		
		B b1=d;
		C c1=e;
		
//		B b2=e;
//		C c2=d; 이렇게는 안된다.
	}

}

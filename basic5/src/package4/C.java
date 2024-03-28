package package4;

import package3.A;
public class C {

	public C() {
		A a =new A();
		a.field1=1;
		// a.field2=2;
		// a.field3=3;
	}
	void method() {
		A a =new A();
		a.field1=1;
		// a.field2=2;
		// a.field3=3;
		
		a.method1();
		// a.method2();
		// a.method3();
	}
}

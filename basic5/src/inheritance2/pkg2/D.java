package inheritance2.pkg2;

import inheritance2.pkg1.A;

public class D extends A {

	public D() {
		super();
	} //부모생성자 호출
	
	void method1() {
		// System.out.println(this);
		// System.out.println(this.field); //null나옴
		this.field="hi2";
		System.out.println(this.field);
		this.method();
	}
	void method2() {
		
	}
	
}

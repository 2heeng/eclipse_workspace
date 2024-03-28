package exam02;

public class A {

	//필
	
	//생성자
	//생성자도 일종의 메소드, 메소드 영역을 local이라고 부르기 때문에 생성자 안에 클래스를 로컬클래스라고 부른다. 
	public A() {
	
		//B b=new B(); 클래스보다 먼저 객체생성 안된다. 
		
		class B{ 
			
		}
		B b=new B(); //클래스 다음에는 가능
		
	}
	
	//메
	void method() {
	
		// B b=new B(); 클래스보다 먼저 객체생성 안된다. 
		class B{
			
		}
		
		B b=new B(); //클래스 다음에는 가능
	}
}

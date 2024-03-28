package exam01;

public class ATest {

	public static void main(String[] args) {
		
		A a=new A();
		
		//System.out.println(a);
		
		//System.out.println(a.new B());

		
		A.B ab=a.new B();
		//System.out.println(ab);
		
		// new A.B(); 이건 안됨
		
		System.out.println("======================");
		
		new A.BB(); //static클래스라서 A에서 BB로 접근 가능. 
		
		System.out.println(new A.BB());
		
		A.BB abb = new A.BB();
		System.out.println(abb);
	}

}

package exam03;

public class ATest {

	public static void main(String[] args) {
		A a=new A();
		A.B ab=a.new B();
		
		ab.method();

	}

}

package basic3;

public class FunctionEx1 {

	public static void main(String[] args) {
		
		fun1();
		FunctionEx1 ex1 = new FunctionEx1();
		ex1.method1();
		FunctionEx1.smethod1();
		ex1.smethod1();
		
		System.out.println("=========================");
		
	}

	static void fun1() {
		System.out.println("hihihihi");
	}
	
	void method1() {
		System.out.println("m1");
	}
	static void smethod1() {
		System.out.println("s-m1");
	}
	
}

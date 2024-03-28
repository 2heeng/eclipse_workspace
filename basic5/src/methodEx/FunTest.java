package methodEx;

public class FunTest {

	public static void main(String[] args) {
		s1();
		s2("present");
		String gift2 = s3();
		System.out.println(gift2);
		String gift3=s4("gift is");
		System.out.println(gift3);

	}
	static void s1() {
	System.out.println("hihi");
	}
	static void s2(String gift) {
		System.out.println(gift);
	}
	static String s3() {
		return "chocolate";
	}
	static String s4(String gift) {
		System.out.println(gift);
		return "candy";
	}
	
	

}

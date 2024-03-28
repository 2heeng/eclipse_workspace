package exam05;

public class MemberTest {

	public static void main(String[] args) {
		
		Member m1 = new Member("111","hong",22);
		Member m2 = new Member("222");
//		System.out.println(m1.getId());
//		System.out.println(m1.getName());
//		System.out.println(m1.getAge());

		System.out.println(m1);
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
	}

}

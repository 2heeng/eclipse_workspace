package sec04;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();

		Member member1 = p1.getMember(

				(str) -> {
					return new Member(str);
				});

		System.out.println(member1);

		Member member2 = p1.getMember(

				Member::new);
		System.out.println(member2);
		
		Member member3 = p1.getMember2(

				Member::new);
		System.out.println(member3);
		

	}

}

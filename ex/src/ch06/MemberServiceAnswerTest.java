package ch06;

public class MemberServiceAnswerTest {

	public static void main(String[] args) {
		
		MemberServiceAnswer memberServiceAnswer=new MemberServiceAnswer();
		boolean result=memberServiceAnswer.login("hong","12345");
		if(result) {
			System.out.println("로그인 되었습니다");
			memberServiceAnswer.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
		
	}

}

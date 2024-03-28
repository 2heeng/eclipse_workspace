package ch06;

public class MemberServiceAnswer {
	//필드
	String id="hong";
	String password="12345";
	
	
	//생성자
	public MemberServiceAnswer() {
		
	}
	//메서드
	//id와 password를 넣어서 로그인함
	boolean login(String id,String password) {

		//id가 hong이고(and) password가 12345
		if(this.id.equals(id) && this.password.equals(password)) {
			return true;
		} else {
			return false;
		}
		
	}
	void logout(String id) {
		System.out.println(id +"님이 로그아웃 되었습니다");
	}
}

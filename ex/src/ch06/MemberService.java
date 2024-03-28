package ch06;

public class MemberService {
	//필드
	
	//생성자
	public MemberService() {
		
	}
	//메서드
	boolean login(String id, String password) {
		boolean result = id.equals("hong") && password.equals("12345");
		return result;
	}
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}

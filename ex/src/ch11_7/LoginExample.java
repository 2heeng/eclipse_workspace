package ch11_7;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void login(String id, String password) throws NoteExistIDException, WrongPasswordException {

		if (!id.equals("blue")) {
			throw new NoteExistIDException("아이디가 존재하지 않습니다.");
		}

		if (!id.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}

	}
}

package sec04.ex02;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class LoginImpl2 implements HttpSessionListener {

	String user_id;
	String user_pwd;
	static int total_user=0;
	
	public LoginImpl2() {
		
	}
	
	public LoginImpl2(String user_id, String user_pwd) {
		super();
		this.user_id = user_id;
		this.user_pwd = user_pwd;
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("사용자 접속");
		++total_user;
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("사용자 접속 해제");
		--total_user;
	}
	
}

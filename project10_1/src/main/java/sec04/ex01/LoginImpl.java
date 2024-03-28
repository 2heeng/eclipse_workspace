package sec04.ex01;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

//세션에 바인딩되거나 바인딩 해제될 때 개체에 알림이 표시되도록 합니다. 
public class LoginImpl implements HttpSessionBindingListener {

	String user_id;
	String user_pwd;
	static int total_user=0;
	
	public LoginImpl() {
	
	}
	
	
	public LoginImpl(String user_id) {
		super();
		this.user_id = user_id;
	}


	public LoginImpl(String user_id, String user_pwd) {
		super();
		this.user_id = user_id;
		this.user_pwd = user_pwd;
	}

	
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		//세션에 바인딩되고 있음을 개체에 알리고 세션을 식별합니다.
		//로그인해서 loginImpl이 동작할때마다 총 접속자수를 증가시킨다.
		System.out.println("사용자 접속");
		++total_user;
	}
	
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		//세션에서 바인딩이 해제되고 있음을 개체에 알리고 세션을 식별합니다.
		System.out.println("사용자 접속 해제");
		total_user--;
	}
	
	@Override
	public String toString() {
		return user_id;
	}
	
	
}

package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginservlet2")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet2() {
      //System.out.println("초기화됨");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("초기화됨");
	}

	
	public void destroy() {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("로그인 GET 요청 들어옴");
		doHandle(request,response);

		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("여기는 post로 요청시 들어옴");
		doHandle(request,response);
		
		
	}
	void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
//		response.setContentType("text/html;charset=utf-8");
		System.out.println("여기는 dohandle 들어옴");
		PrintWriter pw = response.getWriter();
		
		String id = request.getParameter("id");
		String password =  request.getParameter("password");
		System.out.println("아이디: "+id);
		System.out.println("비밀번호: "+password);
	}

}

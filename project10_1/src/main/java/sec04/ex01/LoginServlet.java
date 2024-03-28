package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//접속한 사용자들은 저장하는 범위는 애플리케이션 범위이므로 컨택스트에 저장해야 함
	
	ServletContext context =null;
	ArrayList userLists=new ArrayList();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		context = getServletContext();
		
		
		String user_id = request.getParameter("id");
		String user_pwd = request.getParameter("password");
		System.out.println(user_id+", "+user_pwd);
		LoginImpl loginImpl=new LoginImpl(user_id, user_pwd);
		
		HttpSession session = request.getSession();
		System.out.println(session.isNew());
		
		if(session.isNew()) {
			session.setAttribute("loginUser", loginImpl);
			userLists.add(loginImpl);
			context.setAttribute("userLists", userLists);
		}
		
		
		
		pw.write(loginImpl.user_id + " 접속함");
		pw.write("현재 접속자 수: "+LoginImpl.total_user+"명<br>");
		List lists = (ArrayList) context.getAttribute("userLists");
		for(Object loginUser : lists) {
			System.out.println(loginUser);
		}
		
		pw.write("<a href='logout?id="+user_id+"'>로그아웃</a>");
	}
}

package sec04.ex02;

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

import sec04.ex01.LoginImpl;

@WebServlet("/login2")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ServletContext context =null;
	List userLists=new ArrayList();
	
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
		System.out.println("1."+user_id+", "+user_pwd); //1
		LoginImpl2 loginImpl=new LoginImpl2(user_id, user_pwd);
		
		
		HttpSession session = request.getSession();
		System.out.println("2."+session.isNew());//2
		
		if(session.isNew()) {
			session.setAttribute("loginUser", loginImpl);
			userLists.add(user_id);
			context.setAttribute("userLists", userLists);
		}
		
		
		
		pw.write(loginImpl.user_id+ " 접속함");
		pw.write("현재 접속자 수: "+LoginImpl2.total_user+"명<br>");
		List lists = (ArrayList) context.getAttribute("userLists");
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
			//pw.println(lists.get(i) + "<br>");
		}
		
		pw.write("<a href='logout2?id="+user_id+"'>로그아웃</a>");
	}
	
}

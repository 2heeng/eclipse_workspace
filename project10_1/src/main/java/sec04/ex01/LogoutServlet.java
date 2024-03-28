package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext context = null;
	
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
		
		//로그아웃시 세션 소멸
		HttpSession session = request.getSession();
		session.invalidate();
		System.out.println("세션 소멸");
		
		ArrayList userList2=(ArrayList)context.getAttribute("userLists");
		
		//System.out.println(userList.remove(user_id));
		System.out.println(userList2.remove(new LoginImpl(user_id)));
		
		//context에서 다시 셋팅
		
		context.removeAttribute("userLists");
		
		context.setAttribute("userLists", userList2);
		for(Object user : userList2) {
			System.out.println(user);
		}
		pw.write(user_id+"님 로그아웃 되었습니다.");
		
		
	}

}

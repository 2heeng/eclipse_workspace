package sec04.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout2")
public class LogoutServlet2 extends HttpServlet {
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
		
		List userList2=(List)context.getAttribute("userLists");
		userList2.remove(user_id);
		
		//System.out.println(userList.remove(user_id));
		
		//context에서 삭제 후 다시 셋팅
		
		context.removeAttribute("userLists");
		context.setAttribute("userLists", userList2);
		
//		for(Object user : userList2) {
//			System.out.println(user);
//			pw.write(user+"");
//		}
//		
		for (int i = 0; i < userList2.size(); i++) {
			System.out.println(userList2.get(i));
			pw.println(userList2.get(i) + "<br>");
		}
		pw.write(user_id+"님 로그아웃 되었습니다.");
		
		
	}

}

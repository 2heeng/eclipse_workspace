package sec01.ex01;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/inputservlet")
public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("초기화됨");
	}

	public void destroy() {
		System.out.println("서버가 종료");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

//		String values[] = request.getParameterValues("menu");

//		for (String value : values) {
//			System.out.println(value);
//		}
//
//		String values2[] = request.getParameterValues("gender");
//
//		for (String value : values2) {
//			System.out.println(value);
//		}
		
		Enumeration<String> enus = request.getParameterNames();
		
		while(enus.hasMoreElements()) {
			String name =enus.nextElement();
			String values[]=request.getParameterValues(name);
			for(String value : values) {
				System.out.println(name + " : " + value);
			}
			
		}

		System.out.println("서버요청이 들어옴");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("post요청이 들어옴");
		doGet(request, response);
	}

}

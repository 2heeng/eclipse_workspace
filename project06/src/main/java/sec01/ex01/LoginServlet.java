package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//  @WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
      //System.out.println("초기화됨");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("초기화됨");
	}

	
	public void destroy() {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("로그인 GET 요청 들어옴");
		

		
		
		
//		pw.write("<!DOCTYPE html>\r\n"
//				+ "<html>\r\n"
//				+ "<head>\r\n"
//				+ "<meta charset=\"UTF-8\">\r\n"
//				+ "<title>Insert title here</title>\r\n"
//				+ "</head>\r\n"
//				+ "<body>\r\n"
//				+ "hi 반갑습니다. \r\n"
//				+ "</body>\r\n"
//				+ "</html>");
		//pw.close();
		
//		String id = request.getParameter("id");
//		System.out.println(id);
//		String password = request.getParameter("password");
//		System.out.println(password);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); //console에 한글 나타나게 하는거
		response.setContentType("text/html;charset=utf-8"); //웹화면에서 한글 안깨지게 하는거
		
		System.out.println("여기는 post로 요청시 들어옴");
		
		
		String id = request.getParameter("id");
		System.out.println(id);
		String password = request.getParameter("password");
		System.out.println(password);
		
		PrintWriter pw = response.getWriter();
		//pw.write("hi 반갑습니다 "+id+"님");
		pw.write("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "hi 반갑습니다. \r\n "+id+"님"
				+ "</body>\r\n"
				+ "</html>");
		
	}

}

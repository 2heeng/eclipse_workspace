package webTest4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/babo2")
public class ServletTest1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletTest1() {
    	System.out.println("초기화 됨");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		System.out.println("GET요청이 들어옴");
		
		//request.setCharacterEncoding("utf-8"); //이거 안먹힘
		
		PrintWriter pw = response.getWriter();
		//클라이언트에 문자 텍스트를 보낼 수 있는 PrintWriter 객체를 반환합니다.
		
		//pw.write("hi \nnice");
		pw.write("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "HTML 테스트입니다. \r\n"
				+ "</body>\r\n"
				+ "</html>");
		pw.close();
		
	}

	@Override
	public void destroy() {
		System.out.println("서버가 종료");
	}

}

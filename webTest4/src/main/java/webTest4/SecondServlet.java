package webTest4;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/abc")
public class SecondServlet extends HttpServlet {

	public SecondServlet() {
		System.out.println("초기화되었음");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("겟 요청이 들어옴");
	
		resp.getWriter().append("Served at: ").append(req.getContextPath());
		
		resp.setContentType("text/html;charset='utf-8'");
		PrintWriter pw = resp.getWriter();
		//LocalTime
		
//		pw.nullWriter("<html>\r\n"
//				+ "<head>\r\n"
//				+ "<meta charset=\"UTF-8\">\r\n"
//				+ "<title>Insert title here</title>\r\n"
//				+ "</head>\r\n"
//				+ "<body>\r\n"
//				+ "이건 테스트입니다. \r\n"
//				+ "</body>\r\n"
//				+ "</html>");
		
		
	
		pw.close();
		
	}
	
	@Override
	public void destroy() {
		System.out.println("서버종료");
	}
	
}

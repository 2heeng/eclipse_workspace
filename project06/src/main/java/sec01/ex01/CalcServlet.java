package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		// System.out.println("서블릿 초기화 됨");
	}

	
	public void destroy() {
		System.out.println("서버 종료");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		// System.out.println("겟요청이 들어옴");
		
		String sel =request.getParameter("sel");
		System.out.println("선택한 환율: "+sel);
		String money=request.getParameter("origin");
		
		PrintWriter pw = response.getWriter();
		
		try { if(money==null || money.equals("")) {
			pw.write("원화를 입력하여주세요.");
			pw.write("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "<meta charset=\"UTF-8\">\r\n"
					+ "<title>Insert title here</title>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "<a href='http://localhost:8090/project06/calc.html'>뒤로가기</a>"
					+ "</body>\r\n"
					+ "</html>");
		}
		
		int money2 = Integer.parseInt(money);
		
		if(sel.equals("dollar")) {
			int result = money2 / 1200;
			System.out.println(result+"dollar");
			pw.write("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "<meta charset=\"UTF-8\">\r\n"
					+ "<title>Insert title here</title>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ result + "dollar"
					+ "</body>\r\n"
					+ "</html>");
		} else if(sel.equals("yen")) {
			int result = (money2 / 800)*100;
			System.out.println(result+"엔");
			pw.write("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "<meta charset=\"UTF-8\">\r\n"
					+ "<title>Insert title here</title>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ result + "엔"
					+ "</body>\r\n"
					+ "</html>");
		}
		} catch (Exception e) {
			System.out.println("문자열 변환 예외 발생");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post요청이 들어옴");
	}

}

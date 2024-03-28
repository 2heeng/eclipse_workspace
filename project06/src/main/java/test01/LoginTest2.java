package test01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/logintest2")
public class LoginTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void init(ServletConfig config) throws ServletException {
		System.out.println("서블릿이 초기화됨");
	}

	
	public void destroy() {
		System.out.println("서블릿 종료");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET요청이 들어옴");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		System.out.println("아이디: "+id+" 비밀번호: "+pw);
		
		PrintWriter printwriter =response.getWriter();
		
		if(id==null || id.equals("") || pw==null || pw.equals("")) {
			printwriter.write("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+"ID와 Password를 모두 입력하였는지 확인해주세요."
				+"<br>\r\n"
				+"<a href='http://localhost:8090/project06/test01/login2.html'>로그인창으로 이동</a>"
				+ "</body>\r\n"
				+ "</html>");
		} else if (id.equals("admin") && pw.equals("1234")) {
			printwriter.write("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "<meta charset=\"UTF-8\">\r\n"
					+ "<title>Insert title here</title>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+"<h1>관리자로 로그인 하셨습니다!!!!</h1>" + "<br>"
					+ "<button>회원정보 바로가기</button>"
					+ "<button>회원정보 삭제하기</button>"
					+ "</body>\r\n"
					+ "</html>");
		} else {
		printwriter.write("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+id+"님!! 로그인 하셨습니다"
				+ "</body>\r\n"
				+ "</html>");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post요청이 들어옴");
	}

}

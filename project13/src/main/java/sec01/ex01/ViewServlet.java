package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/viewmembers")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
	}
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("현재 request 객체"+request);
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter pw = response.getWriter();
		
		List<MemberVO> list = (List<MemberVO>) request.getAttribute("list");
		
		
		pw.write("<!doctype html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"utf-8\">\r\n"
				+ "    <title></title>\r\n"
				+ "    <style>\r\n"
				+ "      table, tr, th, td {\r\n"
				+ "        border: solid 1px black;\r\n"
				+ "        border-collapse: collapse;\r\n"
				+ "        padding: 8px;\r\n"
				+ "      }\r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "   <table>\r\n"
				+ "    <tr><th>아이디</th><th>비밀번호</th><th>이름</th><th>이메일</th><th>가입일</th><th>삭제</th></tr>");
		
		for(int i=0;i<list.size();i++) {
			
			String id = list.get(i).getId();
			String pwd = list.get(i).getPwd();
			String name = list.get(i).getName();
			String email = list.get(i).getEmail();
			Date joinDate = list.get(i).getJoinDate();
			
		pw.write("<tr><td>"+id+"</td><td>"+pwd+"</td><td>"+name
				+"</td><td>"+email+"</td><td>"+joinDate+"</td><td><a href=\'http://localhost:8090/project08/member?command=delMember&id="+id+"'>삭제</a></td></tr>");
		}
		
		pw.write("   </table> <br>\r\n"
				+ "   <a href=\"http://localhost:8090/project07_1/MemberForm.html\">새 회원 등록하기</a>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		pw.close();
	}
	

}

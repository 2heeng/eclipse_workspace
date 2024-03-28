package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	MemberDAO memberDAO = new MemberDAO();
	//서블릿에서 DAO에 연결해서 데이터를 뿌려야 하므로, 서블릿안에 MemberDAO객체가 있어야 하는거임. 
	
	public void destroy() {
	System.out.println("서블릿 소멸");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get요청이 들어옴");
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post요청이 들어옴");
		doHandle(request, response);
	}
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("현재 request 객체"+request);
		System.out.println("doHandle 메소드");
		
		PrintWriter pw = response.getWriter();
		
		String command = request.getParameter("command");
		System.out.println(command);
		
		
		if(command != null && command.equals("addMember")) {
			String id2 = request.getParameter("id");
			String pwd2 = request.getParameter("pwd");
			String name2 = request.getParameter("name");
			String email2 = request.getParameter("email");
			
			System.out.println("가입정보"+id2+pwd2+name2+email2);
			
			MemberVO vo=new MemberVO();
			vo.setId(id2);
			vo.setPwd(pwd2);
			vo.setName(name2);
			vo.setEmail(email2);
			
			memberDAO.addMember(vo);
		} 
		else if(command !=null && command.equals("delMember")){
		 System.out.println("여기는 삭제 시 코드");
		 
		 String id = request.getParameter("id");
		 memberDAO.delMember(id);
		 
		 
		}
		
		
		List<MemberVO> list = memberDAO.listMembers();
		System.out.println(list);
		System.out.println("----------------------");
		
		request.setAttribute("list", list);
		
		RequestDispatcher dispatcher =request.getRequestDispatcher("viewmembers");
		dispatcher.forward(request, response);
		
//		pw.write("<!doctype html>\r\n"
//				+ "<html>\r\n"
//				+ "<head>\r\n"
//				+ "    <meta charset=\"utf-8\">\r\n"
//				+ "    <title></title>\r\n"
//				+ "    <style>\r\n"
//				+ "      table, tr, th, td {\r\n"
//				+ "        border: solid 1px black;\r\n"
//				+ "        border-collapse: collapse;\r\n"
//				+ "        padding: 8px;\r\n"
//				+ "      }\r\n"
//				+ "    </style>\r\n"
//				+ "</head>\r\n"
//				+ "<body>\r\n"
//				+ "   <table>\r\n"
//				+ "    <tr><th>아이디</th><th>비밀번호</th><th>이름</th><th>이메일</th><th>가입일</th><th>삭제</th></tr>");
//		
//		for(int i=0;i<list.size();i++) {
//			
//			String id = list.get(i).getId();
//			String pwd = list.get(i).getPwd();
//			String name = list.get(i).getName();
//			String email = list.get(i).getEmail();
//			Date joinDate = list.get(i).getJoinDate();
//			
//		pw.write("<tr><td>"+id+"</td><td>"+pwd+"</td><td>"+name
//				+"</td><td>"+email+"</td><td>"+joinDate+"</td><td><a href=\'http://localhost:8090/project07_1/member?command=delMember&id="+id+"'>삭제</a></td></tr>");
//		}
		
//		pw.write("   </table> <br>\r\n"
//				+ "   <a href=\"http://localhost:8090/project07_1/MemberForm.html\">새 회원 등록하기</a>\r\n"
//				+ "</body>\r\n"
//				+ "</html>");
		
		//pw.write("hi");
		
		pw.close();
	}

	
}

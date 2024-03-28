package com.spring.ex04;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.spring.ex04.MemberDAO;
import com.spring.ex04.MemberVO;


@WebServlet("/mem4.do")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	doHandle(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberDAO dao = new MemberDAO();
		MemberVO memberVO = new MemberVO();
		String action = request.getParameter("action");
		String nextPage = "";
		
//		String name = request.getParameter("name");
//		String email = request.getParameter("email");
//		
//		System.out.println("name: "+name+", email: "+email);
		if (action == null || action.equals("listMembers")) {
			List<Map<String, String>> membersList = dao.selectAllMemberList();
			request.setAttribute("membersList", membersList);
			nextPage = "test01/listMembers.jsp";
		} else if (action.equals("searchMember")) {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			
			memberVO.setName(name);
			memberVO.setEmail(email);
			
			List<Map<String, String>> membersList=dao.searchMember(memberVO);
//			String id = request.getParameter("value");
//			memberVO = dao.selectMemberById(id);
			request.setAttribute("membersList", membersList);
			nextPage = "test01/listMembers.jsp";
		}
		
		RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);  
		   dispatch.forward(request, response);
		
	}

}

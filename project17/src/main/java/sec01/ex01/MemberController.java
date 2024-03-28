package sec01.ex01;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/mem/*")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	MemberDAO memberDAO = new MemberDAO();
	

	@Override
	public void init() throws ServletException {
		System.out.println("MemberController 객체 생성");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Get 방식");
		doHandle(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Post 방식");
		doHandle(req, resp);
		
	}

	protected void doHandle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doHandle 방식");
		
		//URL패턴 path정보에 따른 분리
		String action = req.getPathInfo();
		System.out.println(action);
		String nextPage = null;
		if(action == null || action.equals("/listMembers.do") || action.equals("/")) {
			//회원 가져옴
			List<MemberVO> memberLists=memberDAO.listMembers();
					
			//화면에 회원 목록을 뿌려야 함, 뿌리는 페이지로 셋팅해서 보냄.
			//해당 request에 키,밸류로 설정해서 보내야함.(RequestDispatcher)
			
			req.setAttribute("memberLists", memberLists);
			nextPage="/test02/listMembers.jsp";
		} else if(action.equals("/addMember.do")) {
			String id = req.getParameter("id");
			String pwd = req.getParameter("pwd");
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			
			System.out.println("가입정보"+id+pwd+name+email);
			
			MemberVO vo=new MemberVO();
			vo.setId(id);
			vo.setPwd(pwd);
			vo.setName(name);
			vo.setEmail(email);
			
			memberDAO.addMember(vo);
			nextPage="/mem/listMembers.do";
		} else if(action.equals("/memberForm.do")) {
			nextPage="/test02/memberForm.jsp";
		} else if(action.equals("/delMember.do")) {
			String id = req.getParameter("id");
			System.out.println("삭제할 Id: "+id);
			memberDAO.delMember(id);
			nextPage="/mem/listMembers.do";
		} else if(action.equals("/modMemberForm.do")) {
			String id = req.getParameter("id");
			req.setAttribute("modId", id);
			 nextPage="/test02/modMemberForm.jsp";
		}else if(action.equals("/modMember.do")) {
			String id = req.getParameter("id");
			String pwd = req.getParameter("pwd");
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			
			System.out.println("가입정보"+id+pwd+name+email);
			
			MemberVO vo=new MemberVO();
			vo.setId(id);
			vo.setPwd(pwd);
			vo.setName(name);
			vo.setEmail(email);
			
			memberDAO.modMember(vo);
			nextPage="/mem/listMembers.do";
		}
		
		RequestDispatcher dispatcher =req.getRequestDispatcher(nextPage);
		dispatcher.forward(req, resp);
		
		
	}

	@Override
	public void destroy() {
		System.out.println("MemberController 소멸됨");
		
		
	}

}

package com.spring.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.spring.member.service.MemberService;
import com.spring.member.vo.MemberVO;

@Controller("memberController")
public class MemberControllerImpl extends MultiActionController implements MemberController {

	@Autowired
	private MemberService memberService;

	
//	  public void setMemberService(MemberService memberService) {
//	  this.memberService = memberService; }
	 

	//회원목록
	@Override
	@RequestMapping(value = "/member/listMembers.do")
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		
		//System.out.println("viewName: " + viewName);
		//System.out.println("memberService: "+memberService);
		
		List membersList = memberService.listMembers();

		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("membersList", membersList);

		return mav;
	}

	
	//겟뷰네임
	private String getViewName(HttpServletRequest request) throws Exception {
		String contextPath = request.getContextPath();
		// System.out.println("contextPath: "+contextPath);

		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
		// System.out.println("uri: "+uri);

		if (uri == null || uri.trim().equals("")) {
			uri = request.getRequestURI();
			// System.out.println("null인 경우 uri: "+uri);
		}
		int begin = 0;

		if (!((contextPath == null) || ("".equals(contextPath)))) {
			begin = contextPath.length();
			// System.out.println("begin: "+begin);

		}
		int end;

		// System.out.println(uri.indexOf(";"));

		if (uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
		} else if (uri.indexOf("?") != -1) {
			end = uri.indexOf("?");
		} else {
			end = uri.length();
		}

		// System.out.println("end: "+end);
		String fileName = uri.substring(begin, end);

		if (fileName.indexOf(".") != -1) {
			fileName = fileName.substring(0, fileName.lastIndexOf("."));

		}
		if (fileName.lastIndexOf("/") != -1) {
			fileName = fileName.substring(fileName.lastIndexOf("/"), fileName.length());
			//System.out.println("fileName: " + fileName);
		}
		return fileName;
	}

	
	//회원가입 폼으로 가기
	@RequestMapping(value = "/member/memberForm.do")
	public ModelAndView memberForm( HttpServletRequest request, HttpServletResponse response)throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("memberForm");
		return mav;
		
	}

	
	//회원추가하기
	@RequestMapping(value = "/member/addMember.do",method = RequestMethod.POST)
	public ModelAndView addMember(@ModelAttribute("member") MemberVO memberVO, HttpServletRequest request, HttpServletResponse response)throws Exception {
		
		memberService.addMember(memberVO);
		//List membersList = memberService.listMembers();
		//PRG패턴(post-redirect-get)
		ModelAndView mav = new ModelAndView("redirect:/member/listMembers.do");
		//mav.addObject("membersList", membersList);
		
		return mav;
		
	}
}

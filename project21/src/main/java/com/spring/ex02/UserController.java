package com.spring.ex02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class UserController extends MultiActionController {
	// MultiActionController
	// 동일한 클래스에서 여러 요청 유형을 처리할 수 있도록 하는 컨트롤러 구현입니다.

	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String userID="";
		String passwd = "";
		ModelAndView mav = new ModelAndView();
		userID=request.getParameter("userID");
		passwd=request.getParameter("passwd");
	
		mav.addObject("userID",userID);
		mav.addObject("passwd",passwd);
		
		String viewName=getViewName(request);
		System.out.println("viewName: "+viewName);
		//mav.setViewName("result");
		mav.setViewName(viewName);
		
		return mav;
	}

	
	
	public ModelAndView memberInfo(HttpServletRequest request, HttpServletResponse response) {

		return new ModelAndView("memberInfo");
	}

	
	//주소에서 'login'부분을 뽑는 기능
	private String getViewName(HttpServletRequest request) throws Exception{
		String contextPath = request.getContextPath();
		System.out.println("contextPath: "+contextPath);
		
		String uri = (String)request.getAttribute("javax.servlet.include.request_uri");
		System.out.println("uri: "+uri);
		
		if(uri==null || uri.trim().equals("")) {
			uri=request.getRequestURI();
			System.out.println("null인 경우 uri: "+uri);
		}
		int begin = 0;
		
		if(!((contextPath==null)||("".equals(contextPath)))) {
			begin = contextPath.length();
			System.out.println("begin: "+begin);
			
		}
		int end;
		
		System.out.println(uri.indexOf(";"));
		
		if(uri.indexOf(";")!=-1) {
			end=uri.indexOf(";");
		}else if(uri.indexOf("?")!=-1) {
			end = uri.indexOf("?");
		}else {
			end = uri.length();
		}
		
		System.out.println("end: "+end);
		String fileName = uri.substring(begin,end);
		
		if(fileName.indexOf(".")!=-1) {
			fileName = fileName.substring(0,fileName.lastIndexOf("."));
			
		}
		if(fileName.lastIndexOf("/")!=-1) {
			fileName = fileName.substring(fileName.lastIndexOf("/"),fileName.length());
			System.out.println("fileName: "+fileName);
		}
		return fileName;
	}
}

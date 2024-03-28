package com.spring.ex02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class UserController extends MultiActionController{

	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {

		String userId="";
		String passwd="";
		ModelAndView mav = new ModelAndView();
		userId=request.getParameter("userID");
		passwd=request.getParameter("passwd");
		
		mav.addObject(userId);
		mav.addObject(passwd);
		mav.setViewName("result");
		return mav;
	}
	
	
	public ModelAndView memberInfo(HttpServletRequest request, HttpServletResponse response) {

		return new ModelAndView("memberInfo");
	}
	
}

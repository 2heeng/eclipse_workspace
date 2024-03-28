package com.spring.ex02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller(value = "loginController")
public class LoginController {

	@RequestMapping("/test/login4.do")
	String login(Model model, HttpServletRequest request,HttpServletResponse response) throws  Exception{
		//System.out.println(model);
		model.addAttribute("menu","jjajang");
		//System.out.println(model);
		
		 return "menu";
	}
	
	@RequestMapping("/test/login5.do")
	ModelAndView login2(HttpServletRequest request,HttpServletResponse response) throws  Exception{
		ModelAndView mav = new ModelAndView();
		String menu = "jjambbong";
		mav.addObject("menu", menu);
		mav.setViewName("menu");
		
		return mav;
		
	}
}

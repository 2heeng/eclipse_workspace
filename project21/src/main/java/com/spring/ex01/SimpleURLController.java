package com.spring.ex01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//Controller : HttpServlet과 마찬가지로 HttpServletRequest 및 HttpServletResponse 인스턴스를 수신하지만 
//MVC 워크플로에 참여할 수 있는 구성 요소를 나타내는 기본 컨트롤러 인터페이스입니다.
public class SimpleURLController implements Controller {

	
	//ModelAndView
	//웹 MVC 프레임워크의 모델과 뷰 모두에 대한 홀더입니다. 이는 완전히 별개입니다. 이 클래스는 컨트롤러가 단일 반환 값으로 모델과 뷰를 모두 반환할 수 있도록 두 가지를 모두 보유할 뿐입니다.
	//DispatcherServlet에 의해 해결되도록 핸들러에 의해 반환된 모델 및 뷰를 나타냅니다. 뷰는 ViewResolver 객체에 의해 해결되어야 하는 문자열 뷰 이름의 형식을 취할 수 있습니다. 
	//대안으로 View 객체를 직접 지정할 수도 있습니다. 모델은 이름으로 입력된 여러 개체를 사용할 수 있는 맵입니다.
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav=new ModelAndView("index.jsp");
		return mav;
	}

}

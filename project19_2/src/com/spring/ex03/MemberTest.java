package com.spring.ex03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.spring.ex01.PersonService;

public class MemberTest {

	public static void main(String[] args) {
		//스프링 이전 방식
//		MemberServiceImpl memberService = new MemberServiceImpl();
//		memberService.listMembers();
		
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("member.xml"));
		MemberServiceImpl mem1 =(MemberServiceImpl)factory.getBean("mem1");
		
		//PersonService p2 =(PersonService)factory.getBean("p2");
		mem1.listMembers();
		//p2.sayHello();
	}

	

}

package com.spring.ex01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class SpringTest {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("person.xml"));
		PersonService p1 =(PersonService)factory.getBean("p1");
		
		PersonService p2 =(PersonService)factory.getBean("p2");
		//p1.sayHello();
		p2.sayHello();
	}

}

package com.spring.ex01;

public class OldTest {

	public static void main(String[] args) {
		//스프링없이 예전에 했던 방식
		PersonServiceImpl p1 =new PersonServiceImpl();
		
		p1.setName("홍길동");
		
		p1.sayHello();

	}

}

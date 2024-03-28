package com.spring.ex01;

public class PersonServiceImpl implements PersonService {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {
		System.out.println(this.name);
	}
	
	
}

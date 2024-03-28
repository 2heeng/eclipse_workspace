package com.spring.ex01;

public class PersonServiceImpl implements PersonService {

	private String fruit;
	
	private int kg;

	
	public PersonServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	

	public PersonServiceImpl(String fruit) {
		super();
		this.fruit = fruit;
	}



	public PersonServiceImpl(String fruit, int kg) {
		super();
		this.fruit = fruit;
		this.kg = kg;
	}



	public void setFruit(String fruit) {
		this.fruit = fruit;
	}



	@Override
	public void sayHello() {
		System.out.println(this.fruit);
		System.out.println(this.kg);
	}

	
}

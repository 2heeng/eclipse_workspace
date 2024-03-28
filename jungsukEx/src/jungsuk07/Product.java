package jungsuk07;
//7-19번 문제
public class Product {
 
	int price;

	public Product(int price) {
		this.price = price;
	}
	
}

class Tv extends Product{

	public Tv() {
		super(100);
	}

	public String toString() { return "Tv"; }
	
	
}

class Computer extends Product{

	public Computer() {
		super(200);
	}
	
	public String toString() { return "Cpomputer"; }
}

class Audio extends Product {

	Audio() { 
		super(50); 
	}
	public String toString() { return "Audio"; 
	}
	
}

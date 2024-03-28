package classBasic3;

public class Car {
	//필드
	String company="HD "; // 공통사항
	String color;
	int maxspeed;
	String model;
	
	public Car() {
		
	}
	Car(String model){
		this.model=model;
	}
	Car(String model, String color){
		this.model=model;
		this.color=color;
	}
	Car(String model, String color,int maxspeed){
		this.model=model;
		this.color=color;
		this.maxspeed=maxspeed;
	}
	
	//생성자
	
	
	//메소드
}


package classBasic3;

public class Car2 {
	//필드
	String company="HD "; // 공통사항
	String color;
	int maxspeed;
	String model;
	
	//생성자
	public Car2() {
		// this("Sonata");
		// this("Sonata","black",300);
	}
	Car2(String model){
		this(model,"Gray",330);
	}
	Car2(String model, String color){
		this.model=model;
		this.color=color;
	}
	Car2(String model, String color,int maxspeed){
		this.model=model;
		this.color=color;
		this.maxspeed=maxspeed;
	}
	
	
	//메소드(함수), 함수는 기능, 기능은 동작, 동사에 해당
	//메소드 정의1 void인 경우
	void roll() {
		System.out.println("부릉부릉");
	}
	//메소드 정의2 기본 타입(bsilfdcb)인 경우
	int roll2(){
	return 0;
	}
	double roll3() {
		return 0.0;
	}
	boolean roll4() {
		return false;
	}
	//메소드 정의3 참조형(배열,열거,클래스,인터페이스)
	int[] roll5() {
		return null;
	}
	String[] roll6() {
		return null;
	}
	Car roll7() {
		return null;
	}
}


package classBasic3;

public class Student3 {

	//필드
	String name;
	int ban;
	String hobby;
	
	//생성자
	Student3(){
		System.out.println("hi");
		System.out.println(this);
		System.out.println("======================");
	}
	Student3(String name){
		this.name=name;
		
	}
	Student3(int ban){
		this.ban=ban;
	}
	
	Student3(String name, int ban){
		this.name=name;
		this.ban=ban;
	}
	Student3(int ban, String name){
		this.ban=ban;
		this.name=name;
	}
	Student3(String name, String hobby){
		this.name=name;
		this.hobby=hobby;
	}
	//메소드
}

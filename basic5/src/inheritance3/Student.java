package inheritance3;

public class Student extends Person{

	int studentNo;
	
	public Student() {
	
	}
	
	Student(String name, int studentNo){
		super(name);
		this.studentNo = studentNo;
	}
	
	void study() {
		System.out.println("공부합니다.");
	}
}

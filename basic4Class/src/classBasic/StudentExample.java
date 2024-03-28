package classBasic;

public class StudentExample {

	public static void main(String[] args) {
		//실행하는 클래스에는 뒤에 example을 붙인다
		
		//학생 홍일동(stu1), 홍이동(stu2), 홍삼동(stu3)
		
		// new Student();
		// System.out.println(new Student());

		Student stu1=new Student();
		//Student(클래스)가 타입으로 들어간거임.
		// stu1은 객체(인스턴스)인거임. 혹은 참조변수
		
		//다른방법
//		Student stu1;
//		stu1=new Student();
		
		//System.out.println(stu1);
		
		stu1.name = "홍일동";
		System.out.println(stu1.name);
		//name 이라는 필드에 stu1이라는 객체의 데이터(name)을 저장함
		
		
		Student stu2=new Student();
//		System.out.println(stu2);
		stu2.name = "홍이동";
		System.out.println(stu2.name);
		//세모는 필드 동그라미는 메소드
	
		//Student stu3=new Student();
		
		
	}

}

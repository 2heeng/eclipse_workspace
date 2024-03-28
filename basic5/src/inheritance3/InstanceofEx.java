package inheritance3;

public class InstanceofEx {

	static void personInfo(Person person) {
		System.out.println("이름 : " +person.name);
		person.walk();
		
		if(person instanceof Student stu) {
			// Student stu=(Student)person;
			System.out.println("학번 : "+stu.studentNo);
			stu.study();
		}
		
	}
	public static void main(String[] args) {
		Person p1= new Person("홍길동");
	
		//System.out.println(p1 instanceof Person);
		
		// System.out.println("이름 : "+p1.name);
		personInfo(p1);
		
		System.out.println("=========================");
		
		Student stu1=new Student("홍학생",111);
		personInfo(stu1);//Person p2=stu1; 자동형변환 생략
		// personInfo(new Student("홍학생",111));//이거도 가능
		
		
		
		
		
	}

}

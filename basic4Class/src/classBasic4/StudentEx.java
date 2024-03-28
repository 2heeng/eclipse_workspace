package classBasic4;

public class StudentEx {

	public static void main(String[] args) {
		 Student stu1=new Student();
		 
		 System.out.println(stu1.name);
		 
		 System.out.println(Student.schoolName);
		 
		 stu1.study();
		 Student.staticMethod();
	}

}

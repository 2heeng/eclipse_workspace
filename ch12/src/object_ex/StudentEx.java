package object_ex;

public class StudentEx {

	public static void main(String[] args) {
		
		Student stu1 = new Student(1,"hondgildong");
		System.out.println(stu1.hashCode());
		// 1865127310
		
		System.out.println(stu1.getName().hashCode());
		System.out.println(stu1.getNo());
		
		
		System.out.println("============================");
		
		System.out.println(stu1.hashCode());
	}

}

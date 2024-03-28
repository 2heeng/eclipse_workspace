package classBasic3;

public class StudentEx3 {
	
	public static void main(String[] args) {
	
		System.out.println(new Student3());
		Student3 stu4=new Student3("홍사동");
		
		System.out.println(stu4.name);
		
		Student3 stu5=new Student3(5);
		System.out.println(stu5.ban);
	 
		
		Student3 stu6=new Student3(6, "송삼동");
		System.out.println(stu6.ban+stu6.name);
		
		System.out.println("============================");
		Student3 stu66=new Student3("송삼동",66);
		System.out.println(stu6.ban+stu6.name);
		
		Student3 stu7=new Student3("고길동","baking");
		System.out.println(stu7.name + stu7.hobby);
}
}

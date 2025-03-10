package sec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RuductionTest {

	public static void main(String[] args) {
		
		List<Student> stuList=new ArrayList<>();
		stuList.add(new Student("홍일동",90));
		stuList.add(new Student("홍이동",80));
		stuList.add(new Student("홍삼동",70));
		
		List<Student> stuLists=Arrays.asList(new Student("홍길동",90),new Student("홍이동",80),new Student("홍삼동",70));
		
		System.out.println(stuLists.stream().mapToInt(Student::getScore).sum());
		System.out.println(stuLists.stream().mapToInt(Student::getScore).average().getAsDouble());

		System.out.println(stuLists.stream().mapToInt(Student::getScore).reduce(0, (a,b)->{return a+b;}));
		
	}

}

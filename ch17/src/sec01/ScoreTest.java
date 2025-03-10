package sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class ScoreTest {

	public static void main(String[] args) {
		
		List<Student> stuList = new ArrayList<Student>();
		
		stuList.add(new Student("홍일동",100));
		stuList.add(new Student("홍이동",20));
		stuList.add(new Student("홍삼동",3));
		
		//총합
		int total = 0;
		for(int i=0; i<stuList.size();i++) {
			Student stu1=stuList.get(i);
			total+=stu1.getScore();
		}
		System.out.println("총합은 " +total+"점");
		
		
		//평균구하기
		System.out.printf("평균은 %.2f 점" , (double)total/stuList.size());
		
		System.out.println("");
		System.out.println("=============스트림방식으로 해보자==================");
		
		//스트림방식으로 해보자
		
		Stream<Student> stuStream = stuList.stream();
		
		//stuStream.forEach((obj)->{System.out.println(obj.getName()+obj.getScore());});
  
		//즉 생성된 Stream은 이미 사용되었기 때문에 이미 작성되었거나 스트림이 닫혔다는 에러가 발생.
		//Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		double avg=stuStream.mapToInt((obj)->{return obj.getScore();}).average().getAsDouble();
		System.out.printf("평균은 %.2f 점" , avg);
	}

}

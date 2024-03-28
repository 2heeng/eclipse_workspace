package object_ex;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		//자료를 저장하기 위해서 여러분이 자료 구조를 선정해야 함
		//대부분 배열(사이즈 정해짐)과 리스트(사이즈가 정해지지 않음) 사용
		//중복되지 않게 저장하고자 할 경우에는 HashSet 사용
		
		
		HashSet hashset = new HashSet();
		
		//hashset자료구조에 저장할 자료를 먼저 만듬
		
		Student stu1 = new Student(1,"홍길동");
		Student stu2 = new Student(1,"홍길동");
		
		//hashset을 이용할 경우 동등객체는 중복 저장하지 않음
		hashset.add(stu1);
		hashset.add(stu2);
		System.out.println(hashset.size());
	}
	
	

	
}

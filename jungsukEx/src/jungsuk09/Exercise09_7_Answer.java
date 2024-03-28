package jungsuk09;

public class Exercise09_7_Answer {
//교재말고 선생님 답임. 인덱스오브 사용하라고 나와있음
	static boolean contains(String src,String target) {
		boolean result=src.contains(target);
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(contains("12345","23")); 
		System.out.println(contains("12345","67"));

	}

}

package basic3;

public class IndexOfContainsEx {

	public static void main(String[] args) {
		
		String subject="자바 프로그래밍 자리";
		
		//문자를 찾을 수도 있고, 문자열을 찾을 수도 있다
		//찾았을 경우 그 위치index가 나오게
		
		int location=subject.indexOf("자",1);//2번째부터 찾아라
		System.out.println(subject.indexOf("자",1));
		System.out.println(location); 
		
		System.out.println("===================================");
		
		int location2=subject.indexOf("프로그래밍");
		System.out.println(location2);
		
		System.out.println("===================================");
		
		int location3=subject.indexOf("바보");
		int location4=subject.indexOf("파이썬");
		System.out.println(location3); //없는 문자나 문자열을 찾으면 -1이 반환된다.
		System.out.println(location4); 
		
		String str = "자라\\파이썬\\프로그래밍\\자라\\마지막";
		int num =str.lastIndexOf("\\");
		System.out.println(num);
		String file = str.substring(num+1);
		System.out.println(file);

	}

}

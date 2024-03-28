package basic3;

public class IndexOfContainsEx1_1 {

	public static void main(String[] args) {
		
		//String 변수를 선언합니다
		String str="안녕하세요 반갑습니다";
		
		//문자나 문자열을 찾아서 인덱스(위치)를 뽑아봅시다
		int location1=str.indexOf("반갑"); //함수는 정수로 반환하는 함수여서 int 타입으로 넣어줌
		System.out.println(location1);
		
		//없는 문자열을 찾는다면? -->-1라고 나온다
		int location2=str.indexOf("멍멍");
		System.out.println(location2);
 
		//일부는 있지만 완전히 같지 않은 문자열을 찾는다면? --> 없는거와 같다
		int location3=str.indexOf("반갑소");
		System.out.println(location3);
		
		//해당 문자나 문자열이 없다면 없다라고 코딩
		String find="안녕반가워";
		int location4=str.indexOf(find);
		if(location4==-1) {
			System.out.println(find+"를 찾을 수 없습니다");
		} 
		
	}

}

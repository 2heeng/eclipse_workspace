package basic3;

public class StringEx1 {

	public static void main(String[] args) {
		
		//문자열 추출
		String ssn="9205062230123";
		
		System.out.println(ssn.length());
		
	
		int ssnLength=ssn.length();
		char result=ssn.charAt(6);
		
		System.out.println(ssn.charAt(6));
		System.out.println(result);
		if(result=='1' || result=='3') {
			System.out.println("남성입니다");
		} else {
			System.out.println("여성입니다");
		}
		
		
	}

}

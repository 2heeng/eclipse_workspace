package exam05;

import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) {
		//regular expression 사이트 참고
		
		//전화번호부
		//지역번호 02이거나 핸드폰번호010-3자리이거나 4자리-4자리
		String regEx = "(02|010)-\\d{3,4}-\\d{4}";
		
		System.out.println(Pattern.matches(regEx, "010-1992-0506"));
		
		//이메일 패턴
		String regEx2="\\w+@\\w+\\.\\w+(\\.\\w+)?";
		
		System.out.println(Pattern.matches(regEx2, "bbh@gmail.com"));
		System.out.println(Pattern.matches(regEx2, "bbh@baek.com"));
		//숫자
		
		//영어 대문자
		
		//영어 소문자
		
		//한글
		
		//결합
	}

}

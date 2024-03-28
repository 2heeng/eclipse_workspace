package jungsuk;

public class ch02 {

	public static void main(String[] args) {
		
		// 2-1.
		// 2-2. 주민등록번호 13자리는 int범위를 벗어난다.
		// long regNo=970104123456L;
		
		/* 2-3.
		 * 리터럴: 100, 3.14f
		 * 변수: i l 
		 * 키워드(=예약어): int long float final(바꾸지 못하게 마지막이라는 뜻)
		 * 상수(변하지 않는 수, 대문자로 쓴다): PI 
		 */
		
		//2-4. Byte
		//2-6. bcde 클래스와 예약어 개념은 다르다. 
		//2-7. a d e g
		//2-8. 참조형 변수의 크기는 4byte이다 int 와 float 
		//2-9. 
		
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		b = (byte)i;
		ch = (char)b;
		short s = (short)ch;
		float f = (float)l; //long보다 float가 더 커서 변환 생략 가능
		i = (int)ch; 
		
		//2-10. 0~65535
		//2-11. abcd
		double d = 1.4e3f;
		
		//2.12. 함수명 앞에는 무조건 return타입(데이터타입)이 와야함
		// 데이터 타입 기본형 bsil fd cb, 참조형 String
		// 비어있다는 타입은 void
		// 답은 abce
		
		//2-13.
		// 기본값은 0을 의미
		// boolean - false
		// char - 유니코드로 하면 맞음
		//float - 0.0f
		// int - 0
		// long - 0L
		//String 참조형의 기본값은 null이다
		
	
	}

}

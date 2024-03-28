package exam01;

public class ExceptionHandlingEx {

	public static void main(String[] args) {
		
		String str1=null;
		
		//System.out.println(str1.length());
		
		//예외처리
		//예외가 날 경우도 있고 안 날 경우도 있기 때문에 미리 대비해야 함
		//예외가 나는지 한 번 시도해본다
		//예외는 날 수도 있고 안 날 수도 있기 때문에, 예외가 나는지 한번 시도해본다는 의미로 try를 씀
		//그리고 예외가 난다면 잡아라 라는 뜻으로 catch를 쓴다. 
		//예외가 날 클래스 타입의 객체를 괄호안에 넣어줌

		try {
			// str1 = "hi";
			System.out.println(str1.length());
		} catch(Exception e) {
			System.out.println("예외 발생");
			System.out.println("null이 안되도록 하세요");
		} finally {
			System.out.println("무조건 해라");
		}
		
	}

}

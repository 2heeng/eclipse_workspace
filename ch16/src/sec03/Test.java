package sec03;

public class Test {

	public static void main(String[] args) {
		
		//"".
		
		Person p1 = new Person();
		
		//매개변수의(a의타입이 문자열이므로) 문자열 메소드 참조할 수 있다.
		p1.ordering(
			String::compareToIgnoreCase
				);
		
	}
	
}

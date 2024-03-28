package basic3;

public class ReferenceEx {

	public static void main(String[] args) {
		
		//참조형: 배열(array), 열거(enum),클래스(class),인터페이스(interface)
		
		// String(); // 이거 자체는 문자열 생성
		
		new String();
		String hello=new String("hi");
		
		System.out.println(hello);
		System.out.println(System.identityHashCode(hello));
		System.out.println(System.identityHashCode(hello));
		
		String hello2=new String("hi");
		System.out.println(hello2);
		System.out.println(System.identityHashCode(hello2));
		
		System.out.println(hello==hello2);
		System.out.println(hello.equals(hello2));
}
}

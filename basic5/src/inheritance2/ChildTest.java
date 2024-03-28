package inheritance2;

public class ChildTest {

	public static void main(String[] args) {
		
		Child child=new Child();
		System.out.println(child);
		
		Parent parent=null;
		System.out.println(parent);
		
		parent = child; //parent 변수에 차일드 객체 넣음
		System.out.println(parent);
		
		parent.method1();
		parent.method2(); //차일드에서 오버라이딩한 메소드가 나옴
		//부모 타입으로 자동타입변환된 이후에는 부모 클래스에 선언된 필드와 메서드만 접근 가능
		//비록 변수는 자식 객체를 참조하지만 변수로 접근 가능한 멤버는 부모 클래스 멤버로 한정됨
		//그러나 자식 클래스에서 오버라이딩된 메소드가 있다면 부모 메소드 대신 오버라이딩된 메소드가 호출된다.
		
		
	}

}

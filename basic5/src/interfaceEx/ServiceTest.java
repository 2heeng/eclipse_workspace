package interfaceEx;

public class ServiceTest {

	public static void main(String[] args) {
		
		//클래스 구현시 그 클래스가 구현한 인터페이스가 있을 경우 인터페이스 타입으로 변수 선언후 사용.
		Service service=new ServiceImpl();
		service.defaultMethod1();
		
		System.out.println("============================");
		
		Service.staticMethod1();
		
	}

}

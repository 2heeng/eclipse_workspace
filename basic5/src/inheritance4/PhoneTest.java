package inheritance4;

public class PhoneTest {

	public static void main(String[] args) {
		
		// Phone myPhone=new Phone(); 
		//추상클래스는 직접 객체를 생성할 수 없다.
		//자식 객체를 통해서 생성이 가능함. 

//		myPhone.turnOff();
//		myPhone.turnOn();
		
		SmartPhone smt= new SmartPhone("홍길동");
		System.out.println(smt.owner);
		smt.turnOff();
		smt.turnOn();
		smt.internetSearch();
		smt.bell();
		
		
		
		
	}

}

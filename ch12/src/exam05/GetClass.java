package exam05;

public class GetClass {

	public static void main(String[] args) {
		
		//class 객제 정보 얻는 방법
		
		//1.클래스명.class
		
		System.out.println(Car.class);

		//2.Class.forName("패키지명.클래스명");
		
		try {
			Class cls = Class.forName("exam05.Car");
			System.out.println(cls);
			System.out.println("###");
		} catch(ClassNotFoundException e ){
			System.out.println("해당 클래스 없음");
		}
		
		
		//3.객체참조변수.getClass();
		Car myCar = new Car();
		Class cls = myCar.getClass();
		System.out.println(cls);
		
	}

}

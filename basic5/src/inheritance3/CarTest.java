package inheritance3;

public class CarTest {

	public static void main(String[] args) {
		
		Car car1=new Car();
		
		//null인지 여부를 항상 체크하시기 바랍니다.
		if(car1.tire !=null) {
			car1.run();
		} System.out.println(car1.tire);
		
		car1.tire=new Tire();
		System.out.println(car1.tire);
		car1.run();
		
		car1.tire=new HankookTire();
		System.out.println(car1.tire);
		car1.run();
		
		car1.tire=new KumhoTire();
		System.out.println(car1.tire);
		car1.run();
		
		
		
		
		
		
	}

}

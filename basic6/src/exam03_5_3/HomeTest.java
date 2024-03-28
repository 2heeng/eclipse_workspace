package exam03_5_3;

public class HomeTest {

	public static void main(String[] args) {
		Home myHome = new Home();
		
		myHome.use1();
		myHome.use2();
		myHome.use3(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("난방 on");
				
			}

			@Override
			public void turnOff() {
				System.out.println("난방 off");
				
			}
			
		});

	}

}

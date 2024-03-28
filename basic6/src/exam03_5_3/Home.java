package exam03_5_3;

public class Home {

	RemoteControl remoteControl = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("tv on");
			
		}
		
		@Override
		public void turnOff() {
			System.out.println("tv off");
			
		}
	};
	
	void use1() {
		remoteControl.turnOn();
		remoteControl.turnOff();
	}
	
	void use2() {
		RemoteControl remoteControl2 = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("에어컨 on");
				
			}

			@Override
			public void turnOff() {
				System.out.println("에어컨 off");
				
			}
			
		};
		remoteControl2.turnOn();
		remoteControl2.turnOff();
	}
	
	void use3(RemoteControl remoteControl) {
		remoteControl.turnOn();
		remoteControl.turnOff();
	}
	
}

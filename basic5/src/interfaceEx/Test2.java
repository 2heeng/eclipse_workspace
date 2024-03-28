package interfaceEx;

public class Test2 {

	public static void main(String[] args) {
		
		RemoteControl2 remoteControl=new Television2();
		remoteControl.turnOn();
		remoteControl.setVolume(520);
		remoteControl.setVolume(-7);
		remoteControl.turnOff();
		
		
		Audio2 ad=new Audio2();
		ad.setVolume(80);

	}

}

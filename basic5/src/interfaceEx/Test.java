package interfaceEx;

public class Test {

	public static void main(String[] args) {
		
		// System.out.println(RemoteControl.MAX_VOLUME);
		
		RemoteControl remoteControl=null;
		// System.out.println(remoteControl);
		
		remoteControl=new Televison();
		remoteControl.turnOn();
		
		remoteControl.setVolume(55);
		remoteControl.setVolume(-2);
		remoteControl.setVolume(4);
		
		System.out.println("=======================================");
		remoteControl=new Audio();//오디오로 바꿈
		remoteControl.turnOn();
		remoteControl.setVolume(60);
		remoteControl.setVolume(-1);
		remoteControl.setVolume(12);
		
		System.out.println("=======================================");

		remoteControl=new Televison();
		remoteControl.setVolume(4);
		System.out.println("=======================================");
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		
		RemoteControl.changeBattery();
		
		
		
	}

}

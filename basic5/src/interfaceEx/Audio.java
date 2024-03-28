package interfaceEx;

public class Audio implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		
		System.out.println("audio 켬");
	}

	@Override
	public void turnOff() {
	
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		} else {
			this.volume=volume;
		}
		System.out.println("현재 오디오 볼륨 : "+ this.volume);
		
	}

	

}

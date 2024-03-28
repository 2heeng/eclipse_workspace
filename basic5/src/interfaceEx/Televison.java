package interfaceEx;

public class Televison implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {

		System.out.println("tv 켬");
	}

	@Override
	public void turnOff() {

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 tv볼륨 : " + this.volume);
	}

	private int memoryVolume;
	@Override
	public void setMute(boolean mute) {
		
		if(mute) {
			this.memoryVolume=this.volume;
			System.out.println("무음 처리");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("무음 해제");
			setVolume(this.memoryVolume);
		}
		
	}

}

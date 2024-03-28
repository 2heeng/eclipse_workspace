package jungsuk07_10And11;

public class MyTv2 {

	private boolean isPowerOn;
	private int channel;
	private int volume;
	int preChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		preChannel = this.channel;
		System.out.println("이전채널"+preChannel);
		this.channel = channel;
		System.out.println("현재채널"+this.channel);
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	void gotoPrevChannel(){
		setChannel(preChannel);
		
	}

	
}

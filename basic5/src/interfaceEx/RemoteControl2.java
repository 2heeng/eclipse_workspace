package interfaceEx;

public interface RemoteControl2 {

	//상속 필드
	static final int MAX_VOLUME=50;
	static final int MIN_VOLUME=0;
	
	//추상 메소드
	abstract void turnOn();
	abstract void turnOff();
	abstract void setVolume(int volume);
	
	//디폴트 메소드
	
	
	
	//정적 메소드
	
	
}

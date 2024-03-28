package interfaceEx;

public interface RemoteControl {
	//인터페이스는 상위 설계도(클래스 간의 인터페이스 역할)이자 규격서(가이드) 역할이기도 하다.
	//상수 필드
	static final int MAX_VOLUME=50;
	static final int MIN_VOLUME=0;
	
	//추상 메소드
	abstract void turnOn();
	abstract void turnOff();
	abstract void setVolume(int volume);
	
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제");
		}
		
	}
	//정적 메소드
	static void changeBattery() {
		System.out.println("건전기 교체");
	}
	
	
	
}

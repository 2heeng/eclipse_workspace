package sec14;

public class Car {

	private int speed;
	private boolean stop;
	
	//필드가 private일 경우 Getter(접근)와 Setter(설정) 할 수 있게함
	
	public int getSpeed() {
		
		return this.speed; //this 생략
	}
	
	public void setSpeed(int speed) {
		//속력은 음수가 나올 수 없으므로
		if(speed<0) {
			this.speed=0;
		} else {
		this.speed=speed;
		}
	}
	
	//Getter
	public boolean isStop() {
		return this.stop;
	}
	public void setStop(boolean stop) {
		
		this.stop=stop;
		
		if(stop == true) {
			this.speed=0;
		}
	}
}


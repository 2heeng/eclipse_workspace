package sec14_2;

public class Car {

	private int speed;
	private boolean stop; //기본값 false
	
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed=0;
		} else {
		this.speed=speed;
		}
		
	}
	
	
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


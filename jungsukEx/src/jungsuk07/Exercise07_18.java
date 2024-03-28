package jungsuk07;
//7-18번 문제
public class Exercise07_18 {

	static void action(Robot r){
		if(r instanceof DanceRobot) {
			DanceRobot.dance();
		} else if(r instanceof SingRobot) {
			SingRobot.sing();
		} else if(r instanceof DrawRobot) {
			DrawRobot.draw();
		}
	}
	
	public static void main(String[] args) {
		
			Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
			for(int i=0; i< arr.length;i++){ action(arr[i]);
			}
		}

	}



package jungsuk06;

public class Excercise6_24 {

	static int abs(int value) {
		if(value < 0) {
			int result = value*-1;
			return result;
		} else {
			return value;
		}
	}
	
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value+"의 절대값: "+abs(value)); 
		value = -10;
		System.out.println(value+"의 절대값: "+abs(value)); 
		
	}

}

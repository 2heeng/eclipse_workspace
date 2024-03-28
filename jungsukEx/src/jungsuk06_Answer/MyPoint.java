package jungsuk06_Answer;

public class MyPoint {

	
	int x;
	int y;
	
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x, int y, int x1, int y1) {
		
		double result = Math.sqrt( ((double)x1-this.x) + ((double)y1-this.y));
	
		return result;
		
	}
	
	
	
	
}

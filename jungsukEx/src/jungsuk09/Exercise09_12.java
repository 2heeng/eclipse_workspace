package jungsuk09;

public class Exercise09_12 {

	static int getRand(int from, int to) {
	return (int)(Math.random()*(Math.abs(to-from)+1))+Math.min(from, to) ;
	
	//Math.abs()는 절대값구하기
	//Math.min()은 둘중에 작은수
	}
	
	
	public static void main(String[] args) {
		for(int   i=0;   i<   20;   i++) {
			System.out.print(getRand(1,-3)+",");
		}
	}

}

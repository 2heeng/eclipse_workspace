package ch16;

public class Ex_07 {

	private static int[] scores = {10, 50, 3};
	
	public static int maxOrMin(Operator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.apply(result, score);
		} return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
//		int max = maxOrMin(
//				
//				);
		
	}
	
	
}

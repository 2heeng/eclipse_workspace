package ch12_Answer;

public class Ex08 {

	public static void main(String[] args) {
		long start = System.nanoTime();
		
		int[] scores = new int[1000];
		for(int i=0;i<scores.length;i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		 for(int score : scores) {
		 sum += score;
		 }


	}

}

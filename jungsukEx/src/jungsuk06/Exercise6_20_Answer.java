package jungsuk06;

public class Exercise6_20_Answer {

	
	 static int[] shuffle(int[] arr) {

		 for(int i=0; i<arr.length;i++) {
			 int tmp = 0;
			 int random = (int)(Math.random()*arr.length);
			 tmp = arr[i];
			 arr[i]=arr[random];
			 arr[random]=tmp;
		 } return arr;
	 }
		
	
	
	public static void main(String[] args) {
		
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		 int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		
	}
	
	
}

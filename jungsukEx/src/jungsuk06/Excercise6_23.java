package jungsuk06;

public class Excercise6_23 {

	static int max(int[] arr) {
		int maxValue = Integer.MIN_VALUE;
		if (arr==null || arr.length ==0) {
			return -999999;
		}
		else {
			for(int i =0;i<arr.length;i++) {
			
			if(arr[i] > maxValue) {
				maxValue = arr[i];
			} 
		} return maxValue;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값: "+max(data));
		System.out.println("최대값: "+max(null));
		System.out.println("최대값: "+max(new int[] {}));

	}

}

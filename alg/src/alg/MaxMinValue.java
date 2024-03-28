package alg;

public class MaxMinValue {

	public static void main(String[] args) {
		
		//범위가 한정되어야 찾을 수 있다.
		//공간이 한정된 배열
		//for돌리면서 각가을 비교해서 해당되는 값을 최대값 변수에 넣어놈

		//최대값 초기화, 0으로 하거나 
		
		int max=Integer.MIN_VALUE; //안전빵으로 최소값넣기

		int array[]= {1, 5, 3, 8, 2};
		
//		for(int i=0;i<array.length;i++) {
//			
//			if(array[i] > max) {
//				max=array[i];
//			}
//		} System.out.println(max);
		
		//최소값을 구해보자
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i] < min) {
				min=array[i];
			}
		} System.out.println(min);

	}

}

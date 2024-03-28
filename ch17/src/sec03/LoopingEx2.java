package sec03;

import java.util.Arrays;

public class LoopingEx2 {

	public static void main(String[] args) {
		
		
		int intArr[] = {6,8,10,12};
		
		//모든 요소가 만족하는지
		System.out.println(Arrays.stream(intArr).allMatch((x)->{return x%2==0;}));
		
		
		//최소한 하나의 요소가 만족하는지
		System.out.println(Arrays.stream(intArr).anyMatch((x)->{return x%3==0;}));
		
		
		//모든요소가 만족하지 않는지
		System.out.println(Arrays.stream(intArr).noneMatch((x)->{return x%3==0;}));

	}

}

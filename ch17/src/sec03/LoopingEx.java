package sec03;

import java.util.Arrays;

public class LoopingEx {

	public static void main(String[] args) {
		
		int intArr[] = {1,2,3,4,5};
		
		//Arrays.stream(intArr).filter((x)->{return x%2==0;}).forEach((x)->{System.out.println(x);});
		//forEach는 sum이 없음
		
		
		int total = Arrays.stream(intArr).filter((x)->{return x%2==0;}).peek((x)->{System.out.println(x);}).sum();
		System.out.println("======================================");
		System.out.println(total);
		
	}

}

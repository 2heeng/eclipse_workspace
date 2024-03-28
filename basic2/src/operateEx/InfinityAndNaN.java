package operateEx;

public class InfinityAndNaN {

	public static void main(String[] args) {
		
		int x =5;
		double y= 0.0;
		
		double z= x/y;
		System.out.println(z);
		
		//z가 무한대인지를 확인하는 코드가 필요
		// is가 접두사인 경우 결과값은 논리형
		
		System.out.println(Double.isInfinite(z));
		
		if(Double.isInfinite(z)) {
			System.out.println("값 산출 불가");
		}
		else {System.out.println(z+2);}

	}
}


package operateEx;

public class CompareOperatorEx {

	public static void main(String[] args) {
		
		
		//비교 연산자
		
		// > <  >=  <= == !=(같지않다)
		
//		System.out.println(2>1);
//		System.out.println(2<1);
//		System.out.println(2>=2);
//		System.out.println(2<=2);
//		System.out.println(2==2);
//		System.out.println(2!=2);
//
//		System.out.println("---------------------");
//		
//		System.out.println('B'>'A');
		
//		System.out.println(1.0f == 1.0);
//		System.out.println(0.1f == 0.1);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		
		System.out.println(num5 == num6);
		System.out.println(num5 == (float)num6);
		System.out.println((double)num5 == num6);
		
		System.out.println("---------------------");
		
		//문자열이 같다.
		System.out.println("hi = " + "hi".equals("hi"));
		
		//true를 false로 바꿈 
		
		System.out.println(!true);
		System.out.println(!false);
		
		
		
	}

}

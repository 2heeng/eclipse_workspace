package typeConversion;

public class OperationPromotionEx {

	public static void main(String[] args) {

		byte result1=10+20;
		System.out.println("결과 " + result1);// 문자열+정수타입을 하면 정수가 문자열로 자동 형변환		
		
		byte v1=10;
		byte v2=20;
		int result2=v1+v2;
		System.out.println("결과는 "+result2);
		
		byte v3=10;
		int v4=100;
		long v5=1000L;
		long result3 =v3 + v4 + v5;
		System.out.println(result3);
		
		char v6='A';
		char v7=1;
		int result4=v6+v7;
		System.out.println(result4);
		// v6에 'A'가 int로 자동변환되어 65+1로 계산됨.
		System.out.println((char)result4);
		//66을 char로 강제변환하면 66에 해당하는 'B'가 나옴.
		
		int v8=10;
		double result5=v8/4.0;
		System.out.println(result5);
		
		int v9=1;
		int v10=2;
		System.out.println(v9/v10);
		
		double result6=(double)v9/v10;
		System.out.println(result6);
	}
	

}

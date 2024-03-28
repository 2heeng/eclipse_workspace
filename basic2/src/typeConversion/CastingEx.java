package typeConversion;

public class CastingEx {

	public static void main(String[] args) {
		
		int var1=10;
		byte var2=(byte)var1;
		System.out.println(var2);
		
		long var3=300;
		int var4=(int)var3;
		System.out.println(var4);
		
		int var5=65;
		char var6=(char)var5;// 대문자 A 65 소문자 a 는 97로 정수변환
		System.out.println(var6);
		
		double var7=3.24;
		int var8=(int)var7;
		System.out.println(var8);// 실수가 정수로 변환되어 소수점이 날아가버린다.
		
		System.out.println(8/3);//정수 나누기 정수: 데이터 타입이 모두 정수이므로 연산결과도 정수
		System.out.println(8/3.0); 
		// 정수 나누기 실수(double):  원래 프로그래밍에서는 타입이 안 맞는 경우 에러가 나거나 연산이 잘못되는 경우가 있는데,
		// 자바에서는 자동 형변환이 일어나서 값의 허용 범위가 작은 타입이 큰 타입으로 바뀜.
		
		byte x = 10;
		byte y = 20;
		
		
		
		
		
	}

}

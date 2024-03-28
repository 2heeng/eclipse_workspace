package jungsuk;

public class Ch03_Hw {

	public static void main(String[] args) {
		
		//3-1.
//		int x = 2; // x=3 y= 13
//		int y = 5;
//		char c = 'A'; // 'A'의 문자코드는 65
//		//3을 이진수로 왼쪽으로 33칸 옮겨라. 그러면 int범위를 벗어남.결국 한칸이동과 같은 결과. 
//		System.out.println(1 + x << 33); // 답: 6
//		// 관계연산자 먼저해서 true || false && flase
//		// &&(and)가 ||(or)보다 우선이다.
//		System.out.println(y >= 5 || x < 0 && x > 2); //답: true
//		// 10- x++먼저 해서 10-2는 8. y += 8이니까 5+8은 13
//		System.out.println(y += 10 - x++);//답:13
//		// 위에서 x++가 있기 떄문에 x=3. 3+2는 5.
//		System.out.println(x+=2); //답:5
//		//char는 int(아스키코드)로 변환되어서 부호를 넣을 수 있다. Z는 90이다
//		// !(true && true) 
//		System.out.println( !('A' <= c && c <='Z') ); //답: false
//		//얘도 아스키코드로 변환. 67-65
//		System.out.println('C'-c); //답:2
//		//얘도 아스키코드로 변환. 53-48
//		System.out.println('5'-'0'); //답:5
//		System.out.println(c+1); //답:66
//		System.out.println(++c);//답:B
//		System.out.println(c++); //답:B
//		System.out.println(c); //답:C

		// 3-2.
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수
		int numOfBucket = (numOfApples%sizeOfBucket==0 ? numOfApples/sizeOfBucket :numOfApples/sizeOfBucket + 1  ); //딱 떨어지는 경우에도 1을 더할 수 없기 때문에 삼항연산자를 쓴다.
		System.out.println(numOfBucket);
		
		//3-3.
		int num = 10;
		System.out.println( num>0 ? "양수" : (num==0 ? "0" : "음수"));
		
		//3-4.
		int num2 = 456;
		System.out.println( (num2/100)*100);
		
		//3-5.
		int num3 = 333;
		System.out.println( (num3/10)*10 + 1);
		
		//3-6.
		int num4 = 26;
		System.out.println( (num4 - num4%10 + 10)-num4);
		
		//3-7. 모르겠다
		int fahrenheit = 100;
		float celcius = (float)( 5.0/9*(fahrenheit - 32));
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		System.out.printf("%.2f",celcius);

		//3-8.
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
		char ch = 'A' ;
		ch = (char)(ch + 2);
		float f = 3.0f / 2;
		long l = 3000L * 3000 * 3000;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (double)f2==d;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		
		
		//3-9. 모르겠다
		char ch2 = 'z';
		//'a'부터'z'까지 소문자 : 'a' <= ch2 && ch2<='z'
		//'A'부터 'Z'까지 대문자 : 'A' <= ch2 && ch2 <= 'Z'
		// ('a' <= ch2 && ch2<='z') || ('A' <= ch2 && ch2 <= 'Z')
		// 숫자이거나~~
		//'0' <= ch2 && ch2<='9'
		boolean b2 = ('a' <= ch2 && ch2<='z') || ('A' <= ch2 && ch2 <= 'Z') || ('0' <= ch2 && ch2<='9');
		System.out.println(b2);
		
		//3-10.
		char ch3 = 'A';
		char lowerCase = ( 'A'<=ch3 && ch3<='z') ? (char)( ch3+32 ) : ch3;
		System.out.println("ch:"+ch3);
		System.out.println("ch to lowerCase:"+lowerCase);
		
		
	}
	
}

package typeConversion;

public class PrimitiveAndStringConversionEx {

	public static void main(String[] args) {
	
		System.out.println(10+1);
		System.out.println("10"+1);
		
		System.out.println(Integer.parseInt("10")+1);
		
		int num1=Integer.parseInt("10");
		int result1= num1+1;
		System.out.println(result1);
		
		System.out.println(1.5+1.3);
		System.out.println("1.5"+1.3);
		
		double num2=Double.parseDouble("1.5");
//		System.out.println(num2);
		double result2= num2+1.3;
		System.out.println(result2);
		
		boolean bool=true;
		System.out.println(bool + "안녕");
		boolean boo2=Boolean.parseBoolean("true");
		
		System.out.println(10+(2+"8"));

		int num3=10;
		String result3=String.valueOf(num3);
		System.out.println(result3+1);
		
		
	}

}

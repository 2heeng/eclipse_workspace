package generic3;

public class GnericTest2 {

	static <T extends Number> boolean compare(T num1, T num2) {
	int n1 = num1.intValue();
	int n2 = num2.intValue();
		
	boolean result = (n1==n2) ? true : false;
	
	return result;
//		if(n1 == n2) {
//		return true;
//	}	else {
//		return false; 
//	}
	} 
	
	static <T extends Number> boolean compare2(T num1, T num2) {
		double n1 = num1.doubleValue();
		double n2 = num2.doubleValue();
		
	boolean result = (n1==n2) ? true : false;
	
	return result;

	} 
	
	
	
	public static void main(String[] args) {
	
	boolean result1=compare(10, 10);
	System.out.println(result1);
	boolean result2=compare(10, 20);
	System.out.println(result2);
	
	boolean result3=compare2(10.5, 10.5);
	System.out.println(result3);
	boolean result4=compare2(10.5, 10.3);
	System.out.println(result4);
	
	}

}

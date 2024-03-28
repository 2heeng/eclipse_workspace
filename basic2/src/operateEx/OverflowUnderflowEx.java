package operateEx;

public class OverflowUnderflowEx {

	public static void main(String[] args) {
	
		byte var1=127;
		
		// int var2=var1+1;
		
		var1++;
		
		System.out.println(var1);
		
		byte var2= -128;
		var2--;
		
		System.out.println(var2);
		
		int x = 10;
		x++;
		System.out.println(x);
	}

}

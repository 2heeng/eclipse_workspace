package operateEx;

public class SignOperate2 {

	public static void main(String[] args) {
		
		int a = 0;
		
		int b = -1;
		
		int c = a++ - --b + a++ - --b - b--;
		
		
		System.out.println(a+b+c--);
		
		
	}

}

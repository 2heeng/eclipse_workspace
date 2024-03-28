package operateEx;

public class LogicalPeratorEx {

	public static void main(String[] args) {
		
		// && (and) 둘다 참이면 참. 아니며 다 거짓
		
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("=================================");
		
		
		// ||(or) 둘 중에 하나라도 참이면 참. 아니면 거짓
		
	
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("=================================");
		
		// !(not) 논리 부정 ^(xor)
		
		System.out.println(!true);
		System.out.println(!false);
		
		// ^(xor)두 문장이 다르면 참. 같으면 거짓
		

	}

}

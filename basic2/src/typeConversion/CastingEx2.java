package typeConversion;

public class CastingEx2 {

	public static void main(String[] args) {
	
		float result= 1.2f + 3.4f;
		System.out.println(result); //정확도 떨어짐
		
		double result2= 1.2 + 3.4;
		System.out.println(result2);
		
		float x = 1.2f;
		float y = 3.4f;
		double result3= x + y;
		System.out.println(result3); //정확도 떨어짐
		
		

	}

}

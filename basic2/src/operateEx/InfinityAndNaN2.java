package operateEx;

public class InfinityAndNaN2 {

	public static void main(String[] args) {
		
		int x =5;
		double y= 0.0;
		
		double z= x%y;
		System.out.println(z);
		
		
		System.out.println(Double.isNaN(z));
		
		if(Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}
		else {System.out.println(z+2);}

	}
}


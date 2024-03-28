
public class VariableScopeEx2 {

	public static void main(String[] args) {
		
		int v1=20;
		
		if(true) {
			
//			int v1=20;
			System.out.println(v1);
		}
		
//		System.out.println(v1);if문 밖에서 선언한 변수는 if문 밖에서 호출 안된다.
		System.out.println(v1);
	}

}

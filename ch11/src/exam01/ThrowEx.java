package exam01;

public class ThrowEx {

	public static void main(String[] args) throws ClassNotFoundException{
		 
		//클래스명을 찾는 경우 문자열로 넣는 경우 패키지명.클래스명으로 써야 한다.
//		try {
//			Class.forName("java.lang.String");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	
		Class obj=Class.forName("java.lang.String");
		
		System.out.println(obj);
		
		
		
	}
	
	

}

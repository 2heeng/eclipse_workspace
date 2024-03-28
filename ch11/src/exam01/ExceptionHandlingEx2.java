package exam01;

public class ExceptionHandlingEx2 {

	public static void main(String[] args) {
		
		String str1=null;
		
		int arr[]=new int[3];
		arr[0]=3;
		arr[1]=7;
		arr[2]=9;
		
		
		try {
			System.out.println(str1.length()); //null예외
			System.out.println(arr[3]); //배열의 길이 예외
		} catch(NullPointerException e) {
			System.out.println("null이 안되도록 하세요"); 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 길이 벗어남"); 
		}
		
	}
	

}

package exam01;

public class ArrayExceptionEx {

	public static void main(String[] args) {
		
		int arr[]=new int[3];
		arr[0]=3;
		arr[1]=7;
		arr[2]=9;
		
		System.out.println(arr[2]);

		//System.out.println(arr[3]);
		
		try {
			System.out.println(arr[3]);
		} catch(Exception e) {
			System.out.println("예외발생");
		}
	}

}

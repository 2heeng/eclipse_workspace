package basic3;

public class ArrayEx4 {

	public static void main(String[] args) {
		
		//배열의 처음 생성시 배열 항복은 기본값(0)으로 초기화됨 (int 0, double 0.0,char 공백, boolean false, String null)
		
//		int arr[]=new int[3];
//		double arr[]=new double[3];
//		char arr[]=new char[3];
//		boolean arr[]=new boolean[3];
		String arr[]=new String[3];
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
			
		}

	}

}

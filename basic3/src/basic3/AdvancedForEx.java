package basic3;

public class AdvancedForEx {

	public static void main(String[] args) {
		
		int arrs[]= {1,2,3};
		String strs[]= {"A", "b", "C"};
		
		for(int i=0; i<arrs.length;i++ ) {
			
			System.out.println(arrs[i]);
		}

		System.out.println("==================================");
		
		//향상된 for문을 사용
		
		for(int arr:arrs) {
			System.out.println(arr);
		}
		System.out.println("==================================");
		for(String str:strs) {
			System.out.println(str);
		}
	}

}

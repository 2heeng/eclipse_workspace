package alg;

public class ReversePrint {

	public static void main(String[] args) {
		int arrs[]= {52,71,32,103,273,93};
		
		for(int i=arrs.length;i>0;i--) {
			System.out.println(arrs[i-1]);
		}
		
		System.out.println("========================================");
		
//		//향상된 for문 
//		for(int arr:arrs) {
//			System.out.println(arr);
//		}

	}

}

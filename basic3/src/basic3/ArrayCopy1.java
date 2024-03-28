package basic3;

public class ArrayCopy1 {

	public static void main(String[] args) {
		// int arr[]=new int[] {1,2,3};
		int arr[]= {1,2,3};
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
			
		System.out.println("==========================================");
		
		int arr2[]=new int[5];
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("==========================================");
		
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
		}
		
		System.out.println("==========================================");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("=====System.arraycopy()=====================================");
		
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		//arr 배열을 0번째요소 부터 arr의 길이만큼 복사해서 arr2배열의 0번째 위치부터 복사해 넣는다. 
		
		
		
		
		
	}

}

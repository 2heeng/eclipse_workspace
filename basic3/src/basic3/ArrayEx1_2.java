package basic3;

public class ArrayEx1_2 {

	public static void main(String[] args) {
		
		int arr[]=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		System.out.println(System.identityHashCode(arr));
		System.out.println("배열의 길이는 "+arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}

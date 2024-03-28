package basic3;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		//배열타입 선언(그 배열에 들어갈 기본형의 타입을 앞에사용)
		int arr[]; // 배열타입은 대괄호를 넣는다.
		//그 배열에 방이 몇개인지 정의를 한다. 
		arr=new int[4];
		
		arr[0]=7; // arr의 총 4개의 방중에 0번째에 7을 넣고싶다. 
		arr[1]=14;
		arr[2]=21;
		arr[3]=28;
		
		System.out.println(System.identityHashCode(arr));
		System.out.println("배열의 길이는 " + arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		// int arr2[]=new int[4];
		
	}

}

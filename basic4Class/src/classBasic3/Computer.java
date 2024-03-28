package classBasic3;

public class Computer {

	public static void main(String[] args) {
		
		//누적합
		
//		int total=0;
//		for(int i=0;i<=5;i++) {
//			total+=i;
//		} System.out.println(total);
		
		//클래스와 클래스는 관계를 맺어야 한다.
		//(사용, 부모-자식,포함)
		
		Accumulate accumulate=new Accumulate();
		accumulate.acc();
		int result=accumulate.acc(10);
		System.out.println(result);
		accumulate.acc2(1, 4);
		//배열 넣는법
//		int arr[]=new int[2];
//		arr[0]=1;
//		arr[1]=2;
		
//		int arr[]=new int[] {1,2};
		
//		int arr[]= {1,2};
		
		accumulate.acc3(new int[] {1,2});
		
		accumulate.acc4(new int[] {1,2,3,4,5,6,7,8,9,10});
		
	}

}

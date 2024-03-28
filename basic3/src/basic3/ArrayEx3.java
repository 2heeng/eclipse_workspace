package basic3;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		// 국어 85 영어 95 수학 87 평균을 구해라
		
		int arr[]=new int[] {85,95,87};
//		int korean=arr[0];
//		int english=arr[1];
//		int math=arr[2];
//		int sum=korean+english+math;
//		int average=sum/arr.length;
//		System.out.println(average);
		
		int total=0;
		for(int i=0;i<arr.length;i++) {
			total=total+arr[i];		
			
		} double avr=(double)total/arr.length; // 평균값을 더블로 형변환하는것을 기억하기
		System.out.printf("%.2f",avr);
		

	}

}

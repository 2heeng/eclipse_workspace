package basic3;

public class ArrayEx6 {

	public static void main(String[] args) {
		
		
		//학생1 국어 90 영 90 수 90
		//학생2 국어 80 영 80 수 80
		//학생3 국어 70 영 70 수 70
		
		//과목별 평균과 반 평균을 구하기
		// 이중 for문과 2차원 배열
		
		int arr2d[][]=new int[3][5];
		
//		arr2d[0][0]=90; //이렇게 하는게 정석
//		arr2d[0][1]=90;
//		arr2d[0][2]=90; 
//		
//		arr2d[1][0]=80; 
//		arr2d[1][1]=80;
//		arr2d[1][2]=80;
//		
//		arr2d[2][0]=70; 
//		arr2d[2][1]=70;
//		arr2d[2][2]=70;
		
		System.out.println("행의 갯수 : " + arr2d.length); // 몇행인지
		System.out.println("1행의 길이(열의 갯수) : " + arr2d[0].length);//[0]은 행의 숫자가 들어가는걸로 1행 길이이며 즉 열의 갯수가 된다
		System.out.println("3행의 길이(열의 갯수) : " + arr2d[3].length); //몇 열인지
		
		for(int i=0;i<arr2d.length;i++) {
			
			for(int j=0;j<arr2d[i].length;j++) {
				
				System.out.printf("%d ", arr2d[i][j]);
				
			} System.out.println();
			
		}
	}

}

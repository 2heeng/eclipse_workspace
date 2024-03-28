package basic3;

public class ArrayEx7_3 {

	public static void main(String[] args) {

		int arr2d[][] = new int[][] { { 90, 90, 90 }, 
			                          { 80, 60, 30 }, 
			                          { 70, 40, 50 } };
		// 학생별 평균과 반평균 구하기
		System.out.println("첫번째 과목 국어의  ");	 
		int stutotal = 0;
		for (int i = 0; i < arr2d.length; i++) {
				stutotal = stutotal + arr2d[i][0];
			}
			double stuavg = (double) stutotal / arr2d[0].length;
			System.out.printf("총합점수 : %d 평균점수 : %.2f", stutotal, stuavg);
			System.out.println();
			System.out.println("================================================================");
		
			//전체 반 평균
			int bantotal = 0;
			int cnt=0;
			for (int i = 0; i < arr2d.length; i++) {

				for (int j = 0; j < arr2d[i].length; j++) {

					bantotal +=arr2d[i][j];
					cnt++;
			}
			
		} 
		
			//double banavg=(double)bantotal / (arr2d.length*arr2d[0].length);
			double banavg=(double)bantotal / cnt;
			System.out.printf("1반 총합점수 : %d 1반 평균점수 : %.2f",bantotal,banavg);
			System.out.println();
	}

}

package basic3;

public class ArrayEx7_2 {

	public static void main(String[] args) {

		int arr2d[][] = new int[][] { { 90, 90, 90 }, { 80, 80, 80 }, { 70, 70, 70 } };
		// 학생별 평균과 반평균 구하기

		System.out.println(arr2d.length + "행 " + arr2d[0].length + "열");

		for (int i = 0; i < arr2d.length; i++) {

			int stutotal = 0;

			for (int j = 0; j < arr2d[i].length; j++) {

				stutotal = stutotal + arr2d[i][j];

			}
			double stuavg=(double)stutotal / arr2d[i].length;
			System.out.printf("학생별 총합점수 : %d 학생별 평균점수 : %.2f",stutotal,stuavg);
			System.out.println();

		}
		System.out.println("================================================================");
		
		
		for (int i = 0; i < arr2d.length; i++) {

			int stutotal = 0;

			for (int j = 0; j < arr2d[i].length; j++) {

				stutotal = stutotal + arr2d[j][i];
				System.out.printf("%d ", arr2d[i][j]);
			}
//			double stuavg=(double)stutotal / arr2d[0].length;
//			System.out.printf("과목별 총합점수 : %d 과목별 평균점수 : %.2f",stutotal,stuavg);
//			System.out.println();
		}
	}

}

package ch05;

public class Ch05_8 {

	public static void main(String[] args) {
		int[][] array= {{95, 86}, 
				        {83, 92, 96}, 
				        {78, 83, 93, 87, 88}};
		
		
		int total=0;
		int num=0;
		for(int i=0;i<array.length;i++) {
			
			for(int j=0;j<array[i].length;j++) {
				total +=array[i][j];
				
			} num +=array[i].length;
			
		} double average= (double)total / num ;
		 System.out.println("전체 합은 " + total);
		 System.out.println("전체 평균은 " + average);
	}

}

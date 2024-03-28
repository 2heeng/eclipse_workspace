package basic3;

public class ArrayEx7 {

	public static void main(String[] args) {
		
		int arr2d[][]=new int[][] {{95, 86}, 
								   {83, 92, 96}, 
								   {78, 83, 93, 87, 88},
								   {50}};
		
		
//		arr2d[0][0]=90;
//		arr2d[0][1]=90;
//		arr2d[0][2]=90;
//		
//		arr2d[1][0]=80;
//		arr2d[1][1]=80;
//
//		arr2d[2][0]=70;
		
		
		System.out.println(arr2d.length + "행");
		System.out.printf("%d행은 %d열\n",1,arr2d[0].length);
		System.out.printf("%d행은 %d열\n",2,arr2d[1].length);
		System.out.printf("%d행은 %d열\n",3,arr2d[2].length);
		System.out.printf("%d행은 %d열\n",3,arr2d[3].length);
		
		for(int i=0;i<arr2d.length;i++) {
			
			for(int j=0;j<arr2d[i].length;j++) {
				
				System.out.printf("%d ", arr2d[i][j]);
				
			} System.out.println();
			
		}
		
	}

}

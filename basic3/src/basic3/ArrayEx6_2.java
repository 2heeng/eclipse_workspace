package basic3;

public class ArrayEx6_2 {

	public static void main(String[] args) {
		
		int arr2d[][]=new int[3][3];
		
		arr2d[0][0]=90;
		arr2d[0][1]=90;
		arr2d[0][2]=90;
		
		arr2d[1][0]=80;
		arr2d[1][1]=80;
		arr2d[1][2]=80;

		arr2d[2][0]=70;
		arr2d[2][1]=70;
		arr2d[2][2]=70;
		
		System.out.println(arr2d.length + "행" + arr2d[0].length + "열");
		
		for(int i=0;i<arr2d.length;i++) {
			
			for(int j=0;j<arr2d[i].length;j++) {
				
				System.out.printf("%d ", arr2d[i][j]);
				
			} System.out.println();
			
		}
		
	}

}

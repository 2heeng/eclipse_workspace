package ch05;

public class Ch05_7 {

	public static void main(String[] args) {
		int array[]= {1, 5, 3, 8, 2};
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]<array[i+1]) {
				
				
					int arr[]={array[i+1]};
					System.out.println(arr);
				
				
			}
			
			
		} 
	}

}

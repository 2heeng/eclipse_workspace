package control2;

public class CumulativeSumEx {

	public static void main(String[] args) {
		
		//1+10까지 누적해서 총합을 구해보자
		
		int total=0;
		
		for(int i=1;i<=10;i++) {
			// System.out.println(i);
			total+=i;
		} System.out.println(total);
		
	}

}

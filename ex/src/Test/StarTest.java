package Test;

public class StarTest {

	public static void main(String[] args) {
		
		//별찍기1
//		for(int i=0;i<10;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
	System.out.println("----------------------------------------");
		//별찍기2
//		for(int i=10;i>0;i--) {
//			for(int j=0;j<i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
	System.out.println("----------------------------------------");
		//별찍기3
	for(int i=1;i<8;i++) {
		for(int j=7;j>=i;j--) {
			System.out.print(" ");
		}
		
		for(int j=1;j<=i*2-1;j++) {
			System.out.print("*");
		}System.out.println();
	}
		
		//별찍기 누적방법
	String str="";
	for(int i=1;i<8;i++) {
		for(int j=7;j>=i;j--) {
			str+=" ";
		}
		
		for(int j=1;j<=i*2-1;j++) {
			str+="*";
		}str+="\n";
	} System.out.println(str);
		
		
		
		
		
		
	}

}

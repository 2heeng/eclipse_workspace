package jungsuk09;

public class Exercise09_9 {

	static String delChar(String src,String delCh) {
		char ch1 = ' ';
		char ch2 = ' ';
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<delCh.length();i++) {
			ch1 = src.charAt(i);
			for(int j = 0; j<delCh.length();j++) {
				ch2 = delCh.charAt(j);
				if(ch1==ch2) {
					src=src.replace(ch1,' ');
				}
			}
		}
		return src.replaceAll(" ","");
	}
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)"+"   ->   "
				+   delChar("(1!2@3^4~5)","~!@#$%^&*()"));
				System.out.println("(1   2               3           4\t5)"+"    ->   "
				+   delChar("(1    2               3           4\t5)","   \t"));

	}

}

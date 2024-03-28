package jungsuk09;

public class Exercise09_10 {

	static String format(String str,int length, int alignment) {
		if(length<str.length()) {
			return str.substring(0, length);
		} else {
			char charr[]=new char[length];
			for(int i=0;i<length;i++) {
				charr[i]=' ';
			}
			char chstr[]=str.toCharArray();
			if(alignment==0) {
				System.arraycopy(chstr, 0, charr, 0, str.length());
			} else if(alignment==1) {
				int idx=((length-str.length())/2)+1;
				System.arraycopy(chstr, 0, charr, idx, str.length());
			} else {
				int idx=length-str.length();
				System.arraycopy(chstr, 0, charr, idx, str.length());
			} return new String(charr);
		}
	}
	public static void main(String[] args) {
		String   str   =   "가나다";
		System.out.println(format(str,7,0));   //   왼쪽   정렬
		System.out.println(format(str,7,1));   //   가운데   정렬
		System.out.println(format(str,7,2));   //   오른쪽   정렬

	}

}

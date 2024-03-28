package jungsuk09;

public class Exercise09_6 {

	public   static   String   fillZero(String src, int length) {
	
		if(src==null || src.length()==length) {
			return src;
		} else if(length <=0){
			return "";
		}
		else if(src.length()>length) {
			String substr = src.substring(length);
			return substr;
		} else {
			char charr[]=new char[length];
			for(int i=0;i<length;i++) {
				charr[i]='0';
			}
			for(int j=(src.length()-1);j>=0;j--) {
					charr[j+(charr.length-src.length())]=src.charAt(j);
			}
//			for(char a : charr) {
//				System.out.print(a);
//			}
			return new String(charr);
		}
	}
	public static void main(String[] args) {
		
		String   src   =   "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
		

	}

}

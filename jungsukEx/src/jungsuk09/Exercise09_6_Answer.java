package jungsuk09;

public class Exercise09_6_Answer {

	public static String fillZero(String src, int length) {

		if (src == null || src.length() == length) {
			return src;
		} else if (length <= 0) {
			return "";
		} else if (src.length() > length) {
			String substr = src.substring(length);
			return substr;
		} else {
			char charr[] = new char[length];
			for (int i = 0; i < length; i++) {
				charr[i] = '0';
			}
			System.arraycopy(src.toCharArray(), 0, charr, length - src.length(), src.length());
			//toCharArray() : char배열로 변환.
			//void java.lang.System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
			//src를 srcPos에서부터 복사해서 dest의 destPos위치부터 length만큼 붙여넣는다. 
			return new String(charr);
		}
	}

	public static void main(String[] args) {

		String src = "12345";
		System.out.println(fillZero(src, 10));
		System.out.println(fillZero(src, -1));
		System.out.println(fillZero(src, 3));

	}

}

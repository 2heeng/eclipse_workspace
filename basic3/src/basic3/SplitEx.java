package basic3;

public class SplitEx {

	public static void main(String[] args) {
		
		String subject="자바 파이썬 프로그래밍 자라 파이썬";
		String[] strArr=subject.split(" "); //띄어쓰기로 분리시켜서 문자열배열에 저장
		
		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}

	}

}

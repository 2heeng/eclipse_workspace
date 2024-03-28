package basic3;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class NullPointerEx {

	public static void main(String[] args) {
		
		//참조형: 배열 열거 클래스 인터페이스
		// int arr[]=null;
		int arr[]=new int[] {4,5,6};
		System.out.println(arr);
		System.out.println(arr[0]);
		arr[0]=5;
		System.out.println(arr[0]);
		// System.out.println(arr[3]); //범위 벗어나서 오류남
		
		String str=null;
		System.out.println(str); //null로 찍힘
		System.out.println(str.length());
		
		String hi=new String();
		System.out.println(hi); //비어있는 칸으로 찍힘


	}

}

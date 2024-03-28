package ch12_Answer;

import java.util.StringTokenizer;

public class Ex11 {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		StringTokenizer stnz= new StringTokenizer(str,",");
		
		System.out.println(stnz);
		
		while(stnz.hasMoreElements()) {
			System.out.println(stnz.nextToken());
		}

	}

}

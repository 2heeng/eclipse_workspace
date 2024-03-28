package exam05;

import java.util.StringTokenizer;

public class StringBuilderAndTokenizerEx {

	public static void main(String[] args) {
		String str1="hi";
		
		System.out.println(str1);
		System.out.println(str1.toString());
		
		System.out.println(str1.hashCode());
		System.out.println(System.identityHashCode(str1));
		
		str1="nice";
		
		System.out.println(str1.hashCode());
		System.out.println(System.identityHashCode(str1));
		
		System.out.println("=========================================");
		//공간의 효과적 사용 StringBuilder
		//System.out.println(new StringBuilder());
		
		StringBuilder strbuilder = new StringBuilder();
		System.out.println(System.identityHashCode(strbuilder));

//		strbuilder.append("DEF");
//		System.out.println(System.identityHashCode(strbuilder));
//		System.out.println(strbuilder);
//		strbuilder.insert(0, "ABC");
//		System.out.println(strbuilder);
//		strbuilder.delete(3, 4);
//		System.out.println(strbuilder);
		
		strbuilder.append("DEF").insert(0,"ABC").delete(3, 5);
		
		System.out.println(strbuilder);
		System.out.println(strbuilder.toString());
		
		
		System.out.println("--------------------------------------");
		
		//구분자:delimeter, seperator(, 공백)
		String str2 = "홍길동/김길동/박길동";
		
		//str2.split(",");
		
		StringTokenizer stringtokenizer= new StringTokenizer(str2, "/");
		
		//반복, 조건은 끝날때까지. 다음 토큰이 있나?
		while(stringtokenizer.hasMoreTokens()){
			
			System.out.println(stringtokenizer.nextToken());
		}
		
		
		
	}

}

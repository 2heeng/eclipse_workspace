package sec02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrToStreamEx {

	public static void main(String[] args) {
		
		String strArr[]= {"홍일동","홍이동","홍삼동"};

		int strArr2[]= {1,0,4};
		
		//기존방식
		for(String str : strArr) {
			System.out.println(str);
		}
		System.out.println("=====================================");
		//strArr.stream
		
		//Arrays 이 클래스에는 배열을 조작하기 위한 다양한 메서드(예: 정렬 및 검색)가 포함되어 있습니다.
//		Stream<String> stream=Arrays.stream(strArr);
//		stream.forEach((x)->{System.out.println(x);});
		
		IntStream stream2=Arrays.stream(strArr2);
		stream2.forEach((x)->{System.out.println(x);});
		
		System.out.println("=====================================");
		
		IntStream stream3=IntStream.rangeClosed(1, 100); //1부터 100까지 찍는법! 
		//System.out.println(stream3);
		stream3.forEach((x)->{System.out.println(x);});
		
		
	}

}

package sec02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapEx {

	public static void main(String[] args) {
		
		List<String> arrList = new ArrayList<>();
		arrList.add("짜파게티 안성탕면 신라면");
		arrList.add("진매 진순");
		
		arrList.stream().flatMap((x)->{return Arrays.stream(x.split(" "));}).forEach((x)->{System.out.println(x);});
		
		
	}

}

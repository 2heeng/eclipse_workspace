package sec01;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamEx2 {

	public static void main(String[] args) {
		
		//기존방식
		ArrayList<Integer> arrList1 = new ArrayList<>();
		arrList1.add(1);
		arrList1.add(0);
		arrList1.add(4);
		
		for(Integer i : arrList1) {
			System.out.println(i);
		}

		System.out.println("=================================");
		
		//스트림 사용 방식
		//ArrayList<Integer> arrListSTream1 = (ArrayList<Integer>) arrList1.stream();
		Stream<Integer> arrListSTream2=arrList1.stream();
		
		arrListSTream2.forEach((x)->{System.out.println(x);});
		//forEach안에 Consumer타입이 들어가는데. 컨슈머는 FunctionalInterface여서 람다식이 들어가고. 람다식안에 매개변수가 있어야하는 타입임. 
		
		
	}

}

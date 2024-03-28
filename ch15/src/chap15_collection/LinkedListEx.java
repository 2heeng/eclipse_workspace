package chap15_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		//LinkedList는 객체의 삽입과 삭제가 빈번한 경우에 ArrayList보다 처리속도가 빠르고 용이하다. 아래는 그 처리시간을 측정한 것이다. 
		long startTime;
		long endTime;

		List<String> arrayLists = new ArrayList<String>();

		List<String> linkedLists = new LinkedList<String>();

		startTime = System.nanoTime();

		for (int i = 0; i < 10000000; i++) {
			linkedLists.add(i, "hi");
		}

		endTime = System.nanoTime();

		System.out.println(endTime - startTime);

		startTime = System.nanoTime();

		for (int i = 0; i < 10000000; i++) {
			arrayLists.add(i, "hi");
		}

		endTime = System.nanoTime();
		
		System.out.println(endTime - startTime);

	}

}

package chap15_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAndArrayList {

	public static void main(String[] args) {
		
		//배열 1
//		int arrs[]=new int[4];
//		arrs[0]=23;
//		arrs[1]=10;
//		arrs[2]=48;
//		arrs[3]=15;
		
		//배열2
//		int arrs[]=new int[] {23, 10, 48, 15};
		
		//배열3(가장 단순한 방법)
		int arrs[]= {23, 10, 48, 15};
		
		for(int arr : arrs) {
			System.out.println(arr);
		}

		System.out.println(Arrays.toString(arrs));
		
		//배열은 크기를 정해놓은거라 또 추가하기가 번거로움.
		//배열의 단점을 극복하기 위한 자료구조로 List - ArrayList를 사용해보자
		List<Integer> list=new ArrayList<Integer>();
		boolean result = list.add(4); //add의 리턴타입이 boolean임. 
		//System.out.println(result);
		System.out.println(list);
		list.add(23);
		list.add(10);
		list.add(48);
		list.add(15);
		System.out.println(list);
		
		List list2=new ArrayList();
		list2.add(1);
		list2.add("이");
		list2.add(3);
		list2.add("사");
		//list2.add(arrs);
		list2.add(2, "삼");
		list2.remove(2);
		System.out.println(list2);
		
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		
	}

}

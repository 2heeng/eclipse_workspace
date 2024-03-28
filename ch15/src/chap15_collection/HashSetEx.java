package chap15_collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();

		
		hashSet.add("hi");
		hashSet.add("hi"); //두번 넣어도 중복안돼서 하나만 들어감
		hashSet.add("hi2");
		hashSet.add("hi3");
		
		System.out.println(hashSet.size());
		
		//싹 지워버림
		//hashSet.clear();
		
		
		//골라서 지우는 방법
		//hashSet.remove("hi2");
		
		//가져오는 방법
		for(String hash : hashSet) {
			System.out.println(hash);
		}
		
		//가져오는 방법2 (Iterator로 만들어서 가져오기)
		Iterator<String> iterator = hashSet.iterator();
		
		
		
		
		
		
		
	}

}

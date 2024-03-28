package chap15_collection;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {

		HashMap<String, String> hashMaps = new HashMap<String, String>();

		hashMaps.put("a", "apple");
		hashMaps.put("b", "banana");
		hashMaps.put("c", "cinamon");

		System.out.println(hashMaps.get("a"));
		System.out.println(hashMaps.get("b"));
		System.out.println(hashMaps.get("c"));
		System.out.println(hashMaps.get("s"));

		// 전체를 다 가져오고자 하는 경우 키가 중요하기 때문에 키만 뽑을 수 있는지

		Set<String> keySets = hashMaps.keySet();

		for (String key : keySets) {
			System.out.println(key + ": " + hashMaps.get(key));
		}
		//while문쓰는건데 교재 참고하기...
	}

}

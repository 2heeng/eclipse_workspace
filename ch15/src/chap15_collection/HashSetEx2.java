package chap15_collection;

import java.util.HashSet;

public class HashSetEx2 {

	public static void main(String[] args) {
		
		HashSet<Member> members = new HashSet<Member>();

		members.add(new Member("홍길동",30));
		
		members.add(new Member("홍길동",30));
		
		System.out.println(members.size());
		
		
	}

}

package chap15_collection;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		//저장할 공간을 만든다
		ArrayList<Board> arrLists = new ArrayList<Board>();
		
		arrLists.add(new Board("제목1","내용1","글쓴이1"));
		arrLists.add(new Board("제목2","내용2","글쓴이2"));
		
		for (Board boardList : arrLists) {
			System.out.println(boardList.getSubject() + boardList.getContent() + boardList.getWriter());
		}

	}

}

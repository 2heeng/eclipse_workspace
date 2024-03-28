package chap15_collection;

import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		List<Board> boardlists = new Vector<Board>();
		
		Thread threadA = new Thread(new Runnable() {
			@Override
			public void run() {
			
				for (int i=0;i<10;i++) {
					boardlists.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
				}
			}
		});
		
		
		Thread threadB = new Thread(new Runnable() {
			@Override
			public void run() {
			
				for (int i=0;i<10;i++) {
					boardlists.add(new Board("제목"+i,"내용"+i,"글쓴이"+i));
				}
			}
		});
		
		threadA.start();
		threadB.start();
		
		try{
			threadA.join();
			threadB.join();
		}
		catch (InterruptedException e) {
			
		}
		
		for (Board board : boardlists) {
			System.out.println(board.getSubject() + board.getContent() + board.getWriter());
		}
				

	}

}

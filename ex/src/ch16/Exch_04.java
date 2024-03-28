package ch16;

public class Exch_04 {

	public static void main(String[] args) {
		
		Thread thread = new Thread(
				
				()->{System.out.println("작업스레드가 실행됩니다.");}
				
				);
		
		
		
		thread.start();
		
		

	}

}

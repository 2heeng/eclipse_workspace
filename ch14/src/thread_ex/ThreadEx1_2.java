package thread_ex;

public class ThreadEx1_2 {

	public static void main(String[] args) {
		
		Thread thread1=new Thread(new Runnable () {

			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("이");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						
						// e.printStackTrace();
					}
				}
				
			}});
		
		thread1.start();
		
		System.out.println("================================");
		
		Thread thread2=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("현");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						
						// e.printStackTrace();
					}
				}
				
			}});
		
		thread2.start();
	}

}

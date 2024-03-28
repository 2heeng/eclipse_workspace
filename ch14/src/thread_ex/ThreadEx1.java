package thread_ex;

public class ThreadEx1 {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("띵");
					try {
						Thread.sleep(3000); //3초있다가 치라고 지연시킴. 스테틱메소드여서 Thread로 바로 접근 가능. 
					} catch (InterruptedException e) {
						//예외처리
					} 
				}

			}
		});

		thread1.start(); //작업스레드1

		System.out.println("==========================="); //메인스레드

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("*");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						
					}
					
				}

			} //override
		});

		thread2.start(); //작업스레드2
	}

}

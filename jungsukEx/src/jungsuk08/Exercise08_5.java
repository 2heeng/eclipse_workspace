package jungsuk08;

public class Exercise08_5 {

	static void method(boolean b) {
		try {
		System.out.println(1);
		if(b) {throw new ArithmeticException();}
		System.out.println(2);
		} catch(RuntimeException r) {
		System.out.println(3);
		return; //return이 나와서 메소드가 끝나버림.
		} catch(Exception e) {
		System.out.println(4);
		return;
		} finally {
		System.out.println(5);
		}
		System.out.println(6);
		}

	
	
	public static void main(String[] args) {
		method(true);
		method(false);

	}

}

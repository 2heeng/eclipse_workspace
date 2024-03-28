package jungsuk07;

public class Exercise07_25 {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner oi = outer.new Inner();
		System.out.println(oi.iv);

	}

}

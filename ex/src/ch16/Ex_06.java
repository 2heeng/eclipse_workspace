package ch16;

public class Ex_06 {

	public static double calc(Function fun) {
		double x = 10;
		double y = 4;
		
		return fun.apply(x,y);
	}
	
	public static void main(String[] args) {
		double result = calc((x,y)->{return x/y;});
		System.out.println("result: "+result);

	}

}

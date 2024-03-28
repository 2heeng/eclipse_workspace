package sec01;

public class LamdaEx1 {

	
	static void action(Calculable calculable) {
		int x=10;
		int y=4;
		
		calculable.calculate(x, y);
		//System.out.println("hi");
	}
	public static void main(String[] args) {
	
		action(new Calculable() {

			@Override
			public void calculate(int x, int y) {
				System.out.println(x+y);
				
			}
			
		});
		
		
		action(
				(x,y)->{
					int result = x+y;
					System.out.println(result);
				}
				);
		
	

	}

}

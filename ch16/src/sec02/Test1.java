package sec02;

public class Test1 {

	public static void main(String[] args) {
		Person kim = new Person();
		
		//1.
//		kim.useComputer(new Calculable() {
//			
//			@Override
//			public double calc(double x, double y) {
//				
//				return x+y;
//			}
//		});
		
		
		
	//2.람다식
	kim.useComputer(
			(x,y)->{
				return x+y;
			}
			);
		
	//정적메소드 참조
	kim.useComputer(Computer::sum);
		

	
	//인스턴스 메소드 참조
	Computer com = new Computer();
	
	kim.useComputer(com::sum2);
	
	
	
	}

}

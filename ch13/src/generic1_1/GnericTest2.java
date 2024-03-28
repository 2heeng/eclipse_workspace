package generic1_1;

public class GnericTest2 {

	public static void main(String[] args) {
	Product<Tv, String> product1 = new Product<Tv, String>();

	product1.setKind(new Tv());
	product1.setModel("Samsung TV");
	
	Tv tv = product1.getKind();
	String tvModel = product1.getModel();
	
	System.out.println(tv);
	System.out.println(tvModel);
	
	System.out.println("=========================");
	
	Product<Car, Integer> product2= new Product<>();
	
	System.out.println(product2);
	System.out.println(product2.toString());
	
	product2.setKind(new Car());
	product2.setModel(222);
	
	Car car = product2.getKind();
	int carModel = product2.getModel();
	
	System.out.println(car);
	System.out.println(carModel);
	
	}

}

package generic1;

public class ProductEx {

	public static void main(String[] args) {
		
	Product product = new Product();

	product.kind = new Car();
	product.kind = new Tv();
	
	product.model="소나타";
	product.model=111;
	//위에 처럼 해도 되지만 사용하려는 타입을 정해서 하는게 제일 좋음
	
		
	Product<Car, String> product2 = new Product<Car, String>();
	
	product2.kind = new Car(); //kind는 Car만 들어갈 수 있다
	//product2.kind = new Tv();
	product2.model="소나타";
	//product2.model=222;
	
	
	
	}

}

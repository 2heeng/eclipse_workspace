package ch06;

public class ShopServiceAnswerTest {

	public static void main(String[] args) {
		
		// new ShopService();
		
		ShopServiceAnswer obj1=ShopServiceAnswer.getInstance();
		ShopServiceAnswer obj2=ShopServiceAnswer.getInstance();

		if(obj1==obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		} else {
			System.out.println("다른 ShopService 객체입니다.");
		}
		
	}

}

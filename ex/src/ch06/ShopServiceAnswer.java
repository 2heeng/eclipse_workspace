package ch06;

public class ShopServiceAnswer {

	private static ShopServiceAnswer shopServiceAnswer = new ShopServiceAnswer();
	
	private ShopServiceAnswer() {
		
	}
	
	public static ShopServiceAnswer getInstance(){
		return shopServiceAnswer;
	}
}

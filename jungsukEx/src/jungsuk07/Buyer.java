package jungsuk07;
//7-19번 문제
public class Buyer {

	int money = 1000;
	Product[] cart = new Product[3]; //구입한 물건을 저장하기 위한 배열
	int i = 0; //Product배열 cart에 저장할 index
	
	void buy(Product p) {
		if(p.price <= money) {
			money = money - p.price;
			//System.out.println(money);
			add(p);
		} else if(p.price > money) {
			System.out.println("잔액이 부족하여 "+p+"를 살 수 없습니다.");
		}
	}
	
	void add(Product p) {
		if(i>=cart.length) {
			Product[] tmp=new Product[cart.length];
			Product[] newCart = new Product[cart.length*2];
			//System.arraycopy(cart, 0, newCart, 0, cart.length);
			tmp = cart;
			cart=newCart;
			for(i=0;i<tmp.length;i++) {
				newCart[i]= tmp[i];
			}
		} cart[i]=p;
		System.out.println(cart[i]);
		i++;	
	} 
	
	void summary() {
		int sum = 0;
		System.out.print("구입한 물건: ");
		for(int i=0;i<cart.length;i++) {
			System.out.print(cart[i]+", ");
			sum += cart[i].price;
		} 
		System.out.println("");
		System.out.println("사용한 금액: "+ sum);
		System.out.println("남은 금액: "+money);
	}
	
	
}

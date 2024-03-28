package control;

public class SwithCaseEx {

	public static void main(String[] args) {
		
		int menu=4;
		
		switch(menu) {
			case 1:
				System.out.println("짜장");
				break;
			case 2: 
				System.out.println("짬뽕");
				break;
			case 3: 
				System.out.println("볶음밥");
				break;
			case 4: 
				System.out.println("탕수육");
				break;
			default:
				System.out.println("주문하실 메뉴의 번호를 확인해주세요");
		}

	}

}

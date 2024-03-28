package control;

public class SwithCaseEx1_2 {

	public static void main(String[] args) {
		
		int menu=3;
		
		switch(menu) {
			case 1:
				System.out.println("sandwich");
			break;
			case 2:
				System.out.println("hotdog");
			break;
			case 3:
				System.out.println("burger");
			break;
			case 4:
				System.out.println("snack");
			break;
			default:
				System.out.println("error");
		}

	}

}

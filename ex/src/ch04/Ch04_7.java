package ch04;

import java.util.Scanner;

public class Ch04_7 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("-------------------------------");
		System.out.println("1.예금 | 2.출금  | 3.잔고 | 4.종료");
		System.out.println("-------------------------------");
		System.out.print("선택> ");
		
		String inputStr = scanner.nextLine();
		
		while(!inputStr.equals("q")) {
			
			if(inputStr.equals("1")) {
				System.out.println("예금액> "+ 10000);			
			} else if(inputStr.equals("2")) {
				System.out.println("출금액> "+ 2000);
			} else if(inputStr.equals("3")) {
				System.out.println("잔고> "+ 8000);
			} else if(inputStr.equals("4")) {
				System.out.println("프로그램 종료");
			} break;
		}
		
		
//		while(inputStr.equals("1")) {
//			
//			System.out.println("예금액>" + 10000);
//			break;
//		} if(inputStr.equals("2")) {
//			System.out.println("출금액> "+ 2000);			
//		} else if(inputStr.equals("3")) {
//			System.out.println("잔고> "+ 8000);
//		} else if(inputStr.equals("4")) {
//			System.out.println("프로그램 종료");
//		} 
	}

}

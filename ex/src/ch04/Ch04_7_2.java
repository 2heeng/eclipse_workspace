package ch04;

import java.util.Scanner;

public class Ch04_7_2 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int balance=0;
		boolean flag=true;
		while(flag) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금  | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			String inputStr = scanner.next(); //여기서 nextline을 쓰면 개행문자가 발생해서 오류가 난다.
			
			if(inputStr.equals("1")) {
				System.out.println("예금액> ");	
				int inputMoney=scanner.nextInt();
				balance+=inputMoney;
			} else if(inputStr.equals("2")) {
				System.out.println("출금액> ");
				int outputMoney=scanner.nextInt();
				balance=balance-outputMoney;
			} else if(inputStr.equals("3")) {
				System.out.println("잔고> "+ balance);
			} else if(inputStr.equals("4")) {
				flag = false;
				System.out.println("프로그램 종료");			
			} 
		}
	}

}

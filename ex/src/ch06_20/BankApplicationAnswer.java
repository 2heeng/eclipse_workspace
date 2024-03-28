package ch06_20;

import java.util.Scanner;

public class BankApplicationAnswer {

	static Scanner scanner = new Scanner(System.in);

	static AccountAnswer accounts[] = new AccountAnswer[100];

	public static void main(String[] args) {

		// AccountAnswer account = new AccountAnswer();
//		for(AccountAnswer account : accounts) {
//			System.out.println(account);
//		} //배열 테스트

		int menu = 0;
		boolean flag = true;
		while (flag) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택> ");
			menu = scanner.nextInt();

			if (menu == 1) {
				creatAccount();

			} else if (menu == 2) {
				accList();
			} else if (menu == 3) {
				deposit(); // 예금 deposit
			} else if (menu == 4) {
				withdraw(); // 출금 withdraw
			} else if (menu == 5) {
				flag = false;
				
			} else {

			}
			
		}
		
		System.out.println("프로그램 종료");
		
	} // main

	static void creatAccount() {
		System.out.println("-------------");
		System.out.println("계좌생성");
		System.out.println("-------------");
		System.out.println("계좌번호: ");
		String tempAccNo = scanner.next();
		System.out.println("계좌주: ");
		String tempAccName = scanner.next();
		System.out.println("초기입금액: ");
		int tempBalance = scanner.nextInt();
		AccountAnswer tempAccount = new AccountAnswer(tempAccNo, tempAccName, tempBalance);
//		System.out.println("계좌번호: " + account.getAccNo());
//		System.out.println("계좌주: " + account.getAccName());
//		System.out.println("초기입금액: " + account.getBalance()); //1명일때
		for (int i = 0; i < accounts.length; i++) {
			// null체크
			if(accounts[i]==null) {
			accounts[i] = tempAccount;
			System.out.println("결과: 계좌가 생성되었습니다.");
			break;
			}
		}
	}

	static void deposit() {
		System.out.println("-------------");
		System.out.println("예금");
		System.out.println("-------------");
		System.out.println("계좌번호: ");
		String tempAccNo = scanner.next();
		for (int i = 0; i < accounts.length; i++) {

			// null일때만 들어가도록
			if (accounts[i] != null) {
				String accNo = accounts[i].getAccNo();
				if (accNo.equals(tempAccNo)) {
					System.out.println("찾음. 예금액을 입력하시오.");
					System.out.print("예금액: ");
					int inputMoney = scanner.nextInt();
					int accu = accounts[i].getBalance() + inputMoney;
					accounts[i].setBalance(accu);
					System.out.println("결과: 예금 성공");
					System.out.println("잔금: " + accu);

				} else {
					System.out.println("계좌정보를 찾을 수 없음");
				}
				// break;
			}
		} 
	}

	static void withdraw() {
		System.out.println("-------------");
		System.out.println("출금");
		System.out.println("-------------");
		System.out.println("계좌번호: ");
		String tempAccNo = scanner.next();

		for (int i = 0; i < accounts.length; i++) {

			// null일때만 들어가도록
			if (accounts[i] != null) {
				String accNo = accounts[i].getAccNo();
				if (accNo.equals(tempAccNo)) {
					System.out.println("찾음. 출금액을 입력하시오.");
					System.out.println("출금액: ");
					int outMoney = scanner.nextInt();
					int diff = accounts[i].getBalance() - outMoney;
					accounts[i].setBalance(diff);
					System.out.println("결과: 출금 성공");
					System.out.println("잔금: " + diff);

				} else {
					System.out.println("계좌정보를 찾을 수 없음");
				}
				// break;
			}
		}

	} // withdraw

	static void accList() {
		System.out.println("-------------");
		System.out.println("계좌목록");
		System.out.println("-------------");

		// null체크
		
			for (int i = 0; i < accounts.length; i++) {

				if (accounts[i] != null) {
					System.out.println(accounts[i].getAccNo() + "\t" + accounts[i].getAccName() + "\t" + accounts[i].getBalance());
				}
				
			}
		

	} // accList
} // class

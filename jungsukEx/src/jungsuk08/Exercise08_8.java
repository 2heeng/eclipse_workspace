package jungsuk08;

import java.util.Scanner;

public class Exercise08_8 {

	public static void main(String[] args) {
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;

		do {
			count++;
			System.out.print("1과 100사의 값을 입력하세요");

			
			try {
				input = new Scanner(System.in).nextInt();
				if (answer > input) {
					System.out.println("더 큰수를 입력하세요");
				} else if (answer < input) {
					System.out.println("더 작은 수를 입력하세요");
				} else {
					System.out.println("맞췄습니다.");
					System.out.println("시도횟수는 " + count + "번 입니다.");
					break; // do-while문을 벗어난다
				}
			} catch (Exception e) {
				System.out.println("숫자로 입력하세요.");
			}

		} // do
		while (true);
	}// main

} // class

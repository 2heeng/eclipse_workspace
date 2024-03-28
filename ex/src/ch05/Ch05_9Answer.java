package ch05;

import java.util.Scanner;

public class Ch05_9Answer {

	public static void main(String[] args) {
		int studentNumber = 0;
		int scores[] = null;
		Scanner scanner = new Scanner(System.in);

		boolean flag = true;
		while (flag) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------");

			System.out.print("선택> ");

			int menu = scanner.nextInt();
			if (menu != 1) {
				System.out.println("학생수를 먼저 입력해주세요.");
			} else {
				switch (menu) {
				case 1 -> {
					System.out.print("학생수> ");
					studentNumber = scanner.nextInt();
					// System.out.println(studentNumber);
					scores = new int[studentNumber];
				}
				case 2 -> {

					for (int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i + "]");
						scores[i] = scanner.nextInt();
					}
					System.out.println();

				}
				case 3 -> {

					for (int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i + "]: " + scores[i] + "\n");
					}
					System.out.println();

				}
				case 4 -> {
					int max = Integer.MIN_VALUE;
					for (int i = 0; i < scores.length; i++) {

						if (scores[i] > max) {
							max = scores[i];
						}
					}
					System.out.println("최고 점수: " + max);
					int sum = 0;
					int cnt = 0;
					for (int i = 0; i < scores.length; i++) {
						sum += scores[i];
						cnt++;
					}
					double avg = (double) sum / cnt;
					System.out.println("평균 점수: " + avg);
				}
				case 5 -> {
					flag = false;
					System.out.println("프로그램을 종료합니다.");
				}

				}
			} // else 태그

		}

	}

}

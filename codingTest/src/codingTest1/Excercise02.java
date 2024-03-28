package codingTest1;

import java.util.Scanner;

public class Excercise02 {

	public static void main(String[] args) {
		int studentNumber = 0;
		int scores[] = null;
		int menu = 0;

		Scanner scanner = new Scanner(System.in);

		boolean flag = true;
		while (flag) {

			System.out.println("---------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");
			menu = scanner.nextInt();

			if(menu!=1) {
				System.out.println("학생 수를 먼저 입력해야 합니다.");
			}
			else {
			switch (menu) {
			case 1 -> {
				System.out.print("학생수> ");
				studentNumber = scanner.nextInt();
				scores = new int[studentNumber];
			}
			case 2 -> {
				for(int i=0;i<scores.length;i++) {
				System.out.print("scores["+i+"]: ");
				scores[i]=scanner.nextInt();
				}
			}
			case 3 -> {
				for(int i=0;i<scores.length;i++) {
					System.out.printf("scores[%d]: %d\n",i,scores[i]);
					}
			}
			case 4 -> {
				int tol=0;
				int count=0;
				int max=Integer.MIN_VALUE;
				for(int i=0;i<scores.length;i++) {
					tol+=scores[i];
					count++;
					if(scores[i]>max) {
						max=scores[i];
					}
				}
				double average=(double)tol/count;
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+average);
			}
			case 5 -> {
				flag = false;
				System.out.println("프로그램 종료");
			}
			}
			}
		} scanner.close();
	}

}

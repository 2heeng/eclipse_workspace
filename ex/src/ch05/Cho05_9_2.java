package ch05;

import java.util.Scanner;

public class Cho05_9_2 {

	public static void main(String[] args) {
		int studentNumber = 0;
		int scores[] = null;

		Scanner scanner = new Scanner(System.in);

		boolean flag=true;
		while (true) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택> ");
			int menu = scanner.nextInt();

			switch (menu) {

			case 1 -> {
				System.out.println("학생수> ");
				studentNumber=scanner.nextInt();
				scores = new int[studentNumber];
			}
			case 2 -> {
				for(int i=0; i<scores.length;i++) {
					System.out.println("scores["+i+"]");
					scores[i]=scanner.nextInt();
				} System.out.println();
		
			}
			case 3 -> {
				for(int i=0; i<scores.length;i++) {
					System.out.printf("scores[%d]: %d\n",i,scores[i]);
//					System.out.print("scores[" + i + "]: " + scores[i] + "\n");
				} System.out.println();

			}
			case 4 -> {
				int max=Integer.MIN_VALUE;
				int tol=0;
				for(int i = 0; i<scores.length;i++) {
					tol += scores[i];
					if(scores[i]>max) {
						max=scores[i];
					}
				}
				double avg = (double)(tol / scores.length);
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);

			}
			case 5 -> {
				flag = false;
				System.out.println("프로그램을 종료합니다.");
			}

			}

		}

	}

}

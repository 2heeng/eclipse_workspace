package codingTest1;

import java.util.Scanner;

public class Excercise01 {

	public static void main(String[] args) {
		int answer=(int)(Math.random()*100+1);
		int input=0;
		int count=0;
		Scanner scanner = new Scanner(System.in);
		

		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요: ");
			input = scanner.nextInt();
			
			if(input < answer) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (input > answer) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("맞췄습니다.");
				System.out.printf("시도횟수는 %d번 입니다.", count);
				break;
			}
		} while (true);
		scanner.close();
	} 

}

package jungsuk;

import java.util.Scanner;

public class Ch04_14_2Answer {

	public static void main(String[] args) {
		//4-14
		int answer =(int)(Math.random()*100)+1;
		int input = 0;  // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수		
		Scanner sc=new Scanner(System.in);
				
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 :");
			input = sc.nextInt(); // input . 입력받은 값을 변수 에 저장한다
			if(input > answer) {
				System.out.println("더 작은 수를 입력하시오.");
			} else if(input < answer) {
				System.out.println("더 큰 수를 입력하시오.");
			} else {
				System.out.println("맞췄습니다.");
				System.out.printf("시도횟수는 %d번 입니다.",count);
				break;
			}
			} while(true); // 무한반복문		
			
			

	}

}

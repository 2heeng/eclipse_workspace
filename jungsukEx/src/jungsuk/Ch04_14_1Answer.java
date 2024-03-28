package jungsuk;

import java.util.Scanner;

public class Ch04_14_1Answer {

	public static void main(String[] args) {
		//4-14
		// System.out.println((int)(Math.random()*100)+1);
		int secret=(int)(Math.random()*100)+1;
		int guess=0;
				
		Scanner sc=new Scanner(System.in);
				
				
			while(true) {
				guess=sc.nextInt();
				if(guess > secret) {
					System.out.println("더 작은 수를 입력하시오.");
				} else if(guess < secret) {
					System.out.println("더 큰 수를 입력하시오.");
				} else {
					System.out.println("정답");
					break;
				}
				
			}
			

	}

}

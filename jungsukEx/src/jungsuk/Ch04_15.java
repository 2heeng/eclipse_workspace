package jungsuk;

import java.util.Scanner;

public class Ch04_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        

        int number = 12321;  // 입력된 숫자를 백업
        int tmp = number;
        
        int result = 0;
        while (tmp > 0) {
            int remainder = number % 10;
            result = result * 10 + remainder;
            number /= 10;
        }

        if (number == result) {
            System.out.println(number + "은(는) 회문수입니다.");
        } else {
            System.out.println(number + "은(는) 회문수가 아닙니다.");
        }
    }

	

}

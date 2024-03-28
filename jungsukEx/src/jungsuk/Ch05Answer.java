package jungsuk;

import java.util.Scanner;

public class Ch05Answer {

	public static void main(String[] args) {
		//5-1
		//틀린 것 d,e
		// int[] arr=new int[5] {1,2,3,4,5};
		
		//5-2
		//2 4번째 갯수
		
		//5-3
		//내가 한거 보삼
		
		//5-4
//		int arr2[][]= {{5,5,5,5,5,},{10,10,10,10,10},{20,20,20,20,20},{30,30,30,30,30}};
//		
//		int tot=0;
//		float avg=0;
//		
//		for(int i=0;i<arr2.length;i++) {
//			for (int j=0;j<arr2[i].length;j++) {
//				tot+=arr2[i][j];
//			}
//		} avg = (float)tot / (arr2.length*arr2[0].length);
//		System.out.println(tot);
//		System.out.printf("%.2f",avg);
		
		
		//5-5
//		int[] ballArr = {1,2,3,4,5,6,7,8,9};
//		int[] ball3 = new int[3];
//		//배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다
//		for(int i=0; i< ballArr.length;i++) {
//			int j = (int)(Math.random() * ballArr.length);
//			int tmp = 0;
//			
//			tmp=ballArr[i];
//			ballArr[i]=ballArr[j];
//			ballArr[j]=tmp;
//			
//		}
//		//배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다
//		System.arraycopy(ballArr,0,ball3,0,3);
//		
//		for(int i=0;i<ball3.length;i++) {
//			System.out.print(ball3[i]);
//			}
		
		
		//5-6
//		//큰 금액의 동전을 우선적으로 거슬러 줘야한다
//		int[] coinUnit = {500, 100, 50, 10};
//		int money = 2680;
//		System.out.println("money="+money);
//		//패턴
////		System.out.println(money/coinUnit[0]);
////		System.out.println((money%coinUnit[0])/coinUnit[1]);
////		System.out.println((money%coinUnit[1])/coinUnit[2]);
////		System.out.println((money%coinUnit[2])/coinUnit[3]);
//		for(int i=0;i<coinUnit.length;i++) {
//		
//			System.out.printf("%d원 : %d\n",coinUnit[i], money/coinUnit[i]);
//			money = money%coinUnit[i];
		
		//5-7
		//파일 따로 있음
		
		//5-8
//		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
//		int[] counter = new int[4];
//		for(int i=0; i < answer.length;i++) {
//			counter[answer[i]-1]++;
//		}
//		for(int i=0; i < counter.length;i++) {
//			System.out.print(counter[i]);
//			for(int j=0;j<counter[i];j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//5-9~12는 패스
		
		
		//5-13.
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
		char[] question = words[i].toCharArray(); //String을 char[]로 변환
		
		
		for(int j=0;j<question.length;j++) {
		int idx=(int)(Math.random()*question.length);
		
		char tmp = question[i];
		
		question[i]=question[idx];
		question[idx]=tmp;
		
		} 
		System.out.printf("Q%d. %s의 정답을 입력하세요.>\n",i+1, new String(question));
		String answer = scanner.nextLine();
		
		
		
		//알맞은 코드를 넣어 완성하시오. char배열 question에 담긴 문자의 위치를 임의로 바꾼다
		
		//trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
		if(words[i].equals(answer.trim()))
			{System.out.printf("맞았습니다.%n%n"); }
			else
			{System.out.printf("틀렸습니다.%n%n"); }
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
		
		
		
		
		
		

	}

}

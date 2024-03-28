package jungsuk;

public class Ch04_Hw {

	public static void main(String[] args) {
		
		//4-1.
		//int형 변수 x가  10보다 크고 20보다 작을때 true인 조건식
		int x=0;  
		if(10<x && x<20){
			System.out.println("true");
		}
//		char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		char ch='a';
		if(ch==' ') {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
//		char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
		char ch2='x';
		if(ch2=='x' || ch2=='X') {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
//		 char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식 
		char ch3='0';
		if('0'< ch3 && ch3 < '9' ) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
//		 char ch ( ) true 형 변수 가 영문자 대문자 또는 소문자 일 때 인 조건식
		
//		 int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식 
		int year=1996;
		if(year%400 == 0) {
			System.out.println(true);
		} else if(year%4==0 && year%100!=0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
//		boolean형 변수 powerOn가  false일 때 true인 조건식
		boolean powerOn=1<2;
		if(powerOn) {
			System.out.println(false);
		} else {
			System.out.println(true);
		}
//		문자열 참조변수 str이 “yes”일 때 true인 조건식
		String str="yes";
		if(str.equals("yes")) {
			System.out.println(true);
		} else {System.out.println(false);}
		
		
	}
	}



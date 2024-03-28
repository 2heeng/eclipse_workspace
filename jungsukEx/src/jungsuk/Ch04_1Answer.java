package jungsuk;

public class Ch04_1Answer {

	public static void main(String[] args) {
		
		//4-1.
		//int형 변수 x가  10보다 크고 20보다 작을때 true인 조건식
		int x=11;
		System.out.println(10<x && x<20);
		//char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		char ch=' ';
		System.out.println(!(ch==' ' || ch=='\t'));
		// char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
		char ch2='x';
		System.out.println(ch2=='x' || ch=='X');
		//char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식 
		char ch3='0';
		System.out.println(ch3 >= '0' && ch3 <='9');
		//char형 변수 ch가 영문자(대문자 또는 소문자) 일 때 true인 조건식
		char ch4='a';
		System.out.println(('a' <= ch4 && ch4<='z') || ('A' <= ch4 && ch4 <= 'Z'));
		//int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식 
		 int year=2024;
		 System.out.println(((year%400 ==0) || ((year%4==0) && (year%100!=0))));
		 //boolean형 변수 powerOn가 false일 때 true인 조건식
		 boolean powerOn=false;
		 System.out.println(!powerOn);
		 //문자열 참조변수 str이 “yes”일 때 true인 조건식
		 String str="yess";
		 System.out.println(str.equals("yes"));
		 
	}

}

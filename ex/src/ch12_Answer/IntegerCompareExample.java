package ch12_Answer;

public class IntegerCompareExample {

	public static void main(String[] args) {
		 Integer obj1 = 100;
		 Integer obj2 = 100;
		 Integer obj3 = 300;
		 Integer obj4 = 300;
		 
		 System.out.println(obj1==obj2);
		 System.out.println(obj3==obj4);
		 
		 //값의 범위가 -128~127이면 ==은 값을 비교하고 그 이외에는 번지를 비교하기 때문 
		 
		 System.out.println( obj1.equals(obj2) );
		 System.out.println( obj3.equals(obj4) );

	}

}

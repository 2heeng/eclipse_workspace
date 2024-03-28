package classBasic3;

public class Accumulate {
	//필드
	
	//생성자
	public Accumulate() {
		
	}
	//메소드
	void acc() {
		int total=0;
		for(int i=0;i<=5;i++) {
			total+=i;
		}
		System.out.println(total);
	}
	int acc(int num1) {
		int total=0;
		for(int i=0;i<=num1;i++) {
			total+=i;
		}
		return total;
	}
	void acc2(int num1,int num2) {
		System.out.println(num1+num2);
	}
	//매개변수에 참조형 배열을 넣어보자
	void acc3(int arr[]) {
		//메서드의 정의시 배열의 실제값이 뭐가 들어갈지 모름.배열의 길이도 모름.
		//호출하는 순간 실제값이 들어가므로, 호출시 배열의 길이가 정해짐
		int result=arr[0]+arr[1];
		System.out.println(result);
	}
	
	void acc4(int ...arr) {
		int total=0;
		for (int i=0;i<arr.length;i++) {
			total+=arr[i];
		} System.out.println(total);
	}
	
}

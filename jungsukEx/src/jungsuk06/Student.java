package jungsuk06;

public class Student {

	String name;
	int ban;
	int no;
	int kor; // 국어점수
	int eng; // 영어점수
	int math; // 수학점수

	public Student() {

	}

	int getTotal() {
		int result = this.kor + this.eng + this.math;
		return result;
	}

	float getAverage() {
		int result = this.kor + this.eng + this.math;
		float average = (float) result / 3;
		return (float)(Math.round(average*100)/100.0);
	}

}

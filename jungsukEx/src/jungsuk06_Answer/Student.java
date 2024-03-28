package jungsuk06_Answer;

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
		int tol = this.kor + this.eng + this.math;
		float average = (float) tol / 3;
		return (float)(int)((average*10.0+0.5)/10.0);
	}

}

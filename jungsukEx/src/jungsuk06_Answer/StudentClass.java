package jungsuk06_Answer;

public class StudentClass {

	String name;
	int ban;
	int no;
	int kor; 
	int eng; 
	int math; 
	
	public StudentClass(String name,int ban,int no,int kor,int eng,int math) {
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
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
	
	String info() {
		return (this.name+","+this.ban+","+this.no+","+this.kor+","+this.eng+","+this.math+","+this.getTotal()+","+this.getAverage());
	}
}

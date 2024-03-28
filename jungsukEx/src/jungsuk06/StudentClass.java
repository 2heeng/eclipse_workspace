package jungsuk06;

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
		int result = this.kor + this.eng + this.math;
		float average = (float) result / 3;
		return (Math.round(average*100)/100);
	}
	
	String info() {
		return (this.name+","+this.ban+","+this.no+","+this.kor+","+this.eng+","+this.math+","+this.getTotal()+","+this.getAverage());
	}
}

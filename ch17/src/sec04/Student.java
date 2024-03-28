package sec04;

public class Student implements Comparable<Student>{

	private String name;
	private String gender;
	private int score;
	
	
	
	public Student(String name,String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}
	
	
	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	@Override
	public int compareTo(Student stu) {
		return Integer.compare(this.score, stu.score);
	}
	
	
	
	
}

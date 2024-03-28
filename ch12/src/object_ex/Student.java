package object_ex;

public class Student {

	private int no;
	
	private String name;
	
	public Student(int no, String name) {
	 super();
	 this.no=no;
	 this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}
	
	
}

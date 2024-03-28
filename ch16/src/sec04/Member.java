package sec04;

public class Member {

	private String id;
	private String name;
	
	public Member() {
	
	}
	
	public Member(String id) {
		super();
		this.id = id;
	}
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
	
	
}

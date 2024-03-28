package object_ex;

public class Member {

	String id;
	
	public Member() {
		
	}
	
	public Member(String id) {
		super();
		this.id=id;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		if(obj instanceof Member member) {
			if(this.id.equals(member.id)) {
				return true;
			}
		}
		return false;
		
	}
	
}

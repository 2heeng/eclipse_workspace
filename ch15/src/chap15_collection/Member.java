package chap15_collection;

public class Member {
	String name;
	int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member member) {
			if (member.name.equals(this.name) && (member.age == this.age)) {
				return true;

			}
		}

		return false;
	}

}

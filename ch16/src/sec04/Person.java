package sec04;

public class Person {

	Member getMember(Creatable1 creatable1) {
		Member m1=creatable1.create("hong");
		return m1;
	}
	
	Member getMember2(Creatable2 creatable2) {
		Member m1=creatable2.create("hong","길동");
		return m1;
	}
	

}

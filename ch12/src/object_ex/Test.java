package object_ex;

public class Test {

	public static void main(String[] args) {
		
		Member obj1=new Member("blue");
		Member obj2=new Member("blue");
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(obj2.hashCode());
		
		System.out.println("-------------------------");

		//System.out.println(obj1==obj2);
		
		System.out.println(obj1.equals(obj2));
	}

}

package inheritance2;

public class ChildTest2 {

	public static void main(String[] args) {
		//강제형변환
		
		
		//첫번째 
//		Parent parent=new Parent();
//		System.out.println(parent);
//		// Child child=parent;
//		Child child = null;
//		System.out.println(child);
//		System.out.println("=============================");
//		child=(Child)parent;
//		System.out.println(child); 
//		//오류남
		
		//두번째
		//자식 타입 변수 = (자식타입)부모타입 객체;
		Child child2=new Child();
		System.out.println(child2);
		Parent parent2=null;
		parent2=child2;
		System.out.println(parent2);
		Child child3=(Child)parent2;
		child3.method3();
		
		
		
	}

}

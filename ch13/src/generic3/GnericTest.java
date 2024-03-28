package generic3;

public class GnericTest {

	//메서드(기능)는 선언부와 구현부
	//선언부에는 리턴타입(기본형, 참조형-배,열,클,인),메서드명+(매개변수(기,참))
	
	
	
	
	//제너릭 메소드 선언
	static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setContent(t);
		return box; 
	}
	
	
	
	
	public static void main(String[] args) {
	
	Box<String> box = new Box<String>();
	
	box.setContent("apple");
	
	String content = box.getContent();
	
	System.out.println(content);
	
	System.out.println("============================");
	
	Box<Integer> box1=boxing(100);
	int cnt=box1.getContent();
	System.out.println(cnt);
	
	Box<String> box2=boxing("apple");
	String cnt2=box2.getContent();
	System.out.println(cnt2);
	
	}

}

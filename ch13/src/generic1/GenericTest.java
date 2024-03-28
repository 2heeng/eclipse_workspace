package generic1;

public class GenericTest {

	public static void main(String[] args) {
		//Box box = new Box();
		
		Box<String> box = new Box<String>();
		box.content="hi";
		
		Box<Integer> box2 = new Box<Integer>();
		box2.content=1;
		
		
	}

}

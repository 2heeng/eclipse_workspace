package inheritance;

public class EagleEx {

	public static void main(String[] args) {
		Eagle eagle=new Eagle("육식", 100);
		
		eagle.fly(eagle.food, eagle.big);
	}

}

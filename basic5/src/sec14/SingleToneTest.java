package sec14;

public class SingleToneTest {

	public static void main(String[] args) {
		
		SingleTone obj=SingleTone.getInstance();
		System.out.println(obj);
		SingleTone obj2=SingleTone.getInstance();
		System.out.println(obj2);
	}

}

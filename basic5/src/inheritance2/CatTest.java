package inheritance2;

public class CatTest {

	public static void main(String[] args) {
		// 부모타입 변수 = 자식타입 객체 ; 자동형변환이 일어남.
		Cat cat = new Cat();
		System.out.println(cat);
		Animal animal = cat;
		System.out.println(animal);//상속관계가 없을때는 형변환이 안돼서 오류남.
		
		

	}

}

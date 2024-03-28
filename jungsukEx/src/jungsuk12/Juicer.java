package jungsuk12;

public class Juicer {

	//리턴타입앞에 <>기호 추가하고 타입파라미터 정의 후 리턴타입과 매개변수 타입에서 사용 가능
	static <T extends Fruit> String makeJuice(FruitBox<T> box) {
		String tmp = "";
		for (Fruit f : box.getList())
			tmp += f + "   ";
		return tmp;
	}

//	static <T extends Fruit> String make(FruitBox<T> box) {
//		
//		
//		return null;
//	}
	
	
}

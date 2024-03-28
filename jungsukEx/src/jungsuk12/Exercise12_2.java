package jungsuk12;

public class Exercise12_2 {

	public static void main(String[] args) {
		//Juicer.<Apple>makeJuice(new   FruitBox<Fruit>());
		//Juicer.<Fruit>makeJuice(new   FruitBox<Grape>());
		Juicer.<Fruit>makeJuice(new   FruitBox<Fruit>());
		Juicer.makeJuice(new   FruitBox<Apple>());
		//Juicer.makeJuice(new   FruitBox<Object>()); //<>안에는 Fruit와 그 아래 자식클래스만 가능

	}

}

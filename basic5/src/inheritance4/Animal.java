package inheritance4;

public abstract class Animal {
	
	//Animal이 부모 Bird,Fish,Insect가 자식
	
	//메소드(함수)는 두 부분으로 나뉜다. 
	//선언(정의)과 구현(실체)
	//선언부 void sound()
	//구현부 { 여기 }
	
	//구현(실체)부가 없는 메소드를 추상(abstract)메소드라고 한다. 
	
	//추상메소드가 있는 클래스는 추상 클래스여야 한다.
	abstract void sound(); 
		
	
}

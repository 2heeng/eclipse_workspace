package sec01;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		//람다식의 중괄호는 생략할 수 있지만 헷갈리기때문에 하지 않겠음. 
		//1.매개변수 X, return X
//		p1.action(
//			()->{
//				System.out.println("1.일한닥");
//			}	
//		
////			()->
////				System.out.println("일한닥")
//				);
//		
		//2.매개변수 O, return X
//		p1.action(
//				(gift)->{
//					System.out.println(gift);
//				}
//				);
		
		//3.매개변수X, return O
//		p1.action(
//				()->{
//					return "쿠키";
//				}
//				);
		
		
		
		//4.매개변수 O, return O
		p1.action(
				(gift)->{
					System.out.println(gift);
					return "쿠키";
				}
				);

	}

}

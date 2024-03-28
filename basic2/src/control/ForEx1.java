package control;

public class ForEx1 {

	public static void main(String[] args) {
		
		//hi를 3번 찍으려면?
		
//		System.out.println("hi");
//		System.out.println("hi");
//		System.out.println("hi");
		
		//반복할 횟수를 알고 찍는 경우 for문을 사용하자
		
		// 3반복할 거임. -> 정수. 3번이라는 정수값을 저장할 방 이름을 지어주어야 함.
		//무조건 그 방이름은 i로 할 것. i는 색인index를 의미
		//색인(순서를 매겨서 찾아간다) 몇번째
		//어딘가에 이 방(변수명)을 초기화 해놔야 함
		//for(초기화;조건;증가값)
		
		for(int i=0;i<3;i++) {
			System.out.println("hi");
		}
			System.out.println("for밖의 영역");
	}

}

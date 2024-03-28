package exam02_2;

public class ClassA {

	//필
	//생
	//메 - 메소드 안의 영역은 로컬영역, 그 안에 있는 클래스는 로컬클래스, 안에 있는 변수는 로컬변수
	void method1(int num1) {
		//매개변수 num1은 메소드 영역안에서만 사용 가능한 로컬변수이다. 
		int num2=3;
		//로컬변수를 로컬클래스에서 사용할 경우 로컬 변순ㄴ final특성을 갖는다. 
		//값을 읽기만 하고 수정할 수 없다. 이것은 로컬클래스 내부에서 값을 변경하지 못하도록 제한하기 때문
		System.out.println(num2 + "는 지역변수");
		
		System.out.println(num1+ "는 매개변수이자 지역변수");
		
		//로컬클래스
		class B {
			
			void method2() {
				// num2=8; 로컬변수 값을 수정할 수 없다
				System.out.println(num2);
			}
		}
		
		B b=new B();
		b.method2();
		
		
	}

} //Aclass

package interfaceEx;

public interface Service {

	//상수 필드
	
	
	//추상 메소드
	
	
	//디폴트 메소드
	default void defaultMethod1() {
		System.out.println("default1 종속 코드");	
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("default2 종속 코드");	
		defaultCommon();
		}
	
	private void defaultCommon() {
		System.out.println("defaultCommon 중복 코드 A");
		System.out.println("defaultCommon 중복 코드 B");
	}
	
	//정적 메소드
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
		staticCommon();
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
		staticCommon();
	}
	
	private static void staticCommon() {
		System.out.println("staticCommon 종속 코드 C");
		System.out.println("staticCommon 종속 코드 D");
	}
	
	
	
	
}

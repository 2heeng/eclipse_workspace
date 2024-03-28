package interfaceEx2;

public class TestABC {

	public static void main(String[] args) {
		InterfaceCImpl interfaceImpl=new InterfaceCImpl();
		
		InterfaceA ia=interfaceImpl;
		ia.methodA();
		System.out.println("=========================");
		InterfaceB ib=interfaceImpl;
		ib.methodB();
		// ib.methodA();
		System.out.println("=========================");
		InterfaceC ic=interfaceImpl;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}

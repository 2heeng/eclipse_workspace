import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		//입력을 하기위해서 scanner라는 클래스(틀)을 이용해야 한다.
		
		//클래스(틀)에서 객체를 만드는 행위를 한 후에 거기서 만들어진 그 객체를 가지고 입력을 해야한다.
		
		//어떤 새로운 공간(new)에 만들고 나면 결국 변수에 주소값을 저장하는 행위(=)를 해야 함.
		//만들 때 어떤 인수를 넣어주고 만들어야 할 때도 있다.(System.in이라는 입력장치, 스트림)
		Scanner scn=new Scanner(System.in);
		
//		String value2 = scanner.next();
//		System.out.println("============");
//		System.out.println(value2);
		
		
		int value3 = scn.nextInt();
		System.out.println("============");
		System.out.println(value3 + 1);
		
//		String value = scanner.next();
//		int num=Integer.parseInt(value);
//		System.out.println(num);

		
	}

}

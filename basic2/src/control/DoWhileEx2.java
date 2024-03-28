package control;

import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print("hi");
			inputString=scanner.nextLine();
			System.out.println(inputString);
			
		} while(! inputString.equals("q"));
	}


}

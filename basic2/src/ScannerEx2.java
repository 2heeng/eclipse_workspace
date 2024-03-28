import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
        String name = scanner.next();

        // 정수 입력 받기
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        // 실수 입력 받기
        System.out.print("평균 성적을 입력하세요: ");
        double averageGrade = scanner.nextDouble();

        // 입력 받은 정보 출력
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("평균 성적: " + averageGrade);

	}

}

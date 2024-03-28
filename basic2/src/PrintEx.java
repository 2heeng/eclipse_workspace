
public class PrintEx {

	public static void main(String[] args) {
		
		System.out.printf("%d", 1); //digit 숫자
		System.out.println();
		System.out.printf("이것은 %d 입니다", 1);
		System.out.println();
		System.out.printf("이것은 %s 입니다\n", 'a'); //char, string 다 가능
		System.out.printf("이것은 %c 입니다\n", 'a');
		System.out.printf("이것은 %f 입니다\n", 3.14); // 실수는 d라고 쓰면 digit과 혼동되어 f(float)라고씀

		System.out.printf("숫자는 %d이고 문자는 %s 입니다", 3 , 'A'); //여러개도 가능
		
		System.out.printf("이것은 %.2f 입니다\n", 3.56389); // 반올림하여 소수점 두번째자리까지 나타냄.
		System.out.printf("이것은 %.2f 입니다", 3.56689);
	}

}

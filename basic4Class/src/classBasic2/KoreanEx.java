package classBasic2;

public class KoreanEx {

	public static void main(String[] args) {
		
//		Korean kor1=new Korean();
//		kor1.nation="대한민국";
//		System.out.println(kor1.nation);
//		
//		Korean kor2=new Korean("대한민국");
//		System.out.println(kor2.nation);

		Korean kor3=new Korean();
		System.out.println(kor3.nation);
		
		Korean kor4=new Korean("홍사동","920506");
		System.out.println("국적은 " +kor4.nation + " 이름은 " + kor4.name + " 생년월일은 " + kor4.ssn);
	}

}

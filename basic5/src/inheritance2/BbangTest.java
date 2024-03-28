package inheritance2;

public class BbangTest {

	public static void main(String[] args) {
		
		// Jasik jasik=
		Bumo bumo = new Jasik();
//		Bumo bumo2=new Bumo();
		Jasik jasik = (Jasik)bumo;
		jasik.bbang="크림빵";
		jasik.eat();
		System.out.println(bumo);
		
		Jasik jasik2=new Jasik();
		jasik2.bbang="소보루";
		jasik2.eat();
		
		System.out.println("==============================");
		if (jasik instanceof Bumo) {
            System.out.println("jasik 변수는 Bumo 타입입니다.");
        }else {
        	System.out.println("jasik 변수는 Jasik 타입입니다.");
        }

        if (jasik2 instanceof Jasik) {
            System.out.println("jasik2 변수는 Jasik 타입입니다.");
        }else {
        	System.out.println("jasik2 변수는 Jasik 타입이 아닙니다.");
        }
	}

}

package control;

public class Practice2 {

	public static void main(String[] args) {
		
		//if문
		int score= 87;
		if(score>=90) {
			System.out.println("A");
		} else if(score>=80) {
			System.out.println("B");
		} else if(score>=70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}

		//for문
		for(int i=0;i<3;i++) {
			System.out.println("hi");
		} 
		
		//switch문
		switch(1) {
		case 1:
			System.out.println("감자튀김");
			break;
		case 2:
			System.out.println("치즈스틱");
			break;
		case 3:
			System.out.println("소프트콘");
			break;
		default : 
				System.out.println("메뉴를 입력해주세요");
		}
		
		//while문
		int i2=0;
		while(i2<3) {
			
			System.out.println("hello");
			i2++;
		}
		
		//break문
		
		for(int i3=0;i3<10;i3++) {
			System.out.println("안녕");
			if(i3==5) {
				break;
			}
		}
		
		//continue문
		
		for(int i4=0;i4<10;i4++) {
			
			if(i4%2!=0) {
				continue;
			} System.out.printf("%d(은)는 짝수다\n",i4);
		}
		
	}	

}

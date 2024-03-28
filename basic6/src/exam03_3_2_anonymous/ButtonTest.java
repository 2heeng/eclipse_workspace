package exam03_3_2_anonymous;

import exam03_3_2_anonymous.Button.ClickListener;

public class ButtonTest {

	public static void main(String[] args) {
		//버튼을 만들어야 클릭을 할 수 있음
		
		Button button1 = new Button();
		
		ClickListener clickListener = null;
		//1버전에서는 인터페이스(ClickListener)를 구현하는 클래스를 선언하고 그 클래스 객체를 만들어서 사용
		//이번에는 익명객체를 만들어서 사용하겠다
		//익명 객체도 클래스는 있어야 함, 단지 클래스 이름이 익명
		
		
		button1.setClickListener(new ClickListener() {

			@Override
			public void onClick() {
				System.out.println("Button Click");
				
			}});
		
		button1.click();
		
	}

}

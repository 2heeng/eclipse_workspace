package exam03_4_2_anonymous;

import exam03_4_2_anonymous.Button.ClickListener;

public class ButtonTest {

	public static void main(String[] args) {
		
		Button button = new Button();
		
		// ClickListener clickListener = null;
		
		button.setClickListener(new ClickListener() {

			@Override
			public void onClick() {
				System.out.println("button ok");
				
			}});
		button.click();

	}

}

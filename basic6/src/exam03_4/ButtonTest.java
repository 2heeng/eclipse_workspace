package exam03_4;

public class ButtonTest {

	public static void main(String[] args) {
		
		class OkButton implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("OK Button");
				
			}
		}
		Button button = new Button();
		Button.ClickListener clickListener = new OkButton();
		button.setClickListener(clickListener);
		button.click();

	}

}

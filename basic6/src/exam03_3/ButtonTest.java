package exam03_3;

import exam03_3.Button.ClickListener;

public class ButtonTest {

	public static void main(String[] args) {
		//버튼을 만들어야 클릭을 할 수 있음
		
		Button button = new Button();
		
		//ok버튼 클릭 이벤트를 처리할 ClickListner 구현 클래스

		//로컬클래스
		class OkClickListner implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("OK BUTTON");
			}
		}
		
		ClickListener clickListener = new OkClickListner();
		button.setClickListener(clickListener);
		
		button.click();
		
		
		System.out.println("================================");
		
		//로컬클래스(ClickListener 인터페이스를 구현한 CancelClickListener)
		
		class CancelClickListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("cancel");
				
			}
			
		}
		
		Button cancelButton = new Button();
		
		cancelButton.setClickListener(new CancelClickListener());
		
		cancelButton.click();
		
		
	}

}

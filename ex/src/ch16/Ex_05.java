package ch16;

public class Ex_05 {

	public static void main(String[] args) {
		Button btnOk = new Button();
		
		btnOk.setClickListener(
				()->{System.out.println("ok 버튼");}
				);
		btnOk.click();
				

		Button btnCancel = new Button();
		btnCancel.setClickListener(
				()->{System.out.println("Cancel 버튼");}
				);
		btnCancel.click();
	}

}

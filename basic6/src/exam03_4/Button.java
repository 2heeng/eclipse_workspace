package exam03_4;

public class Button {

	//필
	private ClickListener clickListener;
	//생
	//메
	public void setClickListener(ClickListener clickListener) {
		this.clickListener=clickListener;
	} 
	
	
	void click() {
		this.clickListener.onClick();
	}
	//클
	//인
	static interface ClickListener {
		
		//상
		//추
		abstract void onClick();
		
		//디
		//정
		

	}

	
	
}

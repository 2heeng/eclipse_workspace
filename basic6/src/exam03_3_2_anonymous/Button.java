package exam03_3_2_anonymous;

public class Button {

	// 필
	//포함관계
	private ClickListener clickListener;
	
	// 생

	// 메
	//이벤트 등록
	public void setClickListener(ClickListener clickListener) {
		this.clickListener=clickListener;
	}
	//클릭
	void click() {
		this.clickListener.onClick();
	}
	
	
	// 클

	// 인
	//인터페이스를 클릭할 셩우 일어날(Listen) 일에 대한 이벤트를 인터페이스로 선언
	interface ClickListener{
		//추살메소드
		abstract void onClick();
	}
	
}

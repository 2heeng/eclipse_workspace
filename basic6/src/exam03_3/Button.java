package exam03_3;

public class Button {

	// 필
	private ClickListener clickListener;

	// 생

	// 메
	// 이벤트 등록(set)하는 메소드
	public void setClickListener(ClickListener clickListner) {
		this.clickListener = clickListner;
	}

	// 클릭을 실행하는 메소드
	void click() {
		this.clickListener.onClick();
	}

	// 클

	// 인
	static interface ClickListener {
		// 상

		// 추
		abstract void onClick(); // 클릭이 되었을때 라는 함수
		
		// 디

		// 정

	}

}

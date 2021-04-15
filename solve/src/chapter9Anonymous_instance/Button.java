package chapter9Anonymous_instance;


public class Button {
OnClickListener listener; // 인터페이스 타입 필드
	
	void setOnClickListner(OnClickListener listener) { // 매개 변수의 다형성
		this.listener = listener; // OnClickListener를 구현한 객체면 뭐든 들어올 수 있으니
	}
	
	void touch() { // 구현 객체의 onClick()메소드 호출
		listener.onClick();
	}
	
	interface OnClickListener{ //중첩 인터페이스
		void onClick();
	}
}

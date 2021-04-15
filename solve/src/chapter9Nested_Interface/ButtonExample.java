package chapter9Nested_Interface;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		CallListener call = new CallListener();
		btn.setOnClickListner(call); // Button.OnClickListener listener = new CallListener();
		btn.touch();  // 전화를 검
		
		MissileListener missile = new MissileListener();
		btn.setOnClickListner(missile);
		btn.touch(); // 미사일 쏨
		
		
	}

}

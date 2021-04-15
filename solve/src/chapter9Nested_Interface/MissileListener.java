package chapter9Nested_Interface;

public class MissileListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("한석원이 미사일 버튼을 누릅니다.");
	}
	
}

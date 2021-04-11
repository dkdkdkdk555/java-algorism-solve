package chapter6Class_annotation;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		//Service클래스로부터 메소드 정보를 얻음
		Method[] declaredMethods = Service.class.getDeclaredMethods(); // Service 클래스에 선언된 메소드 얻기(리플렉션)
		
		//Method 객체를 하나씩 처리
		for(Method method : declaredMethods) {
			//PrintAnnotation 이 적용되었는지 확인
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//PrintAnnotation 객체 얻기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				//메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				//구분선 출력
				for(int i =0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					method.invoke(new Service());
				} catch (Exception e) {
					System.out.println();
				}
			}
		}
		
	}
}

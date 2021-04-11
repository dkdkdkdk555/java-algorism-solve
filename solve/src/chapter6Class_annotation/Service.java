package chapter6Class_annotation;

public class Service { //어노테이션 적용 클래스
	@PrintAnnotation
	public void method1() {
		System.out.println("실행내용1");
	}
	
	@PrintAnnotation("*") 
	public void method2() {
		System.out.println("실행내용2");
	}
	
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("실행내용3");
	}

}

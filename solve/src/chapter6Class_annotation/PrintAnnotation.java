package chapter6Class_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
/*
 👀 Annotation 은 metadata라고 볼 수 있다. <= 컴파일 과정과 실행 과정에서 코드를 어떻게 컴파일하고 처리할 것인지를 알려주는 정보이다.

 👀 Annotation의 용도
		1. 컴파일러에게 코드문법에러를 체크하도록 정보를 제공 ex) @Override
		2. 소프트웨어 개발 툴이 빌드나 배치 시 코드를 자동으로 생성할 수 있도록 정보를 제공
		3. 실행 시(런타임 시) 특정 기능을 실행하도록 정보를 제공

 👀 Annotation 타입 정의와 적용
	 	 정의	=> public @interface AnnotaionName { } 
	 	 적용 => @AnnotationName
 
 👀 Annotation은 엘리먼트 element를 멤버로 가질 수 있다. 각 엘리먼트는 타입과 이름으로 구성되며, 디폴트 값을 가질 수 있다.
 
	 	정의 => public @interface AnnotationName {
	 		타입 elementName() default 값;
	 	   }
	 	   
		적용 => @AnnotationName(elementName="값"); 
		
		또 Annotation은 기본 엘리먼트인 value를 가질 수 있다. value엘리먼트를 가진 어노테이션은 코드에서 적용할 때 값만 기술할 수 있다.
			=> @Annotation("값");
		만약  value 엘리먼트와 다른 엘리먼트의 값을 동시에 주고 싶다면 정상적인 방법으로 지정하면 된다.
			=> @Annotation(value="값", elementName=3);

 👀 Annotation의 적용 대상 --> java.lang.annotation.ElementType 열거 상수로 정의되어 있다.
		TYPE클래스, 인터페이스, 열거타입, ANNOTATION_TYPE 어노테이션, FIELD 필드, CONSTRUCTOR 생성자, METHOD 메소드,
		LOCAL_VARIABLE 로컬 변수, PACKAGE 패키지

 👀 어노테이션이 적용될 대상을 지정할 때는 @Target 어노테이션을 사용한다. 
		@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD}) //열거상수로 적용대상 지정
		public @interface AnnotationName { }
	
		--> 위에서 정의한 AnnotationName 어노테이션은 클래스, 필드, 메소드에만 적용할 수 있고 생성자는 적용할 수 없다. 

 👀 어노테이션 유지 정책 
 	어노테이션 사용용도에 따라 정의한 어노테이션을 어느 범위까지 유지할 것인지 지정해야 한다.
 	소스상에만 유지할 건지, 컴파일된 클래스까지 유지할 건지, 런타임 시에도 유지할 건지를 지정해야 한다. 
 	어노테이션 유지정책은 java.lang.annotation.RetentionPolicy 열거 상수로 다음과 같이 정의되어 있다. 
 	
 	SOURCE  : 소스상에서만 어노테이션 정보를 유지한다. (바이트 코드 파일에는 정보가 남지 않는다.)
 	CLASS : 바이트 코드 파일까지 어노테이션 정보를 유지한다. (리플렉션을 이용해서 어노테이션 정보를 얻을 수는 없다.)
 	RUNTIME : 바이트 코드 파일까지 정보를 유지하면서 리플렉션을 이용해서 런타임 시에 어노테이션 정보를 얻을 수 있다.
 	
 	리플렉션 이란 ? 
 		런타임 시에 클래스의 메타정보를 얻는 기능을 말한다. (클래스가 가지고 있는 필드가 뭔지, 어떤 생성자를 갖고 있는지, 어떤 메소드를 가지는지, 적용된 어노테이션은 무엇인지 알아내는것)
 	
 	지정 => @Rentention(RetetionPolicy.RUNTIME) 으로 지정한다. (Retention.열거상수)
 		@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD}) 
 		@Rentention(RetetionPolicy.RUNTIME)
		public @interface AnnotationName { }

👀 런타임 시 어노테이션 정보 사용하기 
	런타임 시에 어노테이션이 적용되었는지 확인하고 엘리먼트값을 이용해서 특정 작업을 수행하는 방법
	
	클래스에 적용된 어노테이션 정보얻기 => java.lang.Class 이용
	필드 생성자 메소드에 적용된 어노 정보 얻기 => java.lang.reflect 패키지 의 Field, Constructor, Method 타입의 배열 얻기 
	getFields(), getConstructor(), getDeclaredMethods() // 각각의 정보를 배열로 리턴
	
	그 다음, Class, Field, Constructor, Method가 가지고 있는 다음 메소드를 호출해서 적용된 어노테이션 정보를 얻을 수 있다.
	isAnnotationPreset(클래스이름) -> return 타입= 불리언
	getAnnotation(클래스이름) -> 지정한 어노테이션이 적용되있으면 어노테이션 리턴, 그렇지 않다면 null
	getAnnotations() -> 지정된 모든 어노를 리턴 (배열로 리턴)
	getDeclaredAnnotations() -> 직접 적용된 모든 어노를 리턴한다.

*/

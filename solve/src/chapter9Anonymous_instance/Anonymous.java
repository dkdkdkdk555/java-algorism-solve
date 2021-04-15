package chapter9Anonymous_instance;

public class Anonymous {
	//필드 초기값으로 대입
	Person field = new Person() {
		void work() {
			System.out.println("개나 말의 수고로움을 마다하지 않겠습니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		};
	};
	
	void method1() {
		//로컬 변수값으로 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			
			void wake() {
				System.out.println("7시에 일어나 재끼라웃");
				walk();
			};
		};
		
	//로컬 변수 사용
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}

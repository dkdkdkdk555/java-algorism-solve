package collectionFramework.set;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age==age);
			// Member객체의 이름과 나이가 같으면 같은 객체다 
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() { // name과 age 값이 같으면 동일한 hashCode가 리턴
		/*
		 	name.hashCode()는  name의 타입이 스트링이니까 문자열만 같으면
		 	같은 hashcode()를 리턴하기 때문에 거기에 나이 더하면 
		 	나이와 이름 같으면 동등한 객체다.
		 */
		return name.hashCode() + age; // String의 hashCode()를 이용 
	}
}

package collectionFramework.set;

import java.util.*;

public class HashSetExmaple {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("장코크", 30));
		set.add(new Member("장코크", 30));
		
		System.out.println("총 객체수 : " + set.size());
		
	}
}
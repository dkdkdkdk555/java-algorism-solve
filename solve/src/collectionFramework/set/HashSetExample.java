package collectionFramework.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 중복되는건 저장되지 않았다.
		/*
		 	String 클래스에서 객체(Object의) HashCode()와 equals()를 
		 	재정의 했기 때문에 String 객체는 단순 문자열만 같아도 '동일한 객체' 로 인정된다.
		 */
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총갯수: " + size);
		
		Iterator<String> iterator = set.iterator(); //반복자 얻기
		while(iterator.hasNext()) { // set객체에 저장된 객체가 존재한다면
			String element = iterator.next();
			System.out.println("\t" + element);
			
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총갯수: " + set.size());
		
		iterator = set.iterator(); //반복자 얻기
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) { System.out.println("beer 있음");}
	}
}

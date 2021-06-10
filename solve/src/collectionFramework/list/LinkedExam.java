package collectionFramework.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedExam {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("가");
		list.add("나");
		list.add("다");
		list.add("라");
		list.add("마");
		list.add("바");
		list.add("사");
		
		list.remove(2);
		list.remove(2);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
	}
}

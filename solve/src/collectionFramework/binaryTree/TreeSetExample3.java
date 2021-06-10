package collectionFramework.binaryTree;

import java.util.*;

public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("people");
		treeSet.add("apple");
		treeSet.add("batman");
		treeSet.add("catWoman");
		treeSet.add("druking");
		treeSet.add("element");
		treeSet.add("falcon");
		treeSet.add("governer");
		
		System.out.println("[b-f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("b", true, "f", true);
		for(String word : rangeSet) {
			System.out.println(word);
		}
	}
}

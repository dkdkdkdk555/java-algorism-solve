package collectionFramework.binaryTree.compare;
import java.util.*;
public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("장코크", 45));
		treeSet.add(new Person("김규한", 26));
		treeSet.add(new Person("권진영", 30));
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + " : " + person.age);
		}
	}
}

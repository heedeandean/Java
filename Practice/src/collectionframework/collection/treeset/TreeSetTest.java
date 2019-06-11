package collectionframework.collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("김일수");
		treeSet.add("김이수");
		treeSet.add("김삼수");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}
}

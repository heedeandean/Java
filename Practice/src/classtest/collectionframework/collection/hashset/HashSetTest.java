package classtest.collectionframework.collection.hashset;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add(new String("김일수"));
		h.add(new String("김이수"));
		h.add(new String("김삼수"));
		h.add(new String("김사수"));
		h.add(new String("김사수"));
		
		System.out.println(h);
	}
}

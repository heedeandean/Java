package classtest.arraylist2;

import java.util.ArrayList;

public class DogArrayList {

	public static void main(String[] args) {
		
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		
		dogList.add(new Dog("모모", "웰시코기"));
		dogList.add(new Dog("라라", "불독"));
		dogList.add(new Dog("포포", "시바견"));
		
		for(int i=0; i<dogList.size(); i++) {
			System.out.println(dogList.get(i).showDogInfo());
		}
		
		System.out.println();
		System.out.println("=======향상된 for문=======");
		
		for(Dog dog : dogList) {
			System.out.println(dog.showDogInfo());
		}
	}
}

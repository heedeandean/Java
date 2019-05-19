package classtest.arraylist2;

import java.util.ArrayList;

public class DogArrayList {

	public static void main(String[] args) {
		
		ArrayList<Dog> dog = new ArrayList<Dog>();
		
		dog.add(new Dog("모모", "웰시코기"));
		dog.add(new Dog("라라", "불독"));
		dog.add(new Dog("포포", "시바견"));
		
		for(int i=0; i<dog.size(); i++) {
			System.out.println(dog.get(i).showDogInfo());
		}
		
		System.out.println();
		System.out.println("=======향상된 for문=======");
		
		for(Dog dogs : dog) {
			System.out.println(dogs.showDogInfo());
		}
	}
}

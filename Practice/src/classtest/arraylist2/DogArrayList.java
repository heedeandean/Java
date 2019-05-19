package classtest.arraylist2;

import java.util.ArrayList;

public class DogArrayList {

	public static void main(String[] args) {
		
		ArrayList<Dog> dog = new ArrayList<Dog>();
		
		dog.add(new Dog("���", "�����ڱ�"));
		dog.add(new Dog("���", "�ҵ�"));
		dog.add(new Dog("����", "�ùٰ�"));
		
		for(int i=0; i<dog.size(); i++) {
			System.out.println(dog.get(i).showDogInfo());
		}
		
		System.out.println();
		System.out.println("=======���� for��=======");
		
		for(Dog dogs : dog) {
			System.out.println(dogs.showDogInfo());
		}
	}
}

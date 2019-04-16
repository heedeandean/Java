package classtest.arraylist2;

import java.util.ArrayList;

public class DogArrayList {

	public static void main(String[] args) {
		
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		
		dogList.add(new Dog("���", "�����ڱ�"));
		dogList.add(new Dog("���", "�ҵ�"));
		dogList.add(new Dog("����", "�ùٰ�"));
		
		for(int i=0; i<dogList.size(); i++) {
			System.out.println(dogList.get(i).showDogInfo());
		}
		
		System.out.println();
		System.out.println("=======���� for��=======");
		
		for(Dog dog : dogList) {
			System.out.println(dog.showDogInfo());
		}
	}
}

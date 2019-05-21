package test;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Dog> dog = new ArrayList<Dog>();
		
		dog.add(new Dog("���ϼ�", "����"));
		dog.add(new Dog("���̼�", "Ǫ��"));
		dog.add(new Dog("����", "�ڽ���Ʈ"));
		
		for(int i=0; i<dog.size(); i++) {
			System.out.println(dog.get(i).showDogInfo());
		}
		
		System.out.println();
		
		for(Dog dogs : dog) {
			System.out.println(dogs.showDogInfo());
		}
	}
}

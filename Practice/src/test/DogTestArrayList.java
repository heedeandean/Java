package test;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Dog> dog = new ArrayList<Dog>();
		
		dog.add(new Dog("±èÀÏ¼ö", "Æ÷¸Þ"));
		dog.add(new Dog("±èÀÌ¼ö", "Çªµé"));
		dog.add(new Dog("±è»ï¼ö", "´Ú½ºÈÆÆ®"));
		
		for(int i=0; i<dog.size(); i++) {
			System.out.println(dog.get(i).showDogInfo());
		}
		
		System.out.println();
		
		for(Dog dogs : dog) {
			System.out.println(dogs.showDogInfo());
		}
	}
}

package hello;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> d = new ArrayList<Dog>();
		
		d.add(new Dog("김일수", "1"));
		d.add(new Dog("김이수", "2"));
		d.add(new Dog("김삼수", "3"));
		d.add(new Dog("김사수", "4"));
		d.add(new Dog("김오수", "5"));
		
		for(int i=0; i<d.size(); i++) {
			System.out.println(d.get(i).showDogInfo());
		}
		System.out.println();
		for(Dog d1 : d) {
			System.out.println(d1.showDogInfo());
		}
	
	}

}

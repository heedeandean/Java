package classtest.arraylist2;

public class DogArray {

	public static void main(String[] args) {
		
		Dog[] dog = new Dog[3];
		
		dog[0] = new Dog("모모", "웰시코기");
		dog[1] = new Dog("라라", "불독");
		dog[2] = new Dog("포포", "시바견");
		
		for(int i=0; i<dog.length; i++) {
			System.out.println(dog[i].showDogInfo());
		}
		
		System.out.println();
		System.out.println("=======향상된 for문=======");
		
		for(Dog dogs : dog) {
			System.out.println(dogs.showDogInfo());
		}
	}
}

package classtest.arraylist2;

public class DogArray {

	public static void main(String[] args) {
		
		Dog[] dogList = new Dog[3];
		
		dogList[0] = new Dog("모모", "웰시코기");
		dogList[1] = new Dog("라라", "불독");
		dogList[2] = new Dog("포포", "시바견");
		
		for(int i=0; i<dogList.length; i++) {
			System.out.println(dogList[i].showDogInfo());
		}
		
		System.out.println();
		System.out.println("=======향상된 for문=======");
		
		for(Dog dog : dogList) {
			System.out.println(dog.showDogInfo());
		}
	}
}

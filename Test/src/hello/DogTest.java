package hello;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dogArray = new Dog[5];
		dogArray[0] = new Dog("김일수", "1");
		dogArray[1] = new Dog("김이수", "2");
		dogArray[2] = new Dog("김삼수", "3");
		dogArray[3] = new Dog("김사수", "4");
		dogArray[4] = new Dog("김오수", "5");
		
		for(int i=0; i<dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		System.out.println();
		
		for(Dog d : dogArray) {
			System.out.println(d.showDogInfo()); 
		}
		
	}

}

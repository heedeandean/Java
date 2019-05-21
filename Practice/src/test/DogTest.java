package test;

public class DogTest {

	public static void main(String[] args) {

		Dog[] dog = new Dog[3];
		
		dog[0] = new Dog("±èÀÏ¼ö", "Æ÷¸Þ");
		dog[1] = new Dog("±èÀÌ¼ö", "Çªµé");
		dog[2] = new Dog("±è»ï¼ö", "´Ú½ºÈÆÆ®");
		
		for(int i=0; i<dog.length; i++) {
			System.out.println(dog[i].showDogInfo());
		}
		
		System.out.println();
		
		for(Dog dogs : dog) {
			System.out.println(dogs.showDogInfo());
		}
	}

}

package classtest.arraylist2;

public class DogArray {

	public static void main(String[] args) {
		
		Dog[] dog = new Dog[3];
		
		dog[0] = new Dog("���", "�����ڱ�");
		dog[1] = new Dog("���", "�ҵ�");
		dog[2] = new Dog("����", "�ùٰ�");
		
		for(int i=0; i<dog.length; i++) {
			System.out.println(dog[i].showDogInfo());
		}
		
		System.out.println();
		System.out.println("=======���� for��=======");
		
		for(Dog dogs : dog) {
			System.out.println(dogs.showDogInfo());
		}
	}
}

package classtest.arraylist2;

public class DogArray {

	public static void main(String[] args) {
		
		Dog[] dogList = new Dog[3];
		
		dogList[0] = new Dog("���", "�����ڱ�");
		dogList[1] = new Dog("���", "�ҵ�");
		dogList[2] = new Dog("����", "�ùٰ�");
		
		for(int i=0; i<dogList.length; i++) {
			System.out.println(dogList[i].showDogInfo());
		}
		
		System.out.println();
		System.out.println("=======���� for��=======");
		
		for(Dog dog : dogList) {
			System.out.println(dog.showDogInfo());
		}
	}
}

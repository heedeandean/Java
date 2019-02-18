package test;

class Animal {
	public void move() {
		System.out.println("������ �����δ�~~");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �ȴ´�~~");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ȴ´�~~");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� ����~~");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		AnimalTest a = new AnimalTest();
		
		a.moveAnimal(new Human());
		a.moveAnimal(new Tiger());
		a.moveAnimal(new Eagle());
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}


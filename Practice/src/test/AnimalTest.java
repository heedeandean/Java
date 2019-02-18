package test;

class Animal {
	public void move() {
		System.out.println("동물이 움직인당~~");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 걷는당~~");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 걷는당~~");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 난당~~");
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


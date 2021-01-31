package hello;


class Animal {
	public void move() {
		System.out.println("동물 움직인당");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람 움직인당");
	}	
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이 움직인당");
	}		
}

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		t.moveAnimal(new Human());
		t.moveAnimal(new Tiger());
		t.moveAnimal(new Animal());
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}

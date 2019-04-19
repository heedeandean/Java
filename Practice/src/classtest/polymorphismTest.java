package classtest;

import java.util.ArrayList;

//���� Ŭ����
class Animal {
	public void move() {
		System.out.println("������ �����δ�.");
	}
}


//���� Ŭ����
class Human extends Animal {
	public void move() {
		System.out.println("����� �ι߷� �ȴ´�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �д´�.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ڴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���� �����.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ����.");
	}
	
	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư���.");
	}
}


public class polymorphismTest {
	ArrayList<Animal> aniList = new ArrayList<Animal>();

	public static void main(String[] args) {
		polymorphismTest atest = new polymorphismTest();
		atest.addAnimal();
		
		System.out.println();
		
		System.out.println("���� ������ �ٿ�ĳ���� : ");
		atest.testCasting();
	}
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani : aniList) {
			ani.move();
		}
	}
	
	// �ٿ�ĳ���� �ϴ� �޼���.
	public void testCasting() {
		for(int i=0; i<aniList.size(); i++) {
			Animal ani = aniList.get(i);
			
			if(ani instanceof Human) {
				Human h = (Human)ani;
				h.readBook();
			}
			else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			}
			else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			}
			else {
				System.out.println("�������� �ʴ� ���Դϴ�.");
			}
		}
	}
}
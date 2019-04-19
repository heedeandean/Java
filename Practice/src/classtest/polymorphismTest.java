package classtest;

import java.util.ArrayList;

//상위 클래스
class Animal {
	public void move() {
		System.out.println("동물이 움직인다.");
	}
}


//하위 클래스
class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷는다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽는다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네발로 뛴다.");
	}
	
	public void hunting() {
		System.out.println("호랑이 사냥중.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 난다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아간다.");
	}
}


public class polymorphismTest {
	ArrayList<Animal> aniList = new ArrayList<Animal>();

	public static void main(String[] args) {
		polymorphismTest atest = new polymorphismTest();
		atest.addAnimal();
		
		System.out.println();
		
		System.out.println("원래 형으로 다운캐스팅 : ");
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
	
	// 다운캐스팅 하는 메서드.
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
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}
}
package hello;


public class CarTest {

	public static void main(String[] args) {
		CarFactory f = CarFactory.getInstance();
		
		Car c1 = f.createCar("일수차");
		Car c2 = f.createCar("일수차");
		System.out.println(c1 == c2);
		
		Car avante1 = f.createCar("�¿���");
		Car avante2 = f.createCar("�¿���");
		System.out.println(avante1 == avante2); // true
		System.out.println(c1 == avante1); // false
	}

}

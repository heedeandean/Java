package test;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();

		Car c1 = factory.createCar();
		Car c2 = factory.createCar();

		System.out.println(c1.carNum);
		System.out.println(c2.carNum);
	}

}

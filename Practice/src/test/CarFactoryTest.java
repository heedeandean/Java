package test;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance(); // 싱글톤 패턴

		Car heeAudi = factory.createCar();
		Car jinAudi = factory.createCar();

		System.out.println(heeAudi.getCarId());
		System.out.println(jinAudi.getCarId());
	}

}

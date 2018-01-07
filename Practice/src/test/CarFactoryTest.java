package test;

public class CarFactoryTest {

	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
		
		Car hee = factory.createCar();
		Car jin = factory.createCar();
		System.out.println(hee.getCarNum());
		System.out.println(jin.getCarNum());
		
		

	}

}

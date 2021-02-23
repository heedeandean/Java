package hello;

import java.util.HashMap;

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}

	public Car createCar(String name) {
		Car c = new Car();
		return c;
	}
}

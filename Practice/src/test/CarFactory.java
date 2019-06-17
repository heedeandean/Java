package test;

import java.util.HashMap;

public class CarFactory {
	public static CarFactory instance = new CarFactory();
	HashMap<String, Car> hm = new HashMap<>();
	
	public CarFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null)
			instance = new CarFactory();
		return instance;
	}
	
	public Car createCar(String name) {
		if(hm.containsKey(name)) {
			return hm.get(name);
		}
		Car car = new Car();
		hm.put(name, car);
		return car;
	}
	
}

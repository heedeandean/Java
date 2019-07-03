package test;

import java.util.HashMap;

public class CF {

	private static CF instance = new CF();
	HashMap<String, Car> hm = new HashMap<>();

	public CF() {
	};

	public static CF getInstance() {
		if (instance == null)
			instance = new CF();
		return instance;
	}

	public Car createCar(String name) {
		if (hm.containsKey(name)) {
			return hm.get(name);
		}
		Car c = new Car();
		hm.put(name, c);
		return c;

	}

}

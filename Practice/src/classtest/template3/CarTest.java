package classtest.template3;

import java.util.ArrayList;

public class CarTest {
	public static void main(String[] args) {
		
		ArrayList<Car> carList = new ArrayList<Car>();
		
		carList.add(new Audi());
		carList.add(new Benz());
		
		for(Car car : carList) {
			car.run();
			System.out.println("==========================");
		}
	}
}

package hello;

public class CarTest {

	public static void main(String[] args) {
		Car a = new AICar();
		a.run();
		
		System.out.println();
		
		Car m = new ManualCar();
		m.run();
	}

}

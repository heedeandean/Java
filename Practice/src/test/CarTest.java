package test;


public class CarTest {

	public static void main(String[] args) {
		CarFactory fac = CarFactory.getInstance();
		
		Car v1 = fac.createCar("희진차");
		Car v2 = fac.createCar("희진차");
		System.out.println(v1 == v2);
		
		Car a1 = fac.createCar("아빠차");
		Car a2 = fac.createCar("아빠차");
		System.out.println(a1 == a2);
		
		System.out.println(v1 == a1);
	
	}
}

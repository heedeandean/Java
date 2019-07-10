package test;

public class CT {

	public static void main(String[] args) {
		CF fac = CF.getInstance();
		Car a1 = fac.createCar("희진 차");
		Car a2 = fac.createCar("희진 차");
		System.out.println(a1 == a2);

		Car v1 = fac.createCar("아빠 차");
		Car v2 = fac.createCar("아빠 차");
		System.out.println(v1 == v2);

		System.out.println(a1 == v1);

	}

}

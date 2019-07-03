package test;

public class CT {

	public static void main(String[] args) {
		CF f = CF.getInstance();
		Car a1 = f.createCar("희진 차");
		Car a2 = f.createCar("희진 차");
		System.out.println(a1 == a2);

		Car v1 = f.createCar("현주 차");
		Car v2 = f.createCar("현주 차");
		System.out.println(v1 == v2);

		System.out.println(a1 == v1);
	}

}

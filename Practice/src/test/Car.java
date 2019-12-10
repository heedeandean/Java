package test;

public class Car {
	private static int serialNum = 10001;
	private int CarId;

	public Car() {
		CarId = serialNum;
		serialNum++;
	}

	public int getCarId() {
		return CarId;
	}

	public void setCarId(int carId) {
		CarId = carId;
	}

}

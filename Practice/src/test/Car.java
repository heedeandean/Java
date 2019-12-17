package test;

public class Car {
	private static int serialNum = 100001;
	int carNum;

	public Car() {
		carNum = serialNum;
		serialNum++;

	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Car.serialNum = serialNum;
	}

}

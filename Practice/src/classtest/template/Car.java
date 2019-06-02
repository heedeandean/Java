package classtest.template;

public abstract class Car {
	public abstract void drive();
	public abstract void wiper();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켬");
	}
	
	public void turnOff() {
		System.out.println("시동을 끔");
	}
	
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
}

package classtest.template2;

public class Benz extends Car {

	@Override
	public void start() {
		System.out.println("Benz 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println("Benz 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("Benz 멈춥니다.");
	}

	@Override
	public void turnoff() {
		System.out.println("Benz 시동을 끕니다.");
	}
}

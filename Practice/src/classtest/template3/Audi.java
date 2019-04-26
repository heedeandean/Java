package classtest.template3;

public class Audi extends Car {

	@Override
	public void start() {
		System.out.println("Audi 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println("Audi 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("Audi 멈춥니다.");
	}

	@Override
	public void turnoff() {
		System.out.println("Audi 시동을 끕니다.");
	}
}

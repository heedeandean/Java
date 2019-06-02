package test;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행");
		System.out.println("자동차가 알아서 방향을 전환");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춤");
	}
	
}

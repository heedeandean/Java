package hello;

public class AICar extends Car {

	@Override 
	public void drive() {
		System.out.println("자율주행");
		System.out.println("자동차가 알아서~");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춤");
	}

	@Override
	public void wiper() {
		System.out.println("비나 눈의 양에 따라~");
	}
	
}

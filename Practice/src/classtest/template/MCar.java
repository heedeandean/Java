package classtest.template;

public class MCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전");
		System.out.println("사람이 핸들을 조작");
	}

	@Override
	public void wiper() {
		System.out.println("사람이 빠르기를 조절");
	}
	
	@Override
	public void stop() {
		System.out.println("브레이크로 정지");
	}
}

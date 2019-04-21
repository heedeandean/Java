package classtest.abstractex;

// 추상 클래스
public abstract class Car {
	
	// 추상 메서드
	public abstract void run();
	public abstract void refuel();
	
	// 구현 메서드
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
}

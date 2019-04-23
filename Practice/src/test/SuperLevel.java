package test;

public class SuperLevel extends PLevel {

	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 점프!");
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴 돕니다.");
	}

	@Override
	public void showLevelMsg() {
		System.out.println("==고급자 레벨==");
	}
	
}
package test;

public class BeginnerLevel extends PLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프 못함 ㅠㅠ");
	}

	@Override
	public void turn() {
		System.out.println("턴 못함 ㅜㅠㅠ");
	}

	@Override
	public void showLevelMsg() {
		System.out.println("==초보자 레벨==");
	}
	
}

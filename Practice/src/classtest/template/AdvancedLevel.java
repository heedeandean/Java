package classtest.template;

public class AdvancedLevel extends PLevel {

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 점프합니다.");
	}

	@Override
	public void turn() {
		System.out.println("턴 못함ㅠㅠ");
	}

	@Override
	public void showLevelMsg() {
		System.out.println("==중급자 레벨==");
	}
}

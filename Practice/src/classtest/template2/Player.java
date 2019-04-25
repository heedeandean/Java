package classtest.template2;

public class Player {
	private PLevel level;

	public Player() {
		level = new BeginnerLevel();
		level.showLevelMsg();
	}
	
	public PLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PLevel level) {
		this.level = level;
		level.showLevelMsg();
	}
	
	public void play(int cnt) {
		level.go(cnt);
	}
}

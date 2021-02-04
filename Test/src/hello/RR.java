package hello;

public class RR implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옴");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("순서대로");
	}
	
}

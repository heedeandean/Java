package hello;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옴");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무스킬 높은사람에게 우선적 배분");
	}
	
}

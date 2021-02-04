package hello;

import java.io.IOException;

public class STest {

	public static void main(String[] args) throws IOException{
		int ch = System.in.read();
		Scheduler s = null;
		
		if (ch == 'R' || ch == 'r') {
			s = new RR();
		}
		else if (ch == 'L' || ch == 'l') {
			s = new LeastJob();
		}
		else if (ch == 'P' || ch == 'p') {
			s = new PriorityAllocation();
		}
		else if (ch == 'A' || ch == 'a') {
			s = new AgentGetCall();
		}
		else {
			System.out.println("지원되지 않는 기능");
		}
		s.getNextCall();
		s.sendCallToAgent();
	}

}

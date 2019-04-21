package classtest.template;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("======자율주행 자동차==========");
		Car hee = new AICar();
		hee.run();

		System.out.println();
		
		System.out.println("======사람이 운전하는 자동차===========");
		Car jin = new MCar();
		jin.run();
	}
}

package classtest.template;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("======�������� �ڵ���==========");
		Car hee = new AICar();
		hee.run();

		System.out.println();
		
		System.out.println("======����� �����ϴ� �ڵ���===========");
		Car jin = new MCar();
		jin.run();
	}
}

package test;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("���� ����");
		System.out.println("�ڵ����� �˾Ƽ� ������ ��ȯ");
	}

	@Override
	public void stop() {
		System.out.println("������ ����");
	}
	
}

package classtest;

public class Person2Test {

	public static void main(String[] args) {
		
		// Person2Ŭ������ ����Ʈ ������ �־�� ��.
		Person2 jin = new Person2();
		jin.name = "����";
		jin.height = 180.0F;
		jin.weight = 85.5F;
		
		// �Ű������� �ִ� ������ �߰�. 
		// (�Ű������� �ֱ� ������ Person2Ŭ������ ����Ʈ ������ ��� ��.)
		Person2 hee = new Person2("����", 163, 52);
	}

}

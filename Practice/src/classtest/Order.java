package classtest;

public class Order {

	// Ŭ���� ��� ����.
	int orderId;
	String userId;
	String orderDate;
	String userName;
	String itemId;
	String userAddr;
	
	public static void main(String[] args) {
		Order o = new Order();
		
		o.orderId = 1;
		o.userId = "heedeandean";
		o.orderDate = "181118";
		o.userName = "����";
		o.itemId = "1";
		o.userAddr = "����";
		
		System.out.println("orderId : " + o.orderId);
		System.out.println("userId : " + o.userId);
		System.out.println("orderDate : " + o.orderDate);
		System.out.println("userName : " + o.userName);
		System.out.println("itemId : " + o.itemId);
		System.out.println("userAddr : " + o.userAddr);
	}
}

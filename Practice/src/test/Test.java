package test;

public class Test {

	String orderNo;
	String cusId;
	String orderDate;
	String cusName;
	String productNo;
	String cusAddr;
	
	public static void main(String[] args) {
		Test a = new Test();
		
		a.orderNo = "20191205";
		a.cusId = "heedeandean";
		a.orderDate = "2019년 12월 05일";
		a.cusName = "희딘딘";
		a.productNo = "PD0345-12";
		a.cusAddr = "서울시 마포구";

		System.out.println("주문번호 : " + a.orderNo);

	}

}

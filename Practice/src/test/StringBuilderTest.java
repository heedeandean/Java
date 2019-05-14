package test;

public class StringBuilderTest {

	public static void main(String[] args) {
		String heeStr = new String("히딘");
		System.out.println("heeStr 문자열 주소 : " + System.identityHashCode(heeStr));
		
		StringBuilder buffer = new StringBuilder(heeStr);
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" 빅데이터");
		buffer.append(" 성공하자!!");
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		System.out.println(buffer);
		
		heeStr = buffer.toString();
		System.out.println(heeStr);
		System.out.println("새로 만들어진 heeStr 문자열 주소 : " + System.identityHashCode(heeStr));
	}

}

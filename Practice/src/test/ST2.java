package test;

public class ST2 {

	public static void main(String[] args) {
		String javaStr = new String("java");
		String dbStr = new String("db");
		
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값 : " + System.identityHashCode(javaStr));
		
		System.out.println();
		
		javaStr = javaStr.concat(dbStr);
		
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값 : " + System.identityHashCode(javaStr));
		
	}

}

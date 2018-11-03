package study;

public class HelloJava {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		for (; i<=100; i++) {
			if (i % 2 == 0) 
				continue;
			
			sum += i;
		}
		System.out.println(sum);
	}
}

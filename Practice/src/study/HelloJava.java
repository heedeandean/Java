package study;

public class HelloJava {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		for(i=0; ; i++) {
			sum += i;
			
			if(sum >= 100)
				break;
		}
		System.out.println(i);
		System.out.println(sum);
	}
}

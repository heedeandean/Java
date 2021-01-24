package hello;

public class Test2 {

	public static void main(String[] args) {

		int[] num = new int[5];
		int total = 0;
		
		for(int i=0, j=2; i<num.length; i++, j+=2) {

			num[i] = j;
			total += num[i];
		}
		System.out.println(total);
		
		
	}

}

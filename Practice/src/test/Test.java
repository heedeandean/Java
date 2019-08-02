package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("이름:");
		String name = s.nextLine();
		System.out.println("직업:");
		String job = s.nextLine();
		System.out.println("사번:");
		int num = s.nextInt();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
	}

}

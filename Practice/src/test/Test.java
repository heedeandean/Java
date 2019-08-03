package test;

import java.io.Console;

public class Test {

	public static void main(String[] args) {
		Console c = System.console();
		
		System.out.println("이름 : ");
		String name = c.readLine();
		System.out.println("직업 : ");
		String job = c.readLine();
		
		System.out.println("비밀번호 : ");
		char[] pass = c.readPassword();
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}	

}

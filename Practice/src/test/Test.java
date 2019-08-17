package test;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("input.txt")) {
			byte[] bs = new byte[10];
			int i;
			while ((i = fis.read(bs)) != -1) {
				for (byte b : bs) {
					System.out.print((char) b);
				}
				System.out.println(": " + i + "바이트 읽음");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}

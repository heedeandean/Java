package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class aa {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("여기도 수행됩니다.");
	}

}

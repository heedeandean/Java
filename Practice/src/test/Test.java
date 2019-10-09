package test;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("writer.txt")) {
			fw.write('A');
			char buf[] = { 'B', 'C', 'D' };

			fw.write(buf);
			fw.write("하이요");
			fw.write(buf, 1, 2);
			fw.write("65");

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}

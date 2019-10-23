package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("a.txt");
				OutputStreamWriter osw = new OutputStreamWriter(fos)) {
			osw.write("빅데이터 가즈아");
		} catch (IOException e) {
			System.out.println(e);
		}

		System.out.println("a.txt 파일을 열어보셈");

	}

}

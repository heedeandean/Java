package test;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		try (FileOutputStream fos = new FileOutputStream("output.txt", true)) {
			byte[] bs = new byte[26];
			byte data = 65;
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력완료");
	}

}

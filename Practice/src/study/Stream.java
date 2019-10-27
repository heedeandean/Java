package study;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;

// FileOutputStream과 OutputStreamWriter을 활용하여 a.txt 파일에 출력해 보기. 

public class Stream {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("a.txt");
				OutputStreamWriter osw = new OutputStreamWriter(fos)) {
			osw.write("빅데이터 가자!");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}

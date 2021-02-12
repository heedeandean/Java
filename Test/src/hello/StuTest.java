package hello;

import java.util.HashSet;

public class StuTest {

	public static void main(String[] args) {
		HashSet<Stu> set = new HashSet<Stu>();
		set.add(new Stu("100", "홍길동"));
		
		System.out.println(set);
	}

}

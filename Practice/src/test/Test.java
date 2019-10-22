package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	private static final long serialVersionUID = -1503252402544036183L;
	String name;
	String job;

	public Person() {
	}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	public String toString() {
		return name + ", " + job;
	}
}

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		Person um = new Person("희딘딘", "대표이사");
		Person tae = new Person("턍이", "상무이사");

		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(um);
			oos.writeObject(tae);

		} catch (IOException e) {
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();

			System.out.println(p1);
			System.out.println(p2);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

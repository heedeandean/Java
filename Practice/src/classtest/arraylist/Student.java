package classtest.arraylist;

import java.util.ArrayList;

public class Student {
	int stuID;
	String stuName;
	ArrayList<Subject> subList;

	public Student(int stuID, String stuName) {
		this.stuID = stuID;
		this.stuName = stuName;
		subList = new ArrayList<Subject>();
	}

	public void addSub(String name, int score) {
		Subject sub = new Subject();
		sub.setName(name);
		sub.setScore(score);
		subList.add(sub);
	}

	public void showStuInfo() {
		int total = 0;

		for (Subject s : subList) {
			total += s.getScore();
			System.out.println("�л� " + stuName + "�� " + s.getName() + " ������ " + s.getScore() + "�� �Դϴ�.");
		}
		System.out.println();
		System.out.println("�л� " + stuName + "�� ������ " + total + "�� �Դϴ�.");
	}
}

package test;

import java.util.ArrayList;

public class Student {
	private int stuId;
	private String stuName;
	private Subject majorSub;

	private ArrayList<Score> scoreList = new ArrayList<Score>();

	public Student(int stuId, String stuName, Subject majorSub) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.majorSub = majorSub;
	}

	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Subject getMajorSub() {
		return majorSub;
	}

	public void setMajorSub(Subject majorSub) {
		this.majorSub = majorSub;
	}

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}

}

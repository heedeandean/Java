package test;

public class Score {
	int stuId;
	Subject sub;
	int point;

	public Score(int stuId, Subject sub, int point) {
		this.stuId = stuId;
		this.sub = sub;
		this.point = point;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public Subject getSub() {
		return sub;
	}

	public void setSub(Subject sub) {
		this.sub = sub;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String toString() {
		return "학번:" + stuId + ", " + sub.getSubName() + ":" + point;
	}

}

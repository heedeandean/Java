package test;

import java.util.ArrayList;

public class GenerateGradeReport {
	School school = School.getInstance();
	public static final String TITLE = " 수강생 학점 \t\t\n";
	public static final String HEADER = " 이름 | 학번 | 필수과목 | 점수 \n";
	public static final String LINE = "===========================\n";

	private StringBuffer buffer = new StringBuffer();

	public String getReport() {
		ArrayList<Subject> subList = school.getSubList();

		for (Subject sub : subList) {
			makeHeader(sub);
			makeBody(sub);
			makeFooter();
		}
		return buffer.toString();
	}

	public void makeHeader(Subject sub) {
		buffer.append(GenerateGradeReport.LINE);
		buffer.append("\t" + sub.getSubName());
		buffer.append(GenerateGradeReport.TITLE);
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE);
	}

	public void makeBody(Subject sub) {
		ArrayList<Student> stuList = sub.getStuList();

		for (int i = 0; i < stuList.size(); i++) {
			Student stu = stuList.get(i);
			buffer.append(stu.getStuName());
			buffer.append(" | ");
			buffer.append(stu.getStuId());
			buffer.append(" | ");
			buffer.append(stu.getMajorSub().getSubName() + "\t");
			buffer.append(" | ");

			getScoreGrade(stu, sub);

			buffer.append("\n");
			buffer.append(LINE);
		}
	}

	public void getScoreGrade(Student stu, Subject sub) {
		ArrayList<Score> scoreList = stu.getScoreList();
		int majorId = stu.getMajorSub().getSubId();

		GradeEvaluation[] gradeEvaluation = { new BasicEvaluation(), new MajorEvaluation(), new PassFailEvaluation() };

		for (int i = 0; i < scoreList.size(); i++) {
			Score score = scoreList.get(i);
			if (score.getSub().getSubId() == sub.getSubId()) {
				String grade;
				if (sub.getGradeType() == Define.PF_TYPE) {
					grade = gradeEvaluation[Define.PF_TYPE].getGrade(score.getPoint());
				} else {
					if (score.getSub().getSubId() == majorId)
						grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
					else
						grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
				}

				buffer.append(score.getPoint());
				buffer.append(":");
				buffer.append(grade);
				buffer.append("|");
			}
		}

	}

	public void makeFooter() {
		buffer.append("\n");
	}

}

package test;

public class Test {

	School heeSchool = School.getInstance();
	Subject korean;
	Subject math;
	Subject dance;

	GenerateGradeReport gradeReport = new GenerateGradeReport();

	public static void main(String[] args) {
		Test test = new Test();

		test.creatSub();
		test.creatStu();

		String report = test.gradeReport.getReport();
		System.out.println(report);

	}

	public void creatSub() {
		korean = new Subject("국어", Define.KOR);
		math = new Subject("수학", Define.MATH);
		dance = new Subject("방송 댄스", Define.DANCE);

		dance.setGradeType(Define.PF_TYPE);

		heeSchool.addSubject(korean);
		heeSchool.addSubject(math);
		heeSchool.addSubject(dance);

	}

	public void creatStu() {
		Student s1 = new Student(1, "김일수", korean);
		Student s2 = new Student(2, "김이수", math);
		Student s3 = new Student(3, "김삼수", korean);
		Student s4 = new Student(4, "김사수", korean);
		Student s5 = new Student(5, "김오수", math);

		heeSchool.addStudent(s1);
		heeSchool.addStudent(s2);
		heeSchool.addStudent(s3);
		heeSchool.addStudent(s4);
		heeSchool.addStudent(s5);

		korean.register(s1);
		korean.register(s2);
		korean.register(s3);
		korean.register(s4);
		korean.register(s5);

		math.register(s1);
		math.register(s2);
		math.register(s3);
		math.register(s4);
		math.register(s5);

		dance.register(s1);
		dance.register(s2);
		dance.register(s3);

		addScoreForStu(s1, korean, 95);
		addScoreForStu(s1, math, 56);
		addScoreForStu(s1, dance, 95);

		addScoreForStu(s2, korean, 95);
		addScoreForStu(s2, math, 95);
		addScoreForStu(s2, dance, 85);

		addScoreForStu(s3, korean, 100);
		addScoreForStu(s3, math, 88);
		addScoreForStu(s3, dance, 55);

		addScoreForStu(s4, korean, 89);
		addScoreForStu(s4, math, 95);

		addScoreForStu(s5, korean, 85);
		addScoreForStu(s5, math, 56);

	}

	public void addScoreForStu(Student stu, Subject sub, int point) {
		Score score = new Score(stu.getStuId(), sub, point);
		stu.addSubjectScore(score);
	}

}

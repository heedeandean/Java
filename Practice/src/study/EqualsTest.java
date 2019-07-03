package study;

class MyDate {
	int day;
	int month;
	int year;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof MyDate) {
			MyDate date = (MyDate) obj;
			return ((this.day == date.day) && (this.month == date.month) && (this.year == date.year));
		} else
			return false;
	}

	@Override
	public int hashCode() {
		return year;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(11, 4, 1994);
		MyDate date2 = new MyDate(11, 4, 1994);

		System.out.println(date1.equals(date2));

		System.out.println("date1의  hashCode : " + date1.hashCode());
		System.out.println("date2의  hashCode : " + date2.hashCode());
	}
}

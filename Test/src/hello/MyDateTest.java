package hello;

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
		if(obj instanceof MyDate) {
			MyDate s = (MyDate)obj;
			if(this.day == s.day & this.month == s.month & this.year == s.year)
				return true;
			else return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return day + month + year;
	}
}

public class MyDateTest {

	public static void main(String[] args) {
		MyDate m1 = new MyDate(9, 19, 2004);
		MyDate m2 = new MyDate(9, 19, 2004);
		System.out.println(m1.equals(m2));
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
	}

}

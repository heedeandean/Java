package study;

class Birth {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}
	
public class HiJava {
	public static void main(String[] args) {
		Birth b = new Birth();
		b.setYear(2018);
		System.out.println(b);
		b.printThis();
	}
}

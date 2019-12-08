package test;

public class TakeTrans {

	public static void main(String[] args) {
		Student hee = new Student("hee", 5000);
		Student deandean = new Student("deandean", 10000);

		Bus bus100 = new Bus(100);
		hee.takeBus(bus100);
		hee.showInfo();
		bus100.showInfo();

		System.out.println();

		Subway sub7 = new Subway("7호선");
		deandean.takeSubway(sub7);
		deandean.showInfo();
		sub7.showInfo();
	}

}

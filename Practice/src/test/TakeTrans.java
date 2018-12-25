package test;

public class TakeTrans {

	public static void main(String[] args) {
		Stu hee = new Stu("hee", 5000);
		Stu jin = new Stu("jin", 10000);
		Stu um = new Stu("um", 20000);
		
		Bus bus100 = new Bus(100);
		hee.takeBus(bus100);
		hee.showInfo();
		bus100.showInfo();
		
		System.out.println();
		
		Subway subwayGreen = new Subway("7È£¼±");
		jin.takeSubway(subwayGreen);
		jin.showInfo();
		subwayGreen.showInfo();
		
		System.out.println();
		
		Taxi taxi01 = new Taxi(01);
		um.takeTaxi(taxi01);
		um.showInfo();
		taxi01.showInfo();
		
	}

}

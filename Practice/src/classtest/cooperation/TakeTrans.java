package classtest.cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		
		// 학생 3명 생성.
		Student ha = new Student("ha", 5000);
		Student heejin = new Student("heejin", 10000);
		Student rara = new Student("rara", 10000);
		
		
		Bus bus100 = new Bus(100); 				  // 100번 버스 생성
		ha.takeBus(bus100);		   		  	  // ha가 100번 버스를 탐
		ha.showInfo(); 			   			  // ha 정보 출력
		bus100.showInfo(); 		   			  // 버스 정보 출력
		
		System.out.println();
		
		Subway subwayGreen = new Subway("7호선"); 		 // 7호선 지하철 생성
		heejin.takeSubway(subwayGreen);			  	  // heejin이 7호선 지하철 탐
		heejin.showInfo();					  // heejin 정보 출력
		subwayGreen.showInfo();					  // 지하철 정보 출력
		
		System.out.println();
		
		Taxi taxi1 = new Taxi(1); 		 		  // 1번 택시 생성
		rara.takeTaxi(taxi1);			  	 	  // rara가 1번 택시 탐
		rara.showInfo();					  // rara 정보 출력
		taxi1.showInfo();					  // 택시 정보 출력
	}
}

package study;

public class HiJava {
	public static void main(String[] args) {
		int floor = 3;
		String store;
		
		switch(floor) {
		 case 1 : store = "약국";
		 	break;
		 case 2 : store = "정형외과";
		 	break;
		 case 3 : store = "피부과";
		 	break;
		 case 4 : store = "치과";
		 	break;
		 case 5 : store = "헬스 클럽";
		 	break;
		 default:
			 store = "존재하지 않는 층";
			 break;
		}
		
		System.out.println(floor + "층은 " + store + "입니다.");
		

	}
}

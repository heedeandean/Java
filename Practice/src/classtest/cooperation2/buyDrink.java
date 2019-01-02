package classtest.cooperation2;

public class buyDrink {

	public static void main(String[] args) {
		Customer kim = new Customer("kim", 5000);
		Customer lee = new Customer("lee", 5000);
		
		StarCafe starAme = new StarCafe("아메리카노");
		kim.buyStarCafe(starAme);
		kim.showInfo();
		starAme.showInfo();
		
		System.out.println();
		
		CongCafe conglatte = new CongCafe("라떼");
		lee.buyCongCafe(conglatte);
		lee.showInfo();
		conglatte.showInfo();

	}
}

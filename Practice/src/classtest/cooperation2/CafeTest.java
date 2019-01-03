package classtest.cooperation2;

public class CafeTest {

	public static void main(String[] args) {
		
		Customer kim = new Customer("kim", 5000);
		Customer lee = new Customer("lee", 5000);
		
		StarCafe sCafe = new StarCafe();
		CongCafe cCafe = new CongCafe();
		
		kim.buyStarCafe(sCafe, 4000);
		lee.buyCongCafe(cCafe, 4500);
		
	}
}

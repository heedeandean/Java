package collectionframework.collection;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap mhm = new MemberHashMap();
		
		Member m1 = new Member(1, "김일수");
		Member m2 = new Member(2, "김이수");
		Member m3 = new Member(3, "김삼수");
		Member m4 = new Member(4, "김사수");
		
		mhm.addMember(m1);
		mhm.addMember(m2);
		mhm.addMember(m3);
		mhm.addMember(m4);
		
		mhm.showAllMember();
		
		mhm.removeMember(4);
		mhm.showAllMember();
		
	}	

}

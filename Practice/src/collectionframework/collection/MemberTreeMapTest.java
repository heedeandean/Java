package collectionframework.collection;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap mtm = new MemberTreeMap();
		
		Member m1 = new Member(1, "김일수");
		Member m2 = new Member(2, "김이수");
		Member m3 = new Member(3, "김삼수");
		Member m4 = new Member(4, "김사수");
		
		mtm.addMember(m1);
		mtm.addMember(m2);
		mtm.addMember(m3);
		mtm.addMember(m4);
		
		mtm.showAllMember();
		
		Member m5 = new Member(5, "김오수");
		mtm.addMember(m5);
		mtm.removeMember(3);
		mtm.showAllMember();
		
	}

}

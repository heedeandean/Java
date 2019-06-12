package collectionframework.collection.treeset;

import collectionframework.collection.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet mts = new MemberTreeSet();
		
		Member m3 = new Member(3, "김삼수");
		Member m1 = new Member(1, "김일수");
		Member m2 = new Member(2, "김이수");
		
		mts.addMember(m1);
		mts.addMember(m2);
		mts.addMember(m3);
		mts.showAllMember();
		
		Member m4 = new Member(1, "하하");
		mts.addMember(m4);
		mts.showAllMember();
	}
}

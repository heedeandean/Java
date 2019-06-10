package classtest.collectionframework.collection.hashset;

import classtest.collectionframework.collection.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member m1 = new Member(1, "김일수");
		Member m2 = new Member(2, "김이수");
		Member m3 = new Member(3, "김삼수");
		
		memberHashSet.addMember(m1);
		memberHashSet.addMember(m2);
		memberHashSet.addMember(m3);
		memberHashSet.showAllMember();
		
		Member m4 = new Member(3, "중복"); // 아이디 중복 회원 추가
		memberHashSet.addMember(m4);
		memberHashSet.showAllMember();
	}
}

package classtest.collectionframework.collection.arraylist;

import classtest.collectionframework.collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList mArrayList = new MemberArrayList();
		
		Member m1 = new Member(1, "엄희진");
		Member m2 = new Member(2, "류준열");
		Member m3 = new Member(3, "이형재");
		Member m4 = new Member(4, "김미경");
		Member m5 = new Member(5, "김존버");
		
		mArrayList.addMember(m1);
		mArrayList.addMember(m2);
		mArrayList.addMember(m3);
		mArrayList.addMember(m4);
		mArrayList.showAllMember();
		
		mArrayList.insertMember(m5, 1);
		mArrayList.showAllMember();
		
		mArrayList.removeMember(m4.getMemberId());
		mArrayList.showAllMember();
	}
}

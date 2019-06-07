package classtest.collectionframework.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import classtest.collectionframework.collection.Member;

public class MemberHashSet {
	private HashSet<Member> h;
	
	public MemberHashSet() {
		h = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		h.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = h.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				h.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : h) {
			System.out.println(member);
		}
		System.out.println();
	}
}

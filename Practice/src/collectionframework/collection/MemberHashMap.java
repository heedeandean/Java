package collectionframework.collection;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	private HashMap<Integer, Member> h;
	
	public MemberHashMap() {
		h = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		h.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(h.containsKey(memberId)) {
			h.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = h.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = h.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}

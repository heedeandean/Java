package test;

import java.util.ArrayList;


public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	// 회원 추가 메서드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public void insertMember(Member member, int index) {
		if(index < 0 || index > arrayList.size()) {
			System.out.println("존재하지 않는 index값입니다!");
			return;
		}
		arrayList.add(index, member);
	}
	
	// 회원 제거 메서드
	public boolean removeMember(int memberId) {
		
//		// 방법1. Iterator(순서X, 순회)
//		Iterator<Member> ir = arrayList.iterator();
//		
//		while(ir.hasNext()) {
//			Member member = ir.next();
//			
//			int tempId = member.getMemberId();
//			if(tempId == memberId) {
//				arrayList.remove(member);
//				return true;
//			}
//		}
		
		// 방법2. get()메서드(순서O, 순차적으로 하나씩 꺼냄)
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	// 전체 회원을 출력하는 메서드
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}

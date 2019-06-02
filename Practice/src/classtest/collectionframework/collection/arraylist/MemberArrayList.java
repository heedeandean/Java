package classtest.collectionframework.collection.arraylist;

import java.util.ArrayList;

import classtest.collectionframework.collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	// 회원 추가 메서드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	// 특정 위치에 회원 추가 메서드
	public void insertMember(Member member, int index) {
		if(index < 0 || index > arrayList.size()) {
			System.out.println("입력한 index위치에 추가할 수 없습니다.");
			return;
		}
		arrayList.add(index, member);
	}
	
	// 회원 제거 메서드
	public boolean removeMember(int memberId) {
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
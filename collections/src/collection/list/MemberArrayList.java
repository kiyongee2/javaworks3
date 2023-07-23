package collection.list;

import java.util.ArrayList;
import java.util.List;

import collection.member.Member;

//Memeber를 관리하는 클래스(CRUD)
public class MemberArrayList {
	
	private List<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>(); 
	}
	
	//회원 생성
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//회원 전체 목록
	public void showAllMember(){
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
	
}

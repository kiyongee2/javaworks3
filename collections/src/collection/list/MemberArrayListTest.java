package collection.list;

import collection.member.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberList = new MemberArrayList();
		
		//회원 생성
		memberList.addMember(new Member(1001, "안산"));
		memberList.addMember(new Member(1002, "이강인"));
		memberList.addMember(new Member(1002, "류현진"));
		
		//목록 조회
		memberList.showAllMember();
		
		
	}

}

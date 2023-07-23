package collection.map;

import collection.member.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberMap = new MemberHashMap();
		
		//회원 생성
		memberMap.addMember(new Member(1001, "안산"));
		memberMap.addMember(new Member(1002, "이강인"));
		memberMap.addMember(new Member(1002, "류현진"));
		
		//회원 목록
		memberMap.showAllMember();
	}

}

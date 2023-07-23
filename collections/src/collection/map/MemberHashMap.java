package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import collection.member.Member;

//Member 관리를 HashMap - 자료구조로 관리
public class MemberHashMap {
	
	Map<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	//회원 생성
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	//회원 목록
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();  //다음 키가 있으면 가져옴
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
}








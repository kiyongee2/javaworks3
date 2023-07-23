package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapSample {

	public static void main(String[] args) {
		Map<String, Integer> map =  new HashMap<>();
		
		map.put("이순신", 95);
		map.put("홍길동", 80);
		map.put("세종대왕", 100);
		
		System.out.println(map.size());
		
		//"홍길동" 의 점수 검색
		int score = map.get("홍길동");
		System.out.println(score);
		
		//"이순신" 삭제
		System.out.println(map.remove("이순신"));
		
		//전체 조회
		Set<String> keySet = map.keySet();
		Iterator<String> ir = keySet.iterator();
		while(ir.hasNext()) {
			String key = ir.next();
			Integer value = map.get(key);
			System.out.println(key + ", " + value);
		}
		System.out.println();
		
		System.out.println(map.values());  //리스트로 반환
		
		System.out.println(new ArrayList<>(map.values()));
	}

}

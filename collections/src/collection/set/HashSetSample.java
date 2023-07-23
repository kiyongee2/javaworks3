package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetSample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		//삽입
		set.add("Java");
		set.add("Jdbc");
		set.add("Servlet/JSP");
		set.add("Java");
		
		//총 객체수
		System.out.println(set.size());
		
		//요소 삭제
		set.remove("Jdbc");
		
		//조회
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}

}

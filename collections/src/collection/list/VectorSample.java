package collection.list;

import java.util.List;
import java.util.Vector;

public class VectorSample {
	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		
		Board board0 = list.get(0); //1개 검색(0번 인덱스)
		System.out.println(board0);
		
		System.out.println("======================");
		
		list.remove(list.get(2));  //2번 인덱스 삭제

		//전체 목록 조회
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board);
		}
	}
}
